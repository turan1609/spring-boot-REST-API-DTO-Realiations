package com.yusufturan.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoHome {
	private long id;
	
	private BigDecimal price;
	
	private List<DtoRoom> rooms = new ArrayList<>();
}
