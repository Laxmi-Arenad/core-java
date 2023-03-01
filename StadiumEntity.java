package com.xworkz.stadium.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="stadium_table")
@NamedQuery(name="findByGames",query="select ent from StadiumEntity ent where ent.games=:gam")
public class StadiumEntity {
	
	@Id
	@Column(name="s_id")
	private int id;
	
	@Column(name="s_tracklength")
	private int tracklength;
	
	@Column(name="s_games")
	private String games;
	
	@Column(name="s_name")
	private String name;
	
	@Column(name="s_city")
	private String city;
	
	@Column(name="s_state")
	private String state;
	
    
    }

