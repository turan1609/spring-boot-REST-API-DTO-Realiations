package com.yusufturan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yusufturan.controller.IHomeController;
import com.yusufturan.dto.DtoHome;
import com.yusufturan.services.IHomeService;

@RestController
@RequestMapping(path = "/rest/api/home")
public class HomeControllerImpl implements IHomeController {
	@Autowired
	private IHomeService homeService;
	
	@Override
	@GetMapping(path = "/{id}")
	public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
		return homeService.findHomeById(id);
	}
	
}
