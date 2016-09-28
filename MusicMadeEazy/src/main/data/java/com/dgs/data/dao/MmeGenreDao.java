package com.dgs.data.dao;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dgs.data.domain.MmeGenre;

/**
 * Home object for domain model class MmeGenre.
 * @see .MmeGenre
 * @author Hibernate Tools
 */
@Stateless
public class MmeGenreDao {

	private static final Log log = LogFactory.getLog(MmeGenreDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MmeGenre transientInstance) {
		log.debug("persisting MmeGenre instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmeGenre persistentInstance) {
		log.debug("removing MmeGenre instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmeGenre merge(MmeGenre detachedInstance) {
		log.debug("merging MmeGenre instance");
		try {
			MmeGenre result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmeGenre findById(long id) {
		log.debug("getting MmeGenre instance with id: " + id);
		try {
			MmeGenre instance = entityManager.find(MmeGenre.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
