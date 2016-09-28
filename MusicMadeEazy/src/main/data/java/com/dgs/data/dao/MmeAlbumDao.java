package com.dgs.data.dao;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dgs.data.domain.MmeAlbum;

/**
 * Home object for domain model class MmeAlbum.
 * @see .MmeAlbum
 * @author Hibernate Tools
 */
@Stateless
public class MmeAlbumDao {

	private static final Log log = LogFactory.getLog(MmeAlbumDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MmeAlbum transientInstance) {
		log.debug("persisting MmeAlbum instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmeAlbum persistentInstance) {
		log.debug("removing MmeAlbum instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmeAlbum merge(MmeAlbum detachedInstance) {
		log.debug("merging MmeAlbum instance");
		try {
			MmeAlbum result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmeAlbum findById(long id) {
		log.debug("getting MmeAlbum instance with id: " + id);
		try {
			MmeAlbum instance = entityManager.find(MmeAlbum.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
