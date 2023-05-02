package Com.Hibernate.ManyToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertHotelRoom {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jdinfo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hotel h=new Hotel();
		h.setId(11);
		h.setName("taj");
		h.setAddress("bang");
		
		Room r1=new Room();
		r1.setId(1);
		r1.setCapacity(3);
		r1.setHotel(h);
		
		Room r2= new Room();
		r2.setId(2);
		r2.setCapacity(2);
		r2.setHotel(h);
		
		entityTransaction.begin();
		entityManager.persist(h);
		entityManager.persist(r1);
		entityManager.persist(r2);
		entityTransaction.commit();
	}

}
