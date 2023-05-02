package PersonPan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shyam");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Pan p=entityManager.find(Pan.class, 2);
		System.out.println(p);
	}

}
