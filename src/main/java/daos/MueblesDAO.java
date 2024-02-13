package daos;

import java.util.List;
import java.util.Map;

import jakarta.persistence.EntityManager;
import utils.JpaUtils;

public class MueblesDAO<T> implements Updatable<T> {
	private EntityManager em = JpaUtils.getEntityManager();
	private final Class<T> entityType=null;
	
	@Override
	public List<T> get() {
		
		List<T> muebles = em.createQuery("from Mueble").getResultList();
		
		return muebles;
	}

	@Override
	public T getByPK(long id) {
		T mueble = em.find(entityType, id);
		return mueble;
	}

	@Override
	public List<T> get(Map<String, Object> datos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(T objeto) {
		this.em.getTransaction().begin();
		try {
			em.persist(objeto);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			this.em.getTransaction().rollback();
		}
		
	}

	@Override
	public void update(T objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T objeto) {
		// TODO Auto-generated method stub
		
	}

	
	
}
