package uk.ac.napier.soc.ssd.coursework.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Program.class)
public abstract class Program_ {

	public static volatile SetAttribute<Program, Course> courses;
	public static volatile SingularAttribute<Program, String> name;
	public static volatile SingularAttribute<Program, Long> maxStudents;
	public static volatile SingularAttribute<Program, Long> id;
	public static volatile SingularAttribute<Program, Instant> startDate;

}

