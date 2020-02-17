package uk.ac.napier.soc.ssd.coursework.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.napier.soc.ssd.coursework.domain.enumeration.EntryLevel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Enrollment.class)
public abstract class Enrollment_ {

	public static volatile SetAttribute<Enrollment, Course> courses;
	public static volatile SingularAttribute<Enrollment, Long> id;
	public static volatile SingularAttribute<Enrollment, EntryLevel> entryLevel;
	public static volatile SingularAttribute<Enrollment, User> user;

}

