package com.dgs.data.dao;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dgs.data.domain.MmeAlbumArtistSongMapping;
import com.dgs.data.domain.MmeAlbumArtistSongMappingId;

/**
 * Home object for domain model class MmeAlbumArtistSongMapping.
 * @see .MmeAlbumArtistSongMapping
 * @author Hibernate Tools
 */
@Stateless
public class MmeAlbumArtistSongMappingDao {

	private static final Log log = LogFactory.getLog(MmeAlbumArtistSongMappingDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MmeAlbumArtistSongMapping transientInstance) {
		log.debug("persisting MmeAlbumArtistSongMapping instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmeAlbumArtistSongMapping persistentInstance) {
		log.debug("removing MmeAlbumArtistSongMapping instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmeAlbumArtistSongMapping merge(MmeAlbumArtistSongMapping detachedInstance) {
		log.debug("merging MmeAlbumArtistSongMapping instance");
		try {
			MmeAlbumArtistSongMapping result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmeAlbumArtistSongMapping findById(MmeAlbumArtistSongMappingId id) {
		log.debug("getting MmeAlbumArtistSongMapping instance with id: " + id);
		try {
			MmeAlbumArtistSongMapping instance = entityManager.find(MmeAlbumArtistSongMapping.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
