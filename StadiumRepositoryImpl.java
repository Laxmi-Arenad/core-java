package com.xworkz.stadium.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.stadium.entity.StadiumEntity;

@Repository
public class StadiumRepositoryImpl implements StadiumRepository {
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public  StadiumRepositoryImpl() {
	System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(StadiumEntity entity) {
	System.out.println("running save in repository..."); 
	
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	transaction.begin();
	manager.persist(entity);
	transaction.commit();
	manager.close();
	return true;
		
	}
	
    @Override
	public StadiumEntity findById(int id) {
	System.out.println("Find by id in repo " + id);
	
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	StadiumEntity stadiumEntity = manager.find(StadiumEntity.class, id);
	manager.close();
	
	return stadiumEntity;
	}
    
@Override
	public List<StadiumEntity> findByGames(String games) {
	
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	//DECIDE :TX,Query?
	try {
		Query query =manager.createNamedQuery("findByGames");
		query.setParameter("gam", games);
		List<StadiumEntity>list=query.getResultList();
		System.out.println("Total List found in repo"+list.size());
	
	return list;
	
	}finally {
		manager.close();
  System.out.println("released the connection...")	;	
}
	}
@Override
public boolean update(StadiumEntity entity) {
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	//DECIDE
	try {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		return true;
		
	}finally {
	   manager.close();	
		
	}
	
	
	
}

}


