package fr.mds.hibernatedemo.utilis;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

	// singleton
	// Get only one distance of a specific object

	private static EntityManagerFactory emf = null;

	public static EntityManagerFactory getEntityManagerFactory() {

		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("HibernateDemoPu");
		}
		return emf;

	}

	public static void closeEmf() {
		if (emf != null && emf.isOpen()) {
			emf.close();
		}

	}
}
