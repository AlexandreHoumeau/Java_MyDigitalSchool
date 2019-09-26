package fr.mds.hibernatedemo.dao;

import java.util.List;

import fr.mds.hibernatedemo.entity.Cat;
public interface CatDao {
	
	List<Cat> getAllCats();

	void addCat(Cat cat);
}
