
package com.coophorizontal.services.impl;


import com.dot.gcpbasedot.dao.GenericDao;
import com.dot.gcpbasedot.service.EntityServiceImpl1;
import com.coophorizontal.daos.CiudadJpa;
import com.coophorizontal.entities.Ciudad;
import com.coophorizontal.mappers.CiudadMapper;
import com.coophorizontal.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nalvarez
 */
@Service("ciudadService")
public class CiudadServiceImpl extends EntityServiceImpl1<Ciudad> implements CiudadService {
    
    @Autowired
    public CiudadJpa ciudadJpa;
    
    @Autowired
    public CiudadMapper ciudadMapper;
    
    @Override
    public GenericDao getGenericDao(){
        return ciudadJpa;
    }
}
