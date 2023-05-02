package Com.Hibernate.ManyToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jdinfo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hotel h1=entityManager.find(Hotel.class,11);
		System.out.println("id :"+h1.getId());
		System.out.println("Address :"+h1.getAddress());
		System.out.println("Name :"+h1.getName());
		System.out.println("*******************");
		
	}

}
