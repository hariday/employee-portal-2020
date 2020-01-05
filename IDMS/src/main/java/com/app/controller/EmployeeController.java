package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.EmployeeDao;
import com.app.entities.Employee;
import com.app.request.EmployeeRequest;
import com.app.response.SucessResponse;


@RestController
@RequestMapping("/vendor")
public class EmployeeController {

	@Autowired
	private EmployeeDao empDao;
	@PostMapping(path = "/empDtls" , produces = "application/json" )
	public  SucessResponse employeeDtls(@RequestBody EmployeeRequest empReq) {
		System.out.println(empReq);
		Employee emp = empDao.employeeDtls(empReq);
		SucessResponse response = new SucessResponse();
		if(emp!=null)
		{
			response.setSucessMsg("Insert Successfully");
			response.setSucessCode(200);
			return response;
		}else {
			response.setSucessMsg("Insert UnSuccessfully");
			response.setSucessCode(100);
			return response;
		}
		
	}

}
