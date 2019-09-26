package fr.mds.hibernatedemo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.hibernatedemo.dao.DaoFactory;
import fr.mds.hibernatedemo.entity.Cat;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/cat/persist")
public class PersitsCatServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PersistenceCatServlet - doPost");
		Cat cat = new Cat();
		cat.setName("Bob");
		cat.setColor("black");
		
		DaoFactory.getCatDao().addCat(cat);
	}
}
