package com.test;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CNTC_RLTNSHP_ADDR database table.
 * 
 */
@Embeddable
public class CntcRltnshpAddrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CNTC_RLTNSHP_ID", insertable=false, updatable=false)
	private int cntcRltnshpId;

	@Column(name="ADDR_TYP_TXT")
	private String addrTypTxt;

	public CntcRltnshpAddrPK() {
	}
	public int getCntcRltnshpId() {
		return this.cntcRltnshpId;
	}
	public void setCntcRltnshpId(int cntcRltnshpId) {
		this.cntcRltnshpId = cntcRltnshpId;
	}
	public String getAddrTypTxt() {
		return this.addrTypTxt;
	}
	public void setAddrTypTxt(String addrTypTxt) {
		this.addrTypTxt = addrTypTxt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CntcRltnshpAddrPK)) {
			return false;
		}
		CntcRltnshpAddrPK castOther = (CntcRltnshpAddrPK)other;
		return 
			(this.cntcRltnshpId == castOther.cntcRltnshpId)
			&& this.addrTypTxt.equals(castOther.addrTypTxt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cntcRltnshpId;
		hash = hash * prime + this.addrTypTxt.hashCode();
		
		return hash;
	}
}