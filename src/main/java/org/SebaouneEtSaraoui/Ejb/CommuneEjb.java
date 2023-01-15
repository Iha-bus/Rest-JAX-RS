package org.SebaouneEtSaraoui.Ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.SebaouneEtSaraoui.models.Commune;
import javax.persistence.Query;


@Stateless
public class CommuneEjb {
	@PersistenceContext(unitName ="tp-javaee")
	private EntityManager em;
	
	public long createCommune(Commune commune) {
		em.persist(commune);
		return commune.getId();
	}
	
	public Commune findById(long id) {
		/*String jpql2 = "SELECT * FROM commune.commune WHERE ID= 16" ;
		Query query2 = (Query) em.createQuery(jpql2);
		System.out.println((Commune) query2.getSingleResult());
		return (Commune) query2.getSingleResult();*/
		try {
            return (Commune) em.createNativeQuery("SELECT * FROM commune WHERE id = "+ id, Commune.class)
                      .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
	}
	
	
	public int updateCommune(Commune com) {
		 if(com == null){
	            throw new IllegalArgumentException("User object is null");
	        }
		   if (com != null){
			   com = em.merge(com);
	             return 0;
	        }
	        em.persist(com);
	        return -1;
	        }
	
	
	public Commune deleteById(long id) {
		try {
			Commune c = findById(id);
			em.remove(c);
             return c;
        } catch (NoResultException e) {
            return null;
        }

	}

	public List<Commune> findAll() {
	    try {
	        Query query3 = (Query) em.createQuery("SELECT c FROM Commune c");
	        List<Commune> ListCommune = query3.getResultList();         
	        return ListCommune;
	    } catch (NoResultException e) {
	        return null;
	    }
	}
	   
}
