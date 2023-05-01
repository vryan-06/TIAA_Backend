package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Signup {	
	public Signup() {

	}
	@Id
    private String id;
    private String email;
    private String password;
    private String phone_number;
    private String address;
    private String selectedRole;
    private String bus_operator_name;
    private String driver_license_number;
    private String company_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBus_operator_name() {
		return bus_operator_name;
	}
	public void setBus_operator_name(String bus_operator_name) {
		this.bus_operator_name = bus_operator_name;
	}
	public String getDriver_license_number() {
		return driver_license_number;
	}
	public void setDriver_license_number(String driver_license_number) {
		this.driver_license_number = driver_license_number;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getSelectedRole() {
		return selectedRole;
	}
	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}
	@Override
	public String toString() {
		return "SignupDetails [id=" + id + ", email=" + email + ", password=" + password + ", phone_number="
				+ phone_number + ", address=" + address + ", selectedRole=" + selectedRole + ", bus_operator_name="
				+ bus_operator_name + ", driver_license_number=" + driver_license_number + ", company_name="
				+ company_name + "]";
	}    
}