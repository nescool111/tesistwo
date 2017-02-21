
package com.coophorizontal.daos.impl;


import com.dot.gcpbasedot.dao.JPAAbstractDao;
import com.coophorizontal.daos.CiudadJpa;
import com.coophorizontal.entities.Ciudad;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lacastrillov
 */
@Repository
public class CiudadJpaController extends JPAAbstractDao<Ciudad> implements CiudadJpa {

    @Autowired
    public void init(DataSource dataSource){
        super.setDataSource(dataSource);
    }
    
    @Override
    @PersistenceContext(unitName ="CoopHorizontalPU")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager= entityManager;
    }
}
