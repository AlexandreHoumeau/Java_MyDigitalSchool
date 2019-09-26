package fr.mds.hibernatedemo.dao;

import fr.mds.hibernatedemo.dao.jpa.JpaCatDao;

public class DaoFactory {

	public static CatDao getCatDao() {
		return new JpaCatDao();
	}
}
