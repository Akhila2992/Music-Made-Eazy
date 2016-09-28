package com.dgs.data.dao;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dgs.data.domain.MmeArtist;

/**
 * Home object for domain model class MmeArtist.
 * @see .MmeArtist
 * @author Hibernate Tools
 */
@Stateless
public class MmeArtistDao {

	private static final Log log = LogFactory.getLog(MmeArtistDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MmeArtist transientInstance) {
		log.debug("persisting MmeArtist instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmeArtist persistentInstance) {
		log.debug("removing MmeArtist instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmeArtist merge(MmeArtist detachedInstance) {
		log.debug("merging MmeArtist instance");
		try {
			MmeArtist result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmeArtist findById(long id) {
		log.debug("getting MmeArtist instance with id: " + id);
		try {
			MmeArtist instance = entityManager.find(MmeArtist.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
