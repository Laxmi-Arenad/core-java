package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fooditem.DTO.InterviewDTO;

@Component
@RequestMapping("/attend")
public class InterviewComponent {

	
	public InterviewComponent() {
		System.out.println("created"+this.getClass().getSimpleName());
	
	}
	@PostMapping
	public String onAttend( InterviewDTO dto) {
		System.out.println("running onAttend");
		System.out.println("DTO is "+dto);
		return "Interview.jsp";
		
	}
}
