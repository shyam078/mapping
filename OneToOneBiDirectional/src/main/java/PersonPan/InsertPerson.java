package PersonPan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shyam");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Person person=new Person();
		person.setId(1);
		person.setAge(24);
		person.setName("shyam");
		
		Pan pan=new Pan();
		pan.setId(2);
		pan.setPanNum("CAYPC6150R");
		pan.setFatherName("srinu");
		pan.setPerosn(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		System.out.println("data inserted");
		
	}

}
