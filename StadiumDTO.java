package com.xworkz.stadium.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class StadiumDTO {
	
	private int id;

	@Size(min=3, max=20, message="Company must be more than 3 and less than 20")
	private String name;
	@NotEmpty(message="Type must be selected")
	private String games;
	private int tracklength;
	@NotEmpty(message="Country must be selected")
	private String city;
	@NotEmpty(message="Country must be selected")
	private  String state;
	
	
}
