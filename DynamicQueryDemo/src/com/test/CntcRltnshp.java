package com.test;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the CNTC_RLTNSHP database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP")
@NamedQuery(name="CntcRltnshp.findAll", query="SELECT c FROM CntcRltnshp c")
public class CntcRltnshp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CNTC_RLTNSHP_ID")
	private int cntcRltnshpId;

	@Column(name="CNTC_FRST_NM")
	private String cntcFrstNm;

	@Column(name="CNTC_LST_NM")
	private String cntcLstNm;

	@Column(name="CNTC_MID_NM")
	private String cntcMidNm;

	@Column(name="CNTV_TYP_TXT")
	private String cntvTypTxt;

	@Column(name="O_WRK_ID")
	private BigInteger oWrkId;

	@Column(name="PFRD_NM")
	private String pfrdNm;

	@Column(name="RLTNSHP_TYP_TXT")
	private String rltnshpTypTxt;

	//bi-directional many-to-one association to CntcRltnshpAddr
	@OneToMany(mappedBy="cntcRltnshp", cascade={CascadeType.ALL})
	private List<CntcRltnshpAddr> cntcRltnshpAddrs;

	//bi-directional many-to-one association to CntcRltnshpEml
	@OneToMany(mappedBy="cntcRltnshp", cascade={CascadeType.ALL})
	private List<CntcRltnshpEml> cntcRltnshpEmls;

	//bi-directional many-to-one association to CntcRltnshpPh
	@OneToMany(mappedBy="cntcRltnshp", cascade={CascadeType.ALL})
	private List<CntcRltnshpPh> cntcRltnshpPhs;

	public CntcRltnshp() {
	}

	public int getCntcRltnshpId() {
		return this.cntcRltnshpId;
	}

	public void setCntcRltnshpId(int cntcRltnshpId) {
		this.cntcRltnshpId = cntcRltnshpId;
	}

	public String getCntcFrstNm() {
		return this.cntcFrstNm;
	}

	public void setCntcFrstNm(String cntcFrstNm) {
		this.cntcFrstNm = cntcFrstNm;
	}

	public String getCntcLstNm() {
		return this.cntcLstNm;
	}

	public void setCntcLstNm(String cntcLstNm) {
		this.cntcLstNm = cntcLstNm;
	}

	public String getCntcMidNm() {
		return this.cntcMidNm;
	}

	public void setCntcMidNm(String cntcMidNm) {
		this.cntcMidNm = cntcMidNm;
	}

	public String getCntvTypTxt() {
		return this.cntvTypTxt;
	}

	public void setCntvTypTxt(String cntvTypTxt) {
		this.cntvTypTxt = cntvTypTxt;
	}

	public BigInteger getOWrkId() {
		return this.oWrkId;
	}

	public void setOWrkId(BigInteger oWrkId) {
		this.oWrkId = oWrkId;
	}

	public String getPfrdNm() {
		return this.pfrdNm;
	}

	public void setPfrdNm(String pfrdNm) {
		this.pfrdNm = pfrdNm;
	}

	public String getRltnshpTypTxt() {
		return this.rltnshpTypTxt;
	}

	public void setRltnshpTypTxt(String rltnshpTypTxt) {
		this.rltnshpTypTxt = rltnshpTypTxt;
	}

	public List<CntcRltnshpAddr> getCntcRltnshpAddrs() {
		return this.cntcRltnshpAddrs;
	}

	public void setCntcRltnshpAddrs(List<CntcRltnshpAddr> cntcRltnshpAddrs) {
		this.cntcRltnshpAddrs = cntcRltnshpAddrs;
	}

	public CntcRltnshpAddr addCntcRltnshpAddr(CntcRltnshpAddr cntcRltnshpAddr) {
		getCntcRltnshpAddrs().add(cntcRltnshpAddr);
		cntcRltnshpAddr.setCntcRltnshp(this);

		return cntcRltnshpAddr;
	}

	public CntcRltnshpAddr removeCntcRltnshpAddr(CntcRltnshpAddr cntcRltnshpAddr) {
		getCntcRltnshpAddrs().remove(cntcRltnshpAddr);
		cntcRltnshpAddr.setCntcRltnshp(null);

		return cntcRltnshpAddr;
	}

	public List<CntcRltnshpEml> getCntcRltnshpEmls() {
		return this.cntcRltnshpEmls;
	}

	public void setCntcRltnshpEmls(List<CntcRltnshpEml> cntcRltnshpEmls) {
		this.cntcRltnshpEmls = cntcRltnshpEmls;
	}

	public CntcRltnshpEml addCntcRltnshpEml(CntcRltnshpEml cntcRltnshpEml) {
		getCntcRltnshpEmls().add(cntcRltnshpEml);
		cntcRltnshpEml.setCntcRltnshp(this);

		return cntcRltnshpEml;
	}

	public CntcRltnshpEml removeCntcRltnshpEml(CntcRltnshpEml cntcRltnshpEml) {
		getCntcRltnshpEmls().remove(cntcRltnshpEml);
		cntcRltnshpEml.setCntcRltnshp(null);

		return cntcRltnshpEml;
	}

	public List<CntcRltnshpPh> getCntcRltnshpPhs() {
		return this.cntcRltnshpPhs;
	}

	public void setCntcRltnshpPhs(List<CntcRltnshpPh> cntcRltnshpPhs) {
		this.cntcRltnshpPhs = cntcRltnshpPhs;
	}

	public CntcRltnshpPh addCntcRltnshpPh(CntcRltnshpPh cntcRltnshpPh) {
		getCntcRltnshpPhs().add(cntcRltnshpPh);
		cntcRltnshpPh.setCntcRltnshp(this);

		return cntcRltnshpPh;
	}

	public CntcRltnshpPh removeCntcRltnshpPh(CntcRltnshpPh cntcRltnshpPh) {
		getCntcRltnshpPhs().remove(cntcRltnshpPh);
		cntcRltnshpPh.setCntcRltnshp(null);

		return cntcRltnshpPh;
	}

}