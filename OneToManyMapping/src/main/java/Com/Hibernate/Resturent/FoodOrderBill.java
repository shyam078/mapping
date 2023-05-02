package Com.Hibernate.Resturent;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FoodOrderBill {
	
	@Id
	private int id;
	private String address;
	private String customerName;
	private long Phone;
	
	@OneToMany
	List <Item> item;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "FoodOrderBill [id=" + id + ", address=" + address + ", customerName=" + customerName + ", Phone="
				+ Phone + ", item=" + item + "]";
	}
	
	
}
