package com.xworkz.beaches.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.beaches.DTO.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachController {

	public BeachController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

@PostMapping
  public String enjoyBeaches(BeachDTO beachDTO,Model model) {
	System.out.println("running enjoyBeaches"+beachDTO);
			model.addAttribute("name", beachDTO.getName());
			model.addAttribute("location", beachDTO.getLocation());
			model.addAttribute("clean", beachDTO.getClean());
			model.addAttribute("game", beachDTO.getGame());
			return "BeachSuccess.jsp";
}
}