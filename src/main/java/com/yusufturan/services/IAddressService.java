package com.yusufturan.services;

import com.yusufturan.dto.DtoAddress;

public interface IAddressService {
	public DtoAddress findAddressById(Long id);
}
