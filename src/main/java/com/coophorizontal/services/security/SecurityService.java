package com.coophorizontal.services.security;

import com.coophorizontal.entities.Usuario;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * @author user
 * @Version 1.0
 */
public interface SecurityService {

    Authentication authenticate(Authentication a) throws AuthenticationException;
    
    void connect(Usuario user);
    
    public Usuario getCurrentUser();
    
    public String getCurrentUserEmail();

}
