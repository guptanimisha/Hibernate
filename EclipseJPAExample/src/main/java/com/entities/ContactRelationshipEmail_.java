package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-08-01T23:37:02.467+0530")
@StaticMetamodel(ContactRelationshipEmail.class)
public class ContactRelationshipEmail_ {
	public static volatile SingularAttribute<ContactRelationshipEmail, ContactRelationshipEmailPK> id;
	public static volatile SingularAttribute<ContactRelationshipEmail, String> emlAddrTxt;
	public static volatile SingularAttribute<ContactRelationshipEmail, ContactRelationship> contactRelationship;
}
