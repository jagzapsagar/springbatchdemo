package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@Column(name = "ID")
	private int id;
	@Transient
	// @Column(name = "FIRST_NAME")
	private String firstName;
	@Transient
	// @Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "Name")
	private String Name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "SALARY")
	private int salary;
	@Column(name = "AGE")
	private int age;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "Status")
	private String status;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, String name, String email, int salary, int age,
			String dob, String status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Name = name;
		this.email = email;
		this.salary = salary;
		this.age = age;
		this.dob = dob;
		this.status = status;
	}

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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Name=" + Name
				+ ", email=" + email + ", salary=" + salary + ", age=" + age + ", dob=" + dob + ", status=" + status
				+ "]";
	}

}
