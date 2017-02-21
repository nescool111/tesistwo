
package com.coophorizontal.services.impl;

import com.dot.gcpbasedot.dao.GenericDao;
import com.dot.gcpbasedot.service.EntityServiceImpl1;
import com.coophorizontal.daos.UsuarioJpa;
import com.coophorizontal.entities.Usuario;
import com.coophorizontal.mappers.UsuarioMapper;
import com.coophorizontal.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lacastrillov
 */
@Service("usuarioService")
public class UsuarioServiceImpl extends EntityServiceImpl1<Usuario> implements UsuarioService {

    @Autowired
    public UsuarioJpa usuarioJpa;

    @Autowired
    public UsuarioMapper usuarioMapper;


    @Override
    public GenericDao getGenericDao() {
        return usuarioJpa;
    }

 
}
