package Com.Hibernate.Resturent;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OrderItemMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jdinfo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item i1=new Item();
		i1.setId(1);
		i1.setName("Biryani");
		i1.setQty(1);
		i1.setCost(250);
		
		Item i2=new Item();
		i2.setId(2);
		i2.setName("panner");
		i2.setQty(1);
		i2.setCost(160);
		
		List <Item> items=new ArrayList<Item>();
		items.add(i1);
		items.add(i2);
		
		FoodOrderBill fob=new FoodOrderBill();
		fob.setId(101);
		fob.setCustomerName("shyam");
		fob.setAddress("hyd");
		fob.setPhone(123667763);
		fob.setItem(items);
		
		entityTransaction.begin();
		entityManager.persist(fob);
		entityManager.persist(i1);
		entityManager.persist(i2);
		entityTransaction.commit();
	}

}
