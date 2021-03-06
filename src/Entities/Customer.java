package Entities;
import Abstract.Entity;
import java.time.LocalDate;

public class Customer implements Entity {
	int id;
	String firstName;
	String lastName;
	String nickName;
	LocalDate dateOfBirth;
	String nationalityId;
	
	public Customer(int id, String firstName, String lastName, String nickName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	public Customer() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDateOfBirth(int i, int j, int k) {
		
		
	}
}
