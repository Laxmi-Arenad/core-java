package com.xworkz.stadium.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.stadium.dto.StadiumDTO;
import com.xworkz.stadium.service.StadiumService;
@Controller
@RequestMapping("/")
public class StadiumController {
	
	@Autowired
	private StadiumService stadiumService;
	
private List<String> city = Arrays.asList("Ahmadabad","Kolkota","Raipur","Delhi","Thiruvanantapuram","Lucknow","Chennai");
private List<String> state=Arrays.asList("Jarkhand","Gujarat","Westbengal","Chhattisgarh","Delhi NCR","Kerala","Uttarpradesh","Tamilnadu");

	public StadiumController() {
	System.out.println("created " +this.getClass().getSimpleName());
	}
	
	@GetMapping("/stadium")
	public String onStadium(Model model) {
	System.out.println("Running onStadium on get method");
	model.addAttribute("city", city);
	model.addAttribute("state", state);
	return "Stadium";
		
	}

	
	@GetMapping("/stadiumSearch")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch in get method." + id);
		StadiumDTO dto=this.stadiumService.findById(id);
		if(dto !=null) {
		model.addAttribute("dto", dto);
		}
		else {
		model.addAttribute("message", "data not found");
		}
		return "StadiumSearch";
	}
	
    @PostMapping("/stadium")
    public String onStadium(StadiumDTO dto, Model model) {
    	System.out.println("Running onStadium on post method " + dto);
    	Set<ConstraintViolation<StadiumDTO>> violations = stadiumService.validateAndSave(dto);
    	if(violations.isEmpty()) {
    	System.out.println("No violations in controller go to success page..");
    	return "Stadium";
    	}
    	model.addAttribute("city", city);
    	model.addAttribute("state", state);
    	model.addAttribute("error", violations);
    	model.addAttribute("dto", dto);
    	System.out.println("Violations in controller");
    	return "Stadium";
    }
	
    @GetMapping("/searchbygames")
    public String onSearchGames(@RequestParam String games,Model model) {
    List<StadiumDTO>list=this.stadiumService.findByGames(games);
    	model.addAttribute("list",list);
    	
    	return"GamesSearch";
    }
}
