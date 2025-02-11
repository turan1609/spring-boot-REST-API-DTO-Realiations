package com.yusufturan.services;

import com.yusufturan.dto.DtoCustomer;

public interface ICustomerService {
	public DtoCustomer findCustomerById(Long id);
}
