package com.yusufturan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoRoom {
	private Long id;
	
	private String name;
	
	private DtoHome home;
}
