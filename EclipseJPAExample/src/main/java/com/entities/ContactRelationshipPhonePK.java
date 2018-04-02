package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CNTC_RLTNSHP_PH database table.
 * 
 */
@Embeddable
public class ContactRelationshipPhonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="CNTC_RLTNSHP_ID", insertable=false, updatable=false)
	private int contactRelationshipID;
	
	@Column(name="PH_TYP_TXT")
	private String phoneType;

	public ContactRelationshipPhonePK() {
	}

	public int getContactRelationshipID() {
		return contactRelationshipID;
	}

	public void setContactRelationshipID(int contactRelationshipID) {
		this.contactRelationshipID = contactRelationshipID;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContactRelationshipPhonePK)) {
			return false;
		}
		ContactRelationshipPhonePK castOther = (ContactRelationshipPhonePK)other;
		return 
			(this.contactRelationshipID == castOther.contactRelationshipID)
			&& this.phoneType.equals(castOther.phoneType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contactRelationshipID;
		hash = hash * prime + this.phoneType.hashCode();
		
		return hash;
	}
}