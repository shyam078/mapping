package PersonPan;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shyam");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enetre the id to delete data");
	int id=scanner.nextInt();
	Pan person=entityManager.find(Pan.class, id);
	entityTransaction.begin();
	entityManager.remove(person);
	entityTransaction.commit();
	
	
	System.out.println("data deleted");
}
}
