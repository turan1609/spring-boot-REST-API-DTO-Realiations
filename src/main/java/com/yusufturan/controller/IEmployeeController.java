package com.yusufturan.controller;

import java.util.List;

import com.yusufturan.dto.DtoEmployee;

public interface IEmployeeController {
	public List<DtoEmployee> findAllEmployees();
}
