package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) // using Model function to send data from controller to view
	{
		System.out.println("I m inside of home method of home controller class");
		model.addAttribute("name", "Ashwani Chaurasiya");
		model.addAttribute("id", 123);

		List<String> list = new ArrayList<String>();
		list.add("Sandhya");
		list.add("Saya");
		list.add("Sana");
		list.add("dhya");
		model.addAttribute("friends", list);

		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		List<String> office = new ArrayList<String>();
		office.add("India");
		office.add("Australia");
		office.add("Pakistan");
		office.add("Bangladesh");

		ModelAndView mav = new ModelAndView();
		mav.addObject("country", office);
		mav.setViewName("/about");
		return mav;
	}

	@RequestMapping("/service")
	public String service() {
		System.out.println("I am in service method");
		return "service";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mAV = new ModelAndView();
		mAV.addObject("name", "Ashwani");
		mAV.addObject("rollNo", 25465);

		LocalDateTime ldt = LocalDateTime.now();
		mAV.addObject("time", ldt);

		mAV.setViewName("/help");
		return mAV;
	}

}
