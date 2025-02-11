package com.yusufturan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yusufturan.controller.IAddressController;
import com.yusufturan.dto.DtoAddress;
import com.yusufturan.services.IAddressService;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController{
	
	@Autowired
	private IAddressService addressService;
	
	@Override
	@GetMapping(path = "/list/{id}")
	public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {
		return addressService.findAddressById(id);
	}
	
}
