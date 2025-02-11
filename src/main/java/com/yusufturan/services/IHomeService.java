package com.yusufturan.services;

import com.yusufturan.dto.DtoHome;

public interface IHomeService{
	public DtoHome findHomeById(Long id);
}
