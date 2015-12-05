package com.wx.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sign.class)
public abstract class Sign_ {

	public static volatile SingularAttribute<Sign, String> feedback;
	public static volatile SingularAttribute<Sign, String> customerId;
	public static volatile SingularAttribute<Sign, String> id;
	public static volatile SingularAttribute<Sign, Date> ClassTime;
	public static volatile SingularAttribute<Sign, String> coacherId;

}

