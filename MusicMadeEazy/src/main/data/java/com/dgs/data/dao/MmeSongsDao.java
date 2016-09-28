package com.dgs.data.dao;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.dgs.data.domain.MmeSongs;
import com.dgs.data.util.HibernateUtil;

/**
 * Home object for domain model class MmeSongs.
 * @see .MmeSongs
 * @author Hibernate Tools
 */
@Repository
public class MmeSongsDao extends HibernateUtil{

	private static final Log log = LogFactory.getLog(MmeSongsDao.class);

	public List<MmeSongs> getAllSongs() {
		Session session = sessionFactory.getCurrentSession();
		
		try {

			List allDetails;
			Query queryResult = session
					.createQuery("from MmeSongs");
			allDetails = queryResult.list();
			List<MmeSongs> allSongs = new ArrayList<MmeSongs>(allDetails);
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

	public void persist(MmeSongs transientInstance) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("persisting MmeSongs instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmeSongs persistentInstance) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("removing MmeSongs instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MmeSongs merge(MmeSongs detachedInstance) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("merging MmeSongs instance");
		try {
			MmeSongs result = (MmeSongs) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmeSongs findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("getting MmeSongs instance with id: " + id);
		try {
			MmeSongs instance = (MmeSongs) session.get("com.dgs.data.domain.MmeSongs", id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
