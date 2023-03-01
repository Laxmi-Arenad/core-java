package com.xworkz.stadium.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.stadium.dto.StadiumDTO;
import com.xworkz.stadium.entity.StadiumEntity;
import com.xworkz.stadium.repository.StadiumRepository;
@Service
public class StadiumServiceImpl implements StadiumService {
	
	@Autowired
	private StadiumRepository  stadiumRepository;
	
	public StadiumServiceImpl() {
	System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<StadiumDTO>> validateAndSave(StadiumDTO dto) {
    System.out.println("Running validateAndSave in service ");
    ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
    Validator validator=factory.getValidator();
    Set<ConstraintViolation<StadiumDTO>> violations = validator.validate(dto);
    	
    if(violations != null && !violations.isEmpty()) {
    System.out.println("Violations in dto " + dto);
    return violations;
    }
    
    else {
    System.out.println("There is no violations can save");
    StadiumEntity entity=new StadiumEntity();
    entity.setGames(dto.getGames());
    entity.setName(dto.getName());
    entity.setTracklength(dto.getTracklength());
    entity.setCity(dto.getCity());
    entity.setState(dto.getState());
    boolean saved=this.stadiumRepository.save(entity);
    System.out.println(saved);
    return Collections.emptySet();
    }
		
	}
	
	@Override
	public StadiumDTO findById(int id) {
		if(id>0) {
		StadiumEntity entity = this.stadiumRepository.findById(id);
		if(entity !=null) {
		System.out.println("Entity found in service for id " + id);
		StadiumDTO dto = new StadiumDTO();
		dto.setId(entity.getId());
		dto.setGames(entity.getGames());
		dto.setName(entity.getName());
		dto.setTracklength(entity.getTracklength());
		dto.setCity(entity.getCity());
		dto.setState(entity.getState());
		
		return dto;
		}
		}
		return StadiumService.super.findById(id);
		
		
	}
	@Override
   public List<StadiumDTO> findByGames(String games) {
		System.out.println("running findByGames in service"+games);
		if(games !=null && !games.isEmpty()) {
	System.out.println("Games is valid..calling repo..");
	List<StadiumEntity> entities= this.stadiumRepository.findByGames(games);
	//list<E>-->list<D>
	List<StadiumDTO>listOfDto=new ArrayList<StadiumDTO>();
	for(StadiumEntity entity:entities) {
			StadiumDTO dto = new StadiumDTO();
			dto.setId(entity.getId());
			dto.setGames(entity.getGames());
			dto.setName(entity.getName());
			dto.setTracklength(entity.getTracklength());
			dto.setCity(entity.getCity());
			dto.setState(entity.getState());
	        listOfDto.add(dto);
	        
	}
	System.out.println("size of dtos"+listOfDto.size());
	System.out.println("size of entities"+entities.size());
	return listOfDto;
	
	
 } else {
	System.err.println("games is invalid");
}
		return StadiumService.super.findByGames(games);
}
	

	@Override
	public Set<ConstraintViolation<StadiumDTO>> validateAndUpdate(StadiumDTO dto) {
    
    ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
    Validator validator=factory.getValidator();
    Set<ConstraintViolation<StadiumDTO>> violations = validator.validate(dto);
    	
    if(violations != null && !violations.isEmpty()) {
    System.err.println("Violations in DTO " + dto);
    return violations;
    }
    
    else {
    System.out.println("violations are not there in dto and can save data");
    StadiumEntity entity=new StadiumEntity();
    entity.setGames(dto.getGames());
    entity.setName(dto.getName());
    entity.setTracklength(dto.getTracklength());
    entity.setCity(dto.getCity());
    entity.setState(dto.getState());
    entity.setId(dto.getId());
    boolean saved=this.stadiumRepository.update(entity);
    System.out.println("Entity data is saved"+saved);
    return Collections.emptySet();
    }
}
	
}
	
	

