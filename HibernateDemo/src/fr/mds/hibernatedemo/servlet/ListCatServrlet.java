package fr.mds.hibernatedemo.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.hibernatedemo.dao.DaoFactory;
import fr.mds.hibernatedemo.entity.Cat;

@SuppressWarnings({ "serial", "hiding" })
@WebServlet(urlPatterns = "/cat/all")
public class ListCatServrlet<Cat> extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	List<Cat> cats = DaoFactory.getCatDao().getAllCats();
	System.out.println(cats);
	}
}
