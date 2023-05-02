package PersonPan;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	private int id;
	private String fatherName;
	private String panNum;
	@OneToOne(cascade = CascadeType.PERSIST)
	
	@JoinColumn
	private Person person;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public Person getPerosn() {
		return person;
	}
	public void setPerosn(Person perosn) {
		this.person = perosn;
	}
	@Override
	public String toString() {
		return "Pan [id=" + id + ", fatherName=" + fatherName + ", panNum=" + panNum + "]";
	}
	
}
