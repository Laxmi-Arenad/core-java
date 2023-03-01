package com.xworkz.stadium.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.stadium.entity.StadiumEntity;
import com.xworkz.stadium.entity.StadiumEntity;

public interface StadiumRepository {
	
	boolean save(StadiumEntity entity);
	boolean update(StadiumEntity entity);

	default StadiumEntity findById(int id) {
		return null;
	}
	
	default List<StadiumEntity> findByGames(String games) {
		return Collections.emptyList();	
	}
   }


