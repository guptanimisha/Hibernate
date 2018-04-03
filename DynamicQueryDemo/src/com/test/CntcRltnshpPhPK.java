package com.test;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CNTC_RLTNSHP_PH database table.
 * 
 */
@Embeddable
public class CntcRltnshpPhPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CNTC_RLTNSHP_ID", insertable=false, updatable=false)
	private int cntcRltnshpId;

	@Column(name="PH_TYP_TXT")
	private String phTypTxt;

	public CntcRltnshpPhPK() {
	}
	public int getCntcRltnshpId() {
		return this.cntcRltnshpId;
	}
	public void setCntcRltnshpId(int cntcRltnshpId) {
		this.cntcRltnshpId = cntcRltnshpId;
	}
	public String getPhTypTxt() {
		return this.phTypTxt;
	}
	public void setPhTypTxt(String phTypTxt) {
		this.phTypTxt = phTypTxt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CntcRltnshpPhPK)) {
			return false;
		}
		CntcRltnshpPhPK castOther = (CntcRltnshpPhPK)other;
		return 
			(this.cntcRltnshpId == castOther.cntcRltnshpId)
			&& this.phTypTxt.equals(castOther.phTypTxt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cntcRltnshpId;
		hash = hash * prime + this.phTypTxt.hashCode();
		
		return hash;
	}
}