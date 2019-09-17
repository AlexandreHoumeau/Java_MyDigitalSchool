package fr.mds.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.supcommerce.dao.ProductDAO;
import fr.mds.supcommerce.model.Product;

@SuppressWarnings("serial")
public class InsertSomeProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product product1 = new Product("Car", "a car", 1000);
		ProductDAO.addProduct(product1);
		resp.getWriter().println("Product added with id " + product1.getId());	
		}

}
