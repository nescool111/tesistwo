package com.coophorizontal.services.security.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import com.coophorizontal.dtos.UserDetailsDto;
import com.coophorizontal.entities.Usuario;
import com.coophorizontal.services.UsuarioService;
import com.coophorizontal.services.security.SecurityService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author user
 */
public class SecurityServiceImpl implements AuthenticationProvider, SecurityService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public Authentication authenticate(Authentication a) throws AuthenticationException {
        Usuario user = getUser(a.getName());
        if (user != null) {
            boolean credencialesOk = true;
            credencialesOk = user.getPassword().equals(a.getCredentials());
            if (credencialesOk) {
                UserDetailsDto userDetails = entityToUserDetail(user);
                if (userDetails.isEnabled() == false) {
                    throw new BadCredentialsException("La clave esta vencida");
                } else if (userDetails.isAccountNonLocked() == false) {
                    throw new BadCredentialsException("La cuenta esta bloqueada por que ha excedido los intentos fallidos");
                }
                Authentication autentication = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());
                String roles = "";
                if (userDetails.getAuthorities() != null) {
                    List<GrantedAuthority> authorities = (List<GrantedAuthority>) userDetails.getAuthorities();
                    for (GrantedAuthority authority : authorities) {
                        roles += authority.getAuthority() + " ";
                    }
                }
                return autentication;
            } else {
            }
            throw new BadCredentialsException("Usuario y/o contraseña incorrectos");
        }
        throw new BadCredentialsException("Usuario no registrado, registrate!");
    }

    @Override
    public void connect(Usuario user) {
        UserDetailsDto userDetails = entityToUserDetail(user);
        Authentication auth = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(auth);
    }

    private List<GrantedAuthority> getGrantedAuthorities(Usuario user) {
        List<GrantedAuthority> authorities = new ArrayList<>();

        return authorities;
    }

    @Override
    public Usuario getCurrentUser() {
        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            try {
                UserDetailsDto userDetails = (UserDetailsDto) principal;
                Usuario user = getUser(userDetails.getUsername());
                return user;
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }

    private UserDetailsDto entityToUserDetail(Usuario user) {
        UserDetailsDto userDetails = new UserDetailsDto();
        long idUsuariolong = user.getId();
        int idUsuarioInt = (int) idUsuariolong;
        userDetails.setId(idUsuarioInt);
        userDetails.setUsername(user.getCorreoElectronico());
        userDetails.setPassword(user.getPassword());
        userDetails.setNombre(user.getNombre());
        validateUserDetails(userDetails, user);
        userDetails.setAuthorities(getGrantedAuthorities(user));
        return userDetails;
    }

    private void validateUserDetails(UserDetailsDto userDetails, Usuario user) {
        userDetails.setAccountNonExpired(true);
        userDetails.setAccountNonLocked(true);
        userDetails.setEnabled(true);
        userDetails.setCredentialsNonExpired(true);
    }

    private Usuario getUser(String username) {
        Usuario user = usuarioService.findUniqueByParameter("usuario", username);

        return user;
    }

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Usuario user = getUser(userName);
        if (user != null) {
            UserDetailsDto userDetails = entityToUserDetail(user);
            return userDetails;
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> type) {
        return true;
    }

    @Override
    public String getCurrentUserEmail() {
        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            try {
                UserDetailsDto userDetails = (UserDetailsDto) principal;
                Usuario user = getUser(userDetails.getUsername());
                return user.getCorreoElectronico();
            } catch (Exception e) {
                return "";
            }
        } else {
            return "";
        }
    }
}
