package fr.mds.hibernatedemo.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.hibernatedemo.entity.Cat;

@SuppressWarnings("serial")
public class PersitsCatServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cat cat = new Cat();
		cat.setName("Bob");
		cat.setColor("black");
		
		//PERSIST
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("My-PU");
		EntityManager em = emf.createEntityManager();
		
		em.persist(cat);
		em.close();
	}
}
