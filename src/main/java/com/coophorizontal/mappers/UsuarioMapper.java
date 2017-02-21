package com.coophorizontal.mappers;

import com.dot.gcpbasedot.domain.BaseEntity;
import com.dot.gcpbasedot.mapper.BasicEntityMapper;
import com.coophorizontal.dtos.CiudadDto;
import com.coophorizontal.dtos.DepartamentoDto;
import com.coophorizontal.dtos.UsuarioDto;
import com.coophorizontal.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lacastrillov
 */
@Component("usuarioMapper")
public class UsuarioMapper implements BasicEntityMapper {
    
    @Autowired
    CiudadMapper ciudadMapper;
    
    @Autowired
    DepartamentoMapper departamentoMapper;
    
    @Override
    public BaseEntity entityToDto(BaseEntity baseEntity) {
        Usuario entity = (Usuario) baseEntity;
        UsuarioDto dto = new UsuarioDto();
        
        if (entity != null) {
            dto.setId(entity.getId());
            dto.setCorreoElectronico(entity.getCorreoElectronico());
            dto.setNombre(entity.getNombre());
            dto.setCiudad((CiudadDto) ciudadMapper.entityToDto(entity.getCiudad()));
            dto.setDepartamento((DepartamentoDto) departamentoMapper.entityToDto(entity.getDepartamento()));
            dto.setTelefono(entity.getTelefono());
            dto.setDocumento(entity.getDocumento());
            dto.setTipoDocumento(entity.getTipoDocumento());
            dto.setPassword(entity.getPassword());
        }
        return dto;
    }
    
    @Override
    public List<? extends BaseEntity> listEntitiesToListDtos(List<? extends BaseEntity> entities) {
        ArrayList<UsuarioDto> dtos = new ArrayList<>();
        if (entities != null) {
            for (BaseEntity entity : entities) {
                dtos.add((UsuarioDto) entityToDto(entity));
            }
        }
        return dtos;
    }
}
