package eu.ensup.demoFormation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demoFormation.domaine.Formation;

public class FormationDao implements IFormationDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public FormationDao() {
		// 1
		emf = Persistence.createEntityManagerFactory("demoformation");
		em = emf.createEntityManager();
	}

	public boolean create(Formation pFormation) {
		// 2
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 :
		Formation formation = new Formation(pFormation.getTheme());

		// 4 :
		em.persist(formation);
		tx.commit();

		// 5 :
		em.close();
		emf.close();
		return true;
	}

}
