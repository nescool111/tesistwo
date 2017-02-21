
package com.coophorizontal.services.impl;


import com.dot.gcpbasedot.dao.GenericDao;
import com.dot.gcpbasedot.service.EntityServiceImpl1;
import com.coophorizontal.daos.EstadoJpa;
import com.coophorizontal.entities.Estado;
import com.coophorizontal.mappers.EstadoMapper;
import com.coophorizontal.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nalvarez
 */
@Service("estadoService")
public class EstadoServiceImpl extends EntityServiceImpl1<Estado> implements EstadoService {
    
    @Autowired
    public EstadoJpa estadoJpa;
    
    @Autowired
    public EstadoMapper estadoMapper;
    
    @Override
    public GenericDao getGenericDao(){
        return estadoJpa;
    }
}
