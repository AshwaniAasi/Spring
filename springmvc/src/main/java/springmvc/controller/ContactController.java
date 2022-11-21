package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController
{
	@Autowired
	private UserService userService;
	
	//uses of @ModelAttribute 2nd way
//		@ModelAttribute
//		public void commonData(Model m)
//		{
//			m.addAttribute("H", "Ashwani Code");
//			m.addAttribute("O", "Ashwani the owner of this page");
//		}
	@RequestMapping("/contact")
	public String showForm(Model m) 
	{
		System.out.println("show form method");
		return "contact";
	}
	
//	@RequestMapping(path = "processform", method = RequestMethod.POST)
//	public String handleform(
//							@RequestParam(name="nameJSP", required = false) String userName, 
//							@RequestParam("emailJSP") String userEmail,
//							@RequestParam("passwordJSP") String userpassword, 
//							Model model
//							) {
//		System.out.println(userName);
//		System.out.println(userEmail);
//		System.out.println(userpassword);
//		/* 
//		model.addAttribute("N", userName);
//		model.addAttribute("E", userEmail);
//		model.addAttribute("P", userpassword);
//		*/
//		// or we can put this all into a class object like
//		User user=new User();
//		user.setNameJSP(userName);
//		user.setEmailJSP(userEmail);
//		user.setPasswordJSP(userpassword);
//		model.addAttribute(user);
//		return "success";
//	}
	//uses of @ModelAttribute 1st way
//	@RequestMapping(path="processform", method=RequestMethod.POST)
//	public String handleform(@ModelAttribute User user)
//	{
//		System.out.println(user);
//		return "success";
//	}
	
	@RequestMapping(path="processform", method=RequestMethod.POST)
	public String handleform(Model m , User user)
	{
		if(user.getNameJSP().isBlank())
		{
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		System.out.println(user);
		return "success";
	}
}