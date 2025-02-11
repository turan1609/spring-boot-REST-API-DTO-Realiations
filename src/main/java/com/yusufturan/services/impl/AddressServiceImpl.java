package com.yusufturan.services.impl;


import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yusufturan.dto.DtoAddress;
import com.yusufturan.dto.DtoCustomer;
import com.yusufturan.entities.Address;
import com.yusufturan.repository.AddressRepository;
import com.yusufturan.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public DtoAddress findAddressById(Long id) {
		
		DtoAddress dtoAddress = new DtoAddress();
		DtoCustomer dtoCustomer = new DtoCustomer();
		
		Optional<Address> optional = addressRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		
		Address address = optional.get();
		
		BeanUtils.copyProperties(address, dtoAddress);
		
		dtoCustomer.setId(address.getCustomer().getId());
		dtoCustomer.setName(address.getCustomer().getName());
		
		dtoAddress.setCustomer(dtoCustomer);
		
		
		return dtoAddress;
	}
	
}
	

