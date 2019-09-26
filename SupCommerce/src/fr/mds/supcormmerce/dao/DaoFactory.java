package fr.mds.supcormmerce.dao;

import fr.mds.supcommerce.dao.jpa.JpaProductDao;

public class DaoFactory {
	
	public static ProductDao getProductDao () {
		return new JpaProductDao();
	}
}
