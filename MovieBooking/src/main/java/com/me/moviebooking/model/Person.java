package com.me.moviebooking.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.me.moviebooking.validator.Phone;

public class Person {
	@Size(min=2, max=30) 
	private String firstName;
	@NotEmpty @Email
	private String lastName;
	@NotEmpty @Email
	private String email;
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull @Past
	private Date dob;
	@Phone
	private String phone;
	private int person_id;
	
	public Person(){
		super();
	}
	
	public Person(String firstName, String lastName, String email, Date dob,
			String phone, int person_id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.person_id = person_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
}
