package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	
	//Redirect Prefix method
	
//	@RequestMapping("/one")
//	public String one()
//	{
//		System.out.println("this is one method");
//		return "redirect:/two"; //Redirecting to second method
//	}
//	@RequestMapping("/two")
//	public String two()
//	{
//		System.out.println("this is second method");
//		return "";
//	}
	
	
	// RedirectView method
	@RequestMapping("/one")
	public RedirectView one()	{
		System.out.println("this is redirectView First method");
		RedirectView rV=new RedirectView();
//		rV.setUrl("two");
		//by redirectView method we can land to any url pages
		rV.setUrl("https://www.google.com"); 
		return rV;
	}
	
	@RequestMapping("/two")
	public String two()	{
		System.out.println("this is redirectView second method");
		return "";
	}
	
}
