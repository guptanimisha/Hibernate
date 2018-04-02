package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-08-01T23:37:02.460+0530")
@StaticMetamodel(ContactRelationshipAddress.class)
public class ContactRelationshipAddress_ {
	public static volatile SingularAttribute<ContactRelationshipAddress, ContactRelationshipAddressPK> id;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcAddrLne1;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcAddrLne2;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcAddrLne3;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcAddrLne4;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcCntry;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcCnty;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcCtyNm;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcPstlCd;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcStCd;
	public static volatile SingularAttribute<ContactRelationshipAddress, String> cntcStNm;
	public static volatile SingularAttribute<ContactRelationshipAddress, ContactRelationship> contactRelationship;
}
