package Com.Hibernate.StudentSubject;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudentSubject {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jdinfo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Subject s1=new Subject();
		s1.setId(3);
		s1.setName("java");
		
		Subject s2=new Subject();
		s2.setId(4);
		s2.setName("sql");
		
		List<Subject> subjects=Arrays.asList(s1,s2);
		
		Student st1=new Student();
		st1.setId(2);
		st1.setName("shyam");
		st1.setSubject(subjects);
		
		entityTransaction.begin();
		entityManager.persist(st1);
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityTransaction.commit();
	}
}
