package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-08-16T20:28:36.942+0530")
@StaticMetamodel(ContactRelationship.class)
public class ContactRelationship_ {
	public static volatile SingularAttribute<ContactRelationship, Integer> contactRelationshipId;
	public static volatile SingularAttribute<ContactRelationship, String> contactFirstName;
	public static volatile SingularAttribute<ContactRelationship, String> contactLastName;
	public static volatile SingularAttribute<ContactRelationship, String> contactMiddleName;
	public static volatile SingularAttribute<ContactRelationship, String> contactType;
	public static volatile SingularAttribute<ContactRelationship, Long> odsID;
	public static volatile SingularAttribute<ContactRelationship, String> preferredName;
	public static volatile SingularAttribute<ContactRelationship, String> relationshipType;
	public static volatile ListAttribute<ContactRelationship, ContactRelationshipAddress> contactRelationshipAddresses;
	public static volatile ListAttribute<ContactRelationship, ContactRelationshipEmail> contactRelationshipEmails;
	public static volatile ListAttribute<ContactRelationship, ContactRelationshipPhone> contactRelationshipPhones;
}
