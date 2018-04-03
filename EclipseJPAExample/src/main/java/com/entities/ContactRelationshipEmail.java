package com.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CNTC_RLTNSHP_EML database table.
 * 
 */
@Entity
@Table(name="CNTC_RLTNSHP_EML")
@NamedQuery(name="ContactRelationshipEmail.findAll", query="SELECT c FROM ContactRelationshipEmail c")
public class ContactRelationshipEmail implements Serializable {
	private static final long serialVersionUID = 1L;
	private ContactRelationshipEmailPK id;
	private String emlAddrTxt;
	private ContactRelationship contactRelationship;

	public ContactRelationshipEmail() {
	}


	@EmbeddedId
	public ContactRelationshipEmailPK getId() {
		return this.id;
	}

	public void setId(ContactRelationshipEmailPK id) {
		this.id = id;
	}


	@Column(name="EML_ADDR_TXT")
	public String getEmlAddrTxt() {
		return this.emlAddrTxt;
	}

	public void setEmlAddrTxt(String emlAddrTxt) {
		this.emlAddrTxt = emlAddrTxt;
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