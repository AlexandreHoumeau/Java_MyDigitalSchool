package fr.mds.hibernatedemo.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.mds.hibernatedemo.dao.CatDao;
import fr.mds.hibernatedemo.entity.Cat;
import fr.mds.hibernatedemo.utilis.PersistenceManager;

public class JpaCatDao implements CatDao {

	@Override
	public void addCat(Cat cat){
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		EntityTransaction t = em.getTransaction();
		try {
			t.begin();
			//change date in db 
			em.persist(cat);
			t.commit();
		} finally {
			//always executed whatever the context
			if(t.isActive()) {
				t.rollback();
				
			}
			em.close();
		}
	}

	@Override
	public List<Cat> getAllCats() {
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		Query query = em.createQuery("SELECT c FROM Cat AS c");
		
		@SuppressWarnings("unchecked")
		List<Cat> cats = query.getResultList();
		return cats;
	}
}
