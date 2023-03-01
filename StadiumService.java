package com.xworkz.stadium.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.stadium.dto.StadiumDTO;

public interface StadiumService {
	
	Set<ConstraintViolation<StadiumDTO>>validateAndSave(StadiumDTO dto);
	Set<ConstraintViolation<StadiumDTO>>validateAndUpdate(StadiumDTO dto);

	default StadiumDTO findById(int id) {
	return null;
	}
	default List<StadiumDTO> findByGames(String games) {
		  return Collections.emptyList();
	}
}



