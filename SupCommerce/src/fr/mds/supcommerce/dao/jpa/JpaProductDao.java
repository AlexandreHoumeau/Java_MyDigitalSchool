package fr.mds.supcommerce.dao.jpa;

import java.util.List;

import fr.mds.supcommerce.entity.Product;
import fr.mds.supcormmerce.dao.ProductDao;

public class JpaProductDao implements ProductDao {
	
	
	@Override
	public void addProduct(Product product) {
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		try {
			em.persist(product);
			t.commit();
		} finally {
			if(t.isActive()) {
				t.rollback();
			}
		}
		em.close();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}	
}
