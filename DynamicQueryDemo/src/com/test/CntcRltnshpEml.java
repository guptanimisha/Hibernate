package com.test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CNTC_RLTNSHP_EML database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP_EML")
@NamedQuery(name="CntcRltnshpEml.findAll", query="SELECT c FROM CntcRltnshpEml c")
public class CntcRltnshpEml implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CntcRltnshpEmlPK id;

	@Column(name="EML_ADDR_TXT")
	private String emlAddrTxt;

	//bi-directional many-to-one association to CntcRltnshp
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="CNTC_RLTNSHP_ID")
	private CntcRltnshp cntcRltnshp;

	public CntcRltnshpEml() {
	}

	public CntcRltnshpEmlPK getId() {
		return this.id;
	}

	public void setId(CntcRltnshpEmlPK id) {
		this.id = id;
	}

	public String getEmlAddrTxt() {
		return this.emlAddrTxt;
	}

	public void setEmlAddrTxt(String emlAddrTxt) {
		this.emlAddrTxt = emlAddrTxt;
	}

	public CntcRltnshp getCntcRltnshp() {
		return this.cntcRltnshp;
	}

	public void setCntcRltnshp(CntcRltnshp cntcRltnshp) {
		this.cntcRltnshp = cntcRltnshp;
	}

}