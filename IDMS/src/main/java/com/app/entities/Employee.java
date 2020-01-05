package com.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString*/
@Entity
@Table(name = "Employee_Dtls")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 89438750834345L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_Id", unique  = true, nullable = false)
	private Long empId;
	
	@Column(name = "First_Name" , nullable = false )
	private String  firstName;
	@Column(name = "Middle_Name" , nullable = true)
	private String middleName;
	@Column(name = "Last_Name" , nullable = false)
	private String lastName;
	/*
	 * @Column(name = "Loc_Id" , nullable = false) private Long locationId;
	 */
	@Column(name = "SEX" , nullable = false )
	private String sex;
	
	/*
	 * @ManyToOne
	 * 
	 * @Column(name = "Employee_Company" ) private Company employer;
	 */
	
	@OneToMany(fetch = FetchType.LAZY , cascade =  CascadeType.ALL)
	@JoinColumn(name = "Employee_Id")
	private List<Contact> contacts;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public Employee() {
		super();
	}

	public Employee(Long empId) {
		super();
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", sex=" + sex + ", contacts=" + contacts + "]";
	}

}
