package com.yusufturan.services;

import java.util.List;

import com.yusufturan.dto.DtoEmployee;

public interface IEmployeeService {
	public List<DtoEmployee> findAllEmployees();
}
