package com.dgs.data.dao;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dgs.data.domain.MmePlaylistSongMapping;
import com.dgs.data.domain.MmePlaylistSongMappingId;

/**
 * Home object for domain model class MmePlaylistSongMapping.
 * @see .MmePlaylistSongMapping
 * @author Hibernate Tools
 */
@Stateless
public class MmePlaylistSongMappingDao {

	private static final Log log = LogFactory.getLog(MmePlaylistSongMappingDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MmePlaylistSongMapping transientInstance) {
		log.debug("persisting MmePlaylistSongMapping instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmePlaylistSongMapping persistentInstance) {
		log.debug("removing MmePlaylistSongMapping instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmePlaylistSongMapping merge(MmePlaylistSongMapping detachedInstance) {
		log.debug("merging MmePlaylistSongMapping instance");
		try {
			MmePlaylistSongMapping result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmePlaylistSongMapping findById(MmePlaylistSongMappingId id) {
		log.debug("getting MmePlaylistSongMapping instance with id: " + id);
		try {
			MmePlaylistSongMapping instance = entityManager.find(MmePlaylistSongMapping.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
