package com.dgs.data.dao;
// default package

// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.dgs.data.domain.MmePlaylist;
import com.dgs.data.domain.MmeSongs;
import com.dgs.data.domain.MmeUser;
import com.dgs.data.util.HibernateUtil;

/**
 * Home object for domain model class MmePlaylist.
 * 
 * @see .MmePlaylist
 * @author Hibernate Tools
 */
@Repository
public class MmePlaylistDao extends HibernateUtil {

	private static final Log log = LogFactory.getLog(MmePlaylistDao.class);

	public void persist(MmePlaylist transientInstance) {

		Session session = sessionFactory.getCurrentSession();
		log.debug("persisting MmePlaylist instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public List<MmePlaylist> getMyPlaylists(long userId) {
		Session session = sessionFactory.getCurrentSession();

		try {

			List allDetails;
			Query queryResult = session.createQuery("from MmePlaylist where playlistUserId = " + userId);
			allDetails = queryResult.list();
			List<MmePlaylist> allSongs = new ArrayList<MmePlaylist>(allDetails);
			if (allSongs == null) {
				log.debug("get successful, no List found");
			} else {
				log.debug("get successful, list found");
			}
			return allSongs;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		} finally {

		}
	}

	public void remove(MmePlaylist persistentInstance) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("removing MmeUser instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmePlaylist findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("getting MMePlaylist instance with id: " + id);
		try {
			MmePlaylist instance = (MmePlaylist) session.get("com.dgs.data.domain.MmePlaylist", id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
