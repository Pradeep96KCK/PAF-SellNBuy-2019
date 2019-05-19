package org.o7planning.sbcrudrestful;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
@Controller
public class feedbackController {
	@Autowired
	private customerService cusService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<feedBack> listfeedback = cusService.listAll();
		model.addAttribute("listfeedback", listfeedback);
		
		return "index";
		
	}
	@RequestMapping("/new")
	public String showSendFeedbackForm(Model model) {
		feedBack feedback = new feedBack();
		model.addAttribute("feedback", feedback);
		return "new_feedback";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveFeedback(@ModelAttribute("feedback")feedBack feedback) {
		cusService.save(feedback);
		return "redirect:/";
	}
	
}
*/
@RestController
@RequestMapping("/")
@Service 
public class feedbackController{
	
	@Autowired
	private customerService cusService;
	
	@GetMapping("/feedback")
	public List<feedBack>findAll(){
		return cusService.findAll();
		
	}
	
	@PostMapping("/feedback")
	public feedBack addFeedback(@Valid @RequestBody feedBack feedback) {
		return cusService.save(feedback);
	}
	
	
	
	
	
}


