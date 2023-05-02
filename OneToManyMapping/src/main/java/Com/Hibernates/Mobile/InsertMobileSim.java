package Com.Hibernates.Mobile;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMobileSim {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jdinfo");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Sim s1=new Sim();
	s1.setId(11);
	s1.setProvider("jio");
	s1.setNumber(9963705259L);
	
	
	Sim s2=new Sim();
	s2.setId(12);
	s2.setProvider("idea");
	s2.setNumber(1234567890L);
	
	
	List <Sim> sims=new ArrayList<Sim>();
	sims.add(s2);
	sims.add(s1);
	
	Mobile m=new Mobile();
	m.setId(1);
	m.setName("one plus");
	m.setCost(40000);
	m.setSim(sims);
	
	entityTransaction.begin();
	entityManager.persist(m);
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityTransaction.commit();
}
}
