package com.coophorizontal.mappers;

import com.dot.gcpbasedot.domain.BaseEntity;
import com.dot.gcpbasedot.mapper.BasicEntityMapper;
import com.coophorizontal.dtos.CiudadDto;
import com.coophorizontal.dtos.DepartamentoDto;
import com.coophorizontal.entities.Ciudad;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author nalvarez
 */
@Component("ciudadMapper")
public class CiudadMapper implements BasicEntityMapper {

    @Autowired
    DepartamentoMapper departamentoMapper;

    @Override
    public BaseEntity entityToDto(BaseEntity baseEntity) {
        Ciudad entity = (Ciudad) baseEntity;
        CiudadDto dto = new CiudadDto();
        if (entity != null) {
            dto.setId(entity.getId());
            dto.setDepartamento((DepartamentoDto) departamentoMapper.entityToDto(entity.getDepartamento()));
            dto.setNombre(entity.getNombre());
        }
        return dto;
    }

    @Override
    public List<? extends BaseEntity> listEntitiesToListDtos(List<? extends BaseEntity> entities) {
        ArrayList<CiudadDto> dtos = new ArrayList<>();
        if (entities != null) {
            for (BaseEntity entity : entities) {
                dtos.add((CiudadDto) entityToDto(entity));
            }
        }
        return dtos;
    }
}
