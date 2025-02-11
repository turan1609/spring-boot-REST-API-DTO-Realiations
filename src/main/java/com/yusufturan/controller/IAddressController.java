package com.yusufturan.controller;

import com.yusufturan.dto.DtoAddress;

public interface IAddressController {
	public DtoAddress findAddressById(Long id);
}
