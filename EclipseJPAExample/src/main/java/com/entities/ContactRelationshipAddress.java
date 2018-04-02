package com.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CNTC_RLTNSHP_ADDR database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP_ADDR")
@NamedQuery(name="ContactRelationshipAddress.findAll", query="SELECT c FROM ContactRelationshipAddress c")
public class ContactRelationshipAddress implements Serializable {
	private static final long serialVersionUID = 1L;
	private ContactRelationshipAddressPK id;
	private String cntcAddrLne1;
	private String cntcAddrLne2;
	private String cntcAddrLne3;
	private String cntcAddrLne4;
	private String cntcCntry;
	private String cntcCnty;
	private String cntcCtyNm;
	private String cntcPstlCd;
	private String cntcStCd;
	private String cntcStNm;
	private ContactRelationship contactRelationship;

	public ContactRelationshipAddress() {
	}


	@EmbeddedId
	public ContactRelationshipAddressPK getId() {
		return this.id;
	}

	public void setId(ContactRelationshipAddressPK id) {
		this.id = id;
	}


	@Column(name="CNTC_ADDR_LNE_1")
	public String getCntcAddrLne1() {
		return this.cntcAddrLne1;
	}

	public void setCntcAddrLne1(String cntcAddrLne1) {
		this.cntcAddrLne1 = cntcAddrLne1;
	}


	@Column(name="CNTC_ADDR_LNE_2")
	public String getCntcAddrLne2() {
		return this.cntcAddrLne2;
	}

	public void setCntcAddrLne2(String cntcAddrLne2) {
		this.cntcAddrLne2 = cntcAddrLne2;
	}


	@Column(name="CNTC_ADDR_LNE_3")
	public String getCntcAddrLne3() {
		return this.cntcAddrLne3;
	}

	public void setCntcAddrLne3(String cntcAddrLne3) {
		this.cntcAddrLne3 = cntcAddrLne3;
	}


	@Column(name="CNTC_ADDR_LNE_4")
	public String getCntcAddrLne4() {
		return this.cntcAddrLne4;
	}

	public void setCntcAddrLne4(String cntcAddrLne4) {
		this.cntcAddrLne4 = cntcAddrLne4;
	}


	@Column(name="CNTC_CNTRY")
	public String getCntcCntry() {
		return this.cntcCntry;
	}

	public void setCntcCntry(String cntcCntry) {
		this.cntcCntry = cntcCntry;
	}


	@Column(name="CNTC_CNTY")
	public String getCntcCnty() {
		return this.cntcCnty;
	}

	public void setCntcCnty(String cntcCnty) {
		this.cntcCnty = cntcCnty;
	}


	@Column(name="CNTC_CTY_NM")
	public String getCntcCtyNm() {
		return this.cntcCtyNm;
	}

	public void setCntcCtyNm(String cntcCtyNm) {
		this.cntcCtyNm = cntcCtyNm;
	}


	@Column(name="CNTC_PSTL_CD")
	public String getCntcPstlCd() {
		return this.cntcPstlCd;
	}

	public void setCntcPstlCd(String cntcPstlCd) {
		this.cntcPstlCd = cntcPstlCd;
	}


	@Column(name="CNTC_ST_CD")
	public String getCntcStCd() {
		return this.cntcStCd;
	}

	public void setCntcStCd(String cntcStCd) {
		this.cntcStCd = cntcStCd;
	}


	@Column(name="CNTC_ST_NM")
	public String getCntcStNm() {
		return this.cntcStNm;
	}

	public void setCntcStNm(String cntcStNm) {
		this.cntcStNm = cntcStNm;
	}


	//bi-directional many-to-one association to ContactRelationship
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="CNTC_RLTNSHP_ID")
	public ContactRelationship getContactRelationship() {
		return this.contactRelationship;
	}

	public void setContactRelationship(ContactRelationship contactRelationship) {
		this.contactRelationship = contactRelationship;
	}

}