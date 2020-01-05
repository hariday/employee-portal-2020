package com.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Contact_Dtls")
/*
 * @Getter
 * 
 * @Setter
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Builder
 * 
 * @ToString
 */
public class Contact implements Serializable{
	
	private static final long serialVersionUID = 97349374857830580L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Contact_Id")
	private Integer contactId;
	@Column(name = "Contact_Number" , unique = true)
	private Long contactNumber;
	@ManyToOne
	private Employee employee;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Contact() {
		super();
	}
	public Contact(Integer contactId) {
		super();
		this.contactId = contactId;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactNumber=" + contactNumber + ", employee=" + employee + "]";
	}
	
	
	
	

}
