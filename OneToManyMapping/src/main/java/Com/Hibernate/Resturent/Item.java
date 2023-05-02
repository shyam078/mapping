package Com.Hibernate.Resturent;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private int id;
	private String Name;
	private int Qty;
	private double Cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", Name=" + Name + ", Qty=" + Qty + ", Cost=" + Cost + "]";
	}
}
