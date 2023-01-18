package com.xworkz.lombok.service;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.lombok.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {
	
	@Override
	public boolean  validateAndSave(TerroristDTO dto) {
		System.out.println("started validate and save");
		
		System.out.println("DTO passes " +dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		
		Validator validator=factory.getValidator();
		
		Set<ConstraintViolation<TerroristDTO>>Violations=validator.validate(dto);
		
     if(!violations.isEmpty()) {
    	 System.out.println("Error in there");
    	 
    	 violations.forEach(ele->System.out.println(ele.getMessage()));
    	 
     }
     return false;
		
	}

}
