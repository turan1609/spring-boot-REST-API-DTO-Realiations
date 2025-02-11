package com.yusufturan.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
	
	private String firstName;
	
	private String lastName;
	
	private List<DtoCourse> courses = new ArrayList<>();
}
