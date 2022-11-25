package productApp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productApp.Model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//get single product
	public Product getProduct(int pid)
	{
		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;
	}
	
	//get all products
	public List<Product> getAllProducts()
	{
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete single product
	@Transactional
	public void getDeleteProduct(int pid)
	{
		Product product = this.hibernateTemplate.get(Product.class, pid);
		hibernateTemplate.delete(product);
	}

}
