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

import com.dgs.data.domain.MmeUser;
import com.dgs.data.util.HibernateUtil;

/**
 * Home object for domain model class MmeUser.
 * @see .MmeUser
 * @author Hibernate Tools
 */
@Repository
public class MmeUserDao extends HibernateUtil{

	private static final Log log = LogFactory.getLog(MmeUserDao.class);
	
	public List<MmeUser> getAllActiveRecords() {
		Session session = sessionFactory.getCurrentSession();
		
		try {

			List allDetails;
			Query queryResult = session
					.createQuery("from MmeUser");
			allDetails = queryResult.list();
			List<MmeUser> userRole = new ArrayList<MmeUser>(allDetails);
			if (userRole == null) {
				log.debug("get successful, no List found");
			} else {
				log.debug("get successful, list found");
			}
			return userRole;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		} finally {
			
		}
	}

	
	public void persist(MmeUser transientInstance) {
		
		Session session = sessionFactory.getCurrentSession();
		log.debug("persisting MmeUser instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MmeUser persistentInstance) {
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

	public MmeUser merge(MmeUser detachedInstance) {
		log.debug("merging MmeUser instance");
		Session session = sessionFactory.getCurrentSession();
		try {
			MmeUser result = (MmeUser) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MmeUser findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		log.debug("getting MmeUser instance with id: " + id);
		try {
			MmeUser instance = (MmeUser) session.get("com.dgs.data.domain.MmeUser", id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
