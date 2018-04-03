package com.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CNTC_RLTNSHP_PH database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP_PH")
@NamedQuery(name="ContactRelationshipPhone.findAll", query="SELECT c FROM ContactRelationshipPhone c")
public class ContactRelationshipPhone implements Serializable {
	private static final long serialVersionUID = 1L;
	private ContactRelationshipPhonePK id;
	private String cntcPhNmbrTxt;
	private ContactRelationship contactRelationship;

	public ContactRelationshipPhone() {
	}


	@EmbeddedId
	public ContactRelationshipPhonePK getId() {
		return this.id;
	}

	public void setId(ContactRelationshipPhonePK id) {
		this.id = id;
	}


	@Column(name="CNTC_PH_NMBR_TXT")
	public String getCntcPhNmbrTxt() {
		return this.cntcPhNmbrTxt;
	}

	public void setCntcPhNmbrTxt(String cntcPhNmbrTxt) {
		this.cntcPhNmbrTxt = cntcPhNmbrTxt;
	}


	//bi-directional many-to-one association to ContactRelationship
	@ManyToOne
	@JoinColumn(name="CNTC_RLTNSHP_ID")
	public ContactRelationship getContactRelationship() {
		return this.contactRelationship;
	}

	public void setContactRelationship(ContactRelationship contactRelationship) {
		this.contactRelationship = contactRelationship;
	}

}