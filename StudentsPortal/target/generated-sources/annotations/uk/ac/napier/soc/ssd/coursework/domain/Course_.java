package uk.ac.napier.soc.ssd.coursework.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, String> description;
	public static volatile SingularAttribute<Course, Long> id;
	public static volatile SetAttribute<Course, Program> programs;
	public static volatile SingularAttribute<Course, String> title;
	public static volatile SetAttribute<Course, Enrollment> enrollments;

}

