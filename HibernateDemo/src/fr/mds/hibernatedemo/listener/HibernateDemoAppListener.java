package fr.mds.hibernatedemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.mds.hibernatedemo.utilis.PersistenceManager;

@WebListener
public class HibernateDemoAppListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("HibernateDemoAppListener -contextinitialized");
		
		PersistenceManager.getEntityManagerFactory();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("HibernateDemoAppListener -contextinitialized");
		PersistenceManager.closeEmf();

	}
}
