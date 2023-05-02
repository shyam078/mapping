package Com.Hibernate.ManyToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	
	@Id
	private int id;
	private int capacity;
	
	@ManyToOne
	private Hotel hotel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", capacity=" + capacity + ", hotel=" + hotel + "]";
	}
	
	
}
