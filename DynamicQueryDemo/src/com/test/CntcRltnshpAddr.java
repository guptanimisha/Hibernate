package com.test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CNTC_RLTNSHP_ADDR database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP_ADDR")
@NamedQuery(name="CntcRltnshpAddr.findAll", query="SELECT c FROM CntcRltnshpAddr c")
public class CntcRltnshpAddr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CntcRltnshpAddrPK id;

	@Column(name="CNTC_ADDR_LNE_1")
	private String cntcAddrLne1;

	@Column(name="CNTC_ADDR_LNE_2")
	private String cntcAddrLne2;

	@Column(name="CNTC_ADDR_LNE_3")
	private String cntcAddrLne3;

	@Column(name="CNTC_ADDR_LNE_4")
	private String cntcAddrLne4;

	@Column(name="CNTC_CNTRY")
	private String cntcCntry;

	@Column(name="CNTC_CNTY")
	private String cntcCnty;

	@Column(name="CNTC_CTY_NM")
	private String cntcCtyNm;

	@Column(name="CNTC_PSTL_CD")
	private String cntcPstlCd;

	@Column(name="CNTC_ST_CD")
	private String cntcStCd;

	@Column(name="CNTC_ST_NM")
	private String cntcStNm;

	//bi-directional many-to-one association to CntcRltnshp
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="CNTC_RLTNSHP_ID")
	private CntcRltnshp cntcRltnshp;

	public CntcRltnshpAddr() {
	}

	public CntcRltnshpAddrPK getId() {
		return this.id;
	}

	public void setId(CntcRltnshpAddrPK id) {
		this.id = id;
	}

	public String getCntcAddrLne1() {
		return this.cntcAddrLne1;
	}

	public void setCntcAddrLne1(String cntcAddrLne1) {
		this.cntcAddrLne1 = cntcAddrLne1;
	}

	public String getCntcAddrLne2() {
		return this.cntcAddrLne2;
	}

	public void setCntcAddrLne2(String cntcAddrLne2) {
		this.cntcAddrLne2 = cntcAddrLne2;
	}

	public String getCntcAddrLne3() {
		return this.cntcAddrLne3;
	}

	public void setCntcAddrLne3(String cntcAddrLne3) {
		this.cntcAddrLne3 = cntcAddrLne3;
	}

	public String getCntcAddrLne4() {
		return this.cntcAddrLne4;
	}

	public void setCntcAddrLne4(String cntcAddrLne4) {
		this.cntcAddrLne4 = cntcAddrLne4;
	}

	public String getCntcCntry() {
		return this.cntcCntry;
	}

	public void setCntcCntry(String cntcCntry) {
		this.cntcCntry = cntcCntry;
	}

	public String getCntcCnty() {
		return this.cntcCnty;
	}

	public void setCntcCnty(String cntcCnty) {
		this.cntcCnty = cntcCnty;
	}

	public String getCntcCtyNm() {
		return this.cntcCtyNm;
	}

	public void setCntcCtyNm(String cntcCtyNm) {
		this.cntcCtyNm = cntcCtyNm;
	}

	public String getCntcPstlCd() {
		return this.cntcPstlCd;
	}

	public void setCntcPstlCd(String cntcPstlCd) {
		this.cntcPstlCd = cntcPstlCd;
	}

	public String getCntcStCd() {
		return this.cntcStCd;
	}

	public void setCntcStCd(String cntcStCd) {
		this.cntcStCd = cntcStCd;
	}

	public String getCntcStNm() {
		return this.cntcStNm;
	}

	public void setCntcStNm(String cntcStNm) {
		this.cntcStNm = cntcStNm;
	}

	public CntcRltnshp getCntcRltnshp() {
		return this.cntcRltnshp;
	}

	public void setCntcRltnshp(CntcRltnshp cntcRltnshp) {
		this.cntcRltnshp = cntcRltnshp;
	}

}