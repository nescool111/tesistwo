
package com.coophorizontal.services.impl;

import com.dot.gcpbasedot.dao.GenericDao;
import com.dot.gcpbasedot.service.EntityServiceImpl1;
import com.coophorizontal.daos.DepartamentoJpa;
import com.coophorizontal.entities.Departamento;
import com.coophorizontal.mappers.DepartamentoMapper;
import com.coophorizontal.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nalvarez
 */
@Service("departamentoService")
public class DepartamentoServiceImpl extends EntityServiceImpl1<Departamento> implements DepartamentoService {
    
    @Autowired
    public DepartamentoJpa departamentoJpa;
    
    @Autowired
    public DepartamentoMapper departamentoMapper;
    
    @Override
    public GenericDao getGenericDao(){
        return departamentoJpa;
    }
}
