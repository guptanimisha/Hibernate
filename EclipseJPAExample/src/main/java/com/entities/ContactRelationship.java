package com.entities;

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
@NamedQuery(name="ContactRelationship.findAll", query="SELECT c FROM ContactRelationship c")
public class ContactRelationship implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CNTC_RLTNSHP_ID")
	private int contactRelationshipId;
	
	@Column(name="CNTC_FRST_NM")
	private String contactFirstName;
	
	@Column(name="CNTC_LST_NM")
	private String contactLastName;
	
	@Column(name="CNTC_MID_NM")
	private String contactMiddleName;
	
	@Column(name="CNTV_TYP_TXT")
	private String contactType;
	
	@Column(name="O_WRK_ID")
	private long odsID;
	
	@Column(name="PFRD_NM")
	private String preferredName;
	
	@Column(name="RLTNSHP_TYP_TXT")
	private String relationshipType;
	
	//bi-directional many-to-one association to ContactRelationshipAddress
	@OneToMany(mappedBy="contactRelationship", cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<ContactRelationshipAddress> contactRelationshipAddresses;
	
	//bi-directional many-to-one association to ContactRelationshipEmail
	@OneToMany(mappedBy="contactRelationship",cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<ContactRelationshipEmail> contactRelationshipEmails;
	
	//bi-directional many-to-one association to ContactRelationshipPhone
	@OneToMany(mappedBy="contactRelationship",cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<ContactRelationshipPhone> contactRelationshipPhones;

	public ContactRelationship() {
	}

	public int getContactRelationshipId() {
		return contactRelationshipId;
	}

	public void setContactRelationshipId(int contactRelationshipId) {
		this.contactRelationshipId = contactRelationshipId;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactMiddleName() {
		return contactMiddleName;
	}

	public void setContactMiddleName(String contactMiddleName) {
		this.contactMiddleName = contactMiddleName;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public long getOdsID() {
		return odsID;
	}

	public void setOdsID(long oWrkId) {
		this.odsID = oWrkId;
	}

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public List<ContactRelationshipAddress> getContactRelationshipAddresses() {
		return contactRelationshipAddresses;
	}

	public void setContactRelationshipAddresses(
			List<ContactRelationshipAddress> contactRelationshipAddresses) {
		this.contactRelationshipAddresses = contactRelationshipAddresses;
	}

	public List<ContactRelationshipEmail> getContactRelationshipEmails() {
		return contactRelationshipEmails;
	}

	public void setContactRelationshipEmails(
			List<ContactRelationshipEmail> contactRelationshipEmails) {
		this.contactRelationshipEmails = contactRelationshipEmails;
	}

	public List<ContactRelationshipPhone> getContactRelationshipPhones() {
		return contactRelationshipPhones;
	}

	public void setContactRelationshipPhones(
			List<ContactRelationshipPhone> contactRelationshipPhones) {
		this.contactRelationshipPhones = contactRelationshipPhones;
	}

}