package com.test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CNTC_RLTNSHP_PH database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP_PH")
@NamedQuery(name="CntcRltnshpPh.findAll", query="SELECT c FROM CntcRltnshpPh c")
public class CntcRltnshpPh implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CntcRltnshpPhPK id;

	@Column(name="CNTC_PH_NMBR_TXT")
	private String cntcPhNmbrTxt;

	//bi-directional many-to-one association to CntcRltnshp
	@ManyToOne
	@JoinColumn(name="CNTC_RLTNSHP_ID")
	private CntcRltnshp cntcRltnshp;

	public CntcRltnshpPh() {
	}

	public CntcRltnshpPhPK getId() {
		return this.id;
	}

	public void setId(CntcRltnshpPhPK id) {
		this.id = id;
	}

	public String getCntcPhNmbrTxt() {
		return this.cntcPhNmbrTxt;
	}

	public void setCntcPhNmbrTxt(String cntcPhNmbrTxt) {
		this.cntcPhNmbrTxt = cntcPhNmbrTxt;
	}

	public CntcRltnshp getCntcRltnshp() {
		return this.cntcRltnshp;
	}

	public void setCntcRltnshp(CntcRltnshp cntcRltnshp) {
		this.cntcRltnshp = cntcRltnshp;
	}

}