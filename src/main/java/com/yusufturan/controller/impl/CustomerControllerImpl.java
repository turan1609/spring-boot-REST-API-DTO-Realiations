package com.yusufturan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yusufturan.controller.ICustomerController;
import com.yusufturan.dto.DtoCustomer;
import com.yusufturan.services.ICustomerService;
@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController{
	
	@Autowired
	private ICustomerService customerService; 
	
	@Override
	@GetMapping(path = "/list/{id}")
	public DtoCustomer findCustomerById(@PathVariable(name = "id")  Long id) {
		
		return customerService.findCustomerById(id);
	}

}
