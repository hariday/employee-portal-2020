package com.app.dao;

import com.app.entities.Employee;
import com.app.request.EmployeeRequest;

public interface EmployeeDao {
	
	public Employee employeeDtls(EmployeeRequest empReq);

}
