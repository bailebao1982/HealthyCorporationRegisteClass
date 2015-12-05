package com.wx.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TrainingClass.class)
public abstract class TrainingClass_ {

	public static volatile SingularAttribute<TrainingClass, String> trainingPlan;
	public static volatile SingularAttribute<TrainingClass, Boolean> schedule;
	public static volatile SingularAttribute<TrainingClass, String> Customer_ID;
	public static volatile SingularAttribute<TrainingClass, String> id;
	public static volatile SingularAttribute<TrainingClass, Date> classTime;
	public static volatile SingularAttribute<TrainingClass, String> Coacher_ID;

}

