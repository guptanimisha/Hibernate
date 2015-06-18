package com.mastertheboss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUtil;
import javax.persistence.Query;

public class TestJPQL {

	public static void main(String[] args) {
//      String file = "META-INF/dozerMapping.xml";     
//		HashMap testMap = new HashMap();
//		testMap.put("employeeNo", "1");
//		testMap.put("firstName", "Nimisha");
//		testMap.put("middleName", "X");
//		testMap.put("lastName", "Gupta");
//		testMap.put("city", "Pune");
//		
//		DozerBeanMapper mapper = new DozerBeanMapper(Arrays.asList(new String[]{file}));
//		Employee empObj = new Employee();
//		mapper.map(testMap, empObj, "myTestMapping");
//		
//		
//		System.out.println("employee first Name: " + empObj.getFirstName());
//		System.out.println("employee last name: " + empObj.getLastName());
//		System.out.println("employee middle name:" + empObj.getMiddleName());
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EclipseJPAExample");	
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e from employee e");
//		List<Employee> employees = (List<Employee>) q.getResultList();
//		for(Employee e: employees){
//			System.out.println("First Name" + e.getFirstName());
//		}
		
				

	}

}
