package fr.mds.supcommerce.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.supcommerce.dao.ProductDAO;
import fr.mds.supcommerce.model.Product;

@SuppressWarnings("serial")
public class ListProductServelet extends HttpServlet {
	
	static ArrayList<Product> products = new ArrayList<>();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Product> products = ProductDAO.getAllProducts();
		
		for(Product p : products) {
			resp.getWriter().println(p.getId());
			resp.getWriter().println(p.getName());
			resp.getWriter().println();

		}
		
	}
}
