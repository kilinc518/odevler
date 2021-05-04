package Entities;

public class Customer {

	int id;
	String firstName;
	String lastName;
	int dateOfBirthYear;
	String nationalityId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}
	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
}
