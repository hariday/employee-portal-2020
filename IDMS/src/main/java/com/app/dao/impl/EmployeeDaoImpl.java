package com.app.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.EmployeeDao;
import com.app.entities.Contact;
import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;
import com.app.request.EmployeeRequest;
@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeRepository empRepo;
	@Override
	public Employee employeeDtls(EmployeeRequest empReq) {
		List<String>  contactList  = Arrays.asList(empReq.getContacts().split(","));
		List<Contact> contacts = new ArrayList<>();
		contactList.stream().forEach(c -> {
			Contact c1 = new Contact();
			c1.setContactNumber(Long.parseLong(c));
			contacts.add(c1);
		});
		Employee emp1 = new Employee();
		emp1.setContacts( contacts );
		emp1.setFirstName(empReq.getFirstName());
		emp1.setLastName(empReq.getLastName());
		emp1.setSex(empReq.getGender());
		emp1.setMiddleName(empReq.getMiddleName().length()>0?empReq.getMiddleName():" ");
		 return empRepo.save(emp1);
	}

}
