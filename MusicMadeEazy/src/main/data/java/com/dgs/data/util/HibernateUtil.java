package com.dgs.data.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
  
public abstract class HibernateUtil {
  
	@Autowired
    protected SessionFactory sessionFactory;
 
}
