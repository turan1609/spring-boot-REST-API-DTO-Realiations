package com.yusufturan.controller;

import com.yusufturan.dto.DtoCustomer;

public interface ICustomerController {
	public DtoCustomer findCustomerById(Long id);
}
