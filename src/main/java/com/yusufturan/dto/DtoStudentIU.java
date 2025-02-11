package com.yusufturan.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
	@NotEmpty(message = "First Name area can't be empty")
	@NotNull(message = "First Name area can't be null")
	@Min(value = 3)
	@Max(value = 10)
	private String firstName;
	
	@Size(min = 3, max = 30)
	private String lastName;
	
	private Date birthOfDate;
	
	@Email(message = "Type in e-mail format")
	private String email;
	
	@Size(min = 11, max = 11, message = "TC area is 11 character.")
	@NotEmpty(message = "TC can't be empty")
	private String tcknString;
}
