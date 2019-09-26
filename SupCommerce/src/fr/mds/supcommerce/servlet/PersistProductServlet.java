package fr.mds.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.supcommerce.entity.Product;
import fr.mds.supcormmerce.dao.DaoFactory;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/product/persist")
public class PersistProductServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PersistenceProductServlet - doPost");
		Product product = new Product();
		product.setName("Voiture");
		
		DaoFactory.getProductDao().addProduct(product);
	
	}
}
