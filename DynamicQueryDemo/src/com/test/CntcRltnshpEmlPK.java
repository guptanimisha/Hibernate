package com.test;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CNTC_RLTNSHP_EML database table.
 * 
 */
@Embeddable
public class CntcRltnshpEmlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CNTC_RLTNSHP_ID", insertable=false, updatable=false)
	private int cntcRltnshpId;

	@Column(name="EML_TYP_TXT")
	private String emlTypTxt;

	public CntcRltnshpEmlPK() {
	}
	public int getCntcRltnshpId() {
		return this.cntcRltnshpId;
	}
	public void setCntcRltnshpId(int cntcRltnshpId) {
		this.cntcRltnshpId = cntcRltnshpId;
	}
	public String getEmlTypTxt() {
		return this.emlTypTxt;
	}
	public void setEmlTypTxt(String emlTypTxt) {
		this.emlTypTxt = emlTypTxt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CntcRltnshpEmlPK)) {
			return false;
		}
		CntcRltnshpEmlPK castOther = (CntcRltnshpEmlPK)other;
		return 
			(this.cntcRltnshpId == castOther.cntcRltnshpId)
			&& this.emlTypTxt.equals(castOther.emlTypTxt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cntcRltnshpId;
		hash = hash * prime + this.emlTypTxt.hashCode();
		
		return hash;
	}
}