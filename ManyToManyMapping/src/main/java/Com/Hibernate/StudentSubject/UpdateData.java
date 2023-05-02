package Com.Hibernate.StudentSubject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jdinfo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setId(1);
		student.setName("prasad");
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
