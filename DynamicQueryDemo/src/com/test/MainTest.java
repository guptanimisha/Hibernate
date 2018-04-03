package com.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-app");
		EntityManager em = emf.createEntityManager();
		try{
			EntityTransaction et = em.getTransaction();
			et.begin();
			// query begin
			CntcRltnshp result = em.find(CntcRltnshp.class, "1");
			System.out.println(result.getCntcLstNm());

			CntcRltnshp cntcRltnshp =  new CntcRltnshp();
			cntcRltnshp.setCntcFrstNm("Nirmal");
			cntcRltnshp.setCntcMidNm("Kumar");
			cntcRltnshp.setCntcLstNm("Gupta");
			cntcRltnshp.setCntvTypTxt("Father");
			cntcRltnshp.setPfrdNm("Papa");
			cntcRltnshp.setRltnshpTypTxt("Primary");

			CntcRltnshpAddr cntcRltnshpAddr = new CntcRltnshpAddr();
			cntcRltnshpAddr.se
			cntcRltnshp.addCntcRltnshpAddr(cntcRltnshpAddr);
			em.persist(cntcRltnshp);
			em.flush();

			et.commit();

		}
		finally{
			em.close();
		}
	}

}
