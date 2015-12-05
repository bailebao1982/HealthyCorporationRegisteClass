package com.wx.entity;

import java.sql.Date;
import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RegisterClass.class)
public abstract class RegisterClass_ {

	public static volatile SingularAttribute<RegisterClass, Boolean> deleteFlag;
	public static volatile SingularAttribute<RegisterClass, String> Customer;
	public static volatile SingularAttribute<RegisterClass, String> Coacher;
	public static volatile SingularAttribute<RegisterClass, String> Signature;
	public static volatile SingularAttribute<RegisterClass, String> id;
	public static volatile SingularAttribute<RegisterClass, String> place;
	public static volatile SingularAttribute<RegisterClass, Time> time;
	public static volatile SingularAttribute<RegisterClass, Date> classTime;

}

