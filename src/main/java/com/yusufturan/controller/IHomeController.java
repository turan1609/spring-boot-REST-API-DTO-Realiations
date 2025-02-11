package com.yusufturan.controller;

import com.yusufturan.dto.DtoHome;

public interface IHomeController {
	public DtoHome findHomeById(Long id);
}
