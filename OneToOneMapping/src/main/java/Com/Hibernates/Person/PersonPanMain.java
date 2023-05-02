package Com.Hibernates.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonPanMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shyam");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Pan person=entityManager.find(Pan.class, 11);
		System.out.println(person.getId());
		System.out.println(person.getFather_name());
		System.out.println(person.getPan_no());
		System.out.println(person.getPerson());
	}

}
