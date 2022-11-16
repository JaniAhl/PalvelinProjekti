package PalvelinProjekti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import PalvelinProjekti.domain.shiftHour;
import PalvelinProjekti.domain.MonthRepository;
import PalvelinProjekti.domain.HourRepository;
import PalvelinProjekti.domain.ShiftMonth;

@Controller
public class WorkHoursController {
	
	@Autowired 
	HourRepository hourRepository;
	@Autowired 
	MonthRepository monthRepository;
	
	@RequestMapping(value = "/login") // Login page
	public String login() {
		return "login";
	}

	@GetMapping(value = {"/", "index"}) // Mainpage load
	public String mainPage(Model model) {
		return "index";
	}
	
	@GetMapping("error") // Errorpage load
	public String errorPage(Model model) {
		return "error";
	}
	
	@GetMapping("hourlist") // Show all hours page
	public String hourList(Model model) {
		model.addAttribute("shiftHour", hourRepository.findAll());
		return "hourlist";
		
	}
	
	@GetMapping("addhours") // Add hours page
	public String addHour(Model model) {
		model.addAttribute("shiftHour", new shiftHour());
		model.addAttribute("ShiftMonths", monthRepository.findAll());
		return "addhours";
		
	}
	
	@PostMapping("save") // Save hours page
	public String saveHour(shiftHour shifthour) {
		hourRepository.save(shifthour);
		return "redirect:hourlist";
		
	}
	
	
	@RequestMapping("/edit/{shiftId}") // Edit hours 
	public String editHours(@PathVariable("shiftId") Long shiftId, Model model) {
		model.addAttribute("shiftHour", hourRepository.findById(shiftId));
		model.addAttribute("ShiftMonths", monthRepository.findAll());
		return "edithours";
	}
	
	
	@GetMapping("/delete/{id}") // Delete hours with a button
	public String deleteHour(@PathVariable("id") Long id, Model model) {
		hourRepository.deleteById(id);
		return "redirect:/hourlist";
		
	}
	
	@GetMapping("monthlist") // Show all months
	public String showMonths(Model model) {
		model.addAttribute("ShiftMonth", monthRepository.findAll());
		return "monthlist";
	}
	
	@GetMapping("/listbymonth/{id}") // List shifts by month
	public String listbyMonth(@PathVariable("id") Long id, Model model) {
		model.addAttribute("shiftHour", hourRepository.findAll());
		monthRepository.findById(id).ifPresent(o -> model.addAttribute("ShiftMonth", o));
		return "listbymonth";
	}
}


