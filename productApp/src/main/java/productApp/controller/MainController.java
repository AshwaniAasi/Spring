package productApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productApp.Dao.ProductDao;
import productApp.Model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model model)
	{
//		List<Product> allProducts = productDao.getAllProducts();
//		model.addAttribute("allProduct", allProducts);
		List<Product> allProducts = this.productDao.getAllProducts();
		model.addAttribute("allProduct", allProducts);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "AddProduct");
		return "addProduct";
	}
	
	//handle add product form
	@RequestMapping(path="handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request)
	{
		
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	// delete in handler form
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request)
	{
		this.productDao.getDeleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	// update in handler form
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable ("productId") int pid, Model model)
	{
		Product product= this.productDao.getProduct(pid);
		model.addAttribute("product", product);
		return "update_form";
	}

}
