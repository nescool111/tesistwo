package com.coophorizontal.mappers;

import com.dot.gcpbasedot.domain.BaseEntity;
import com.dot.gcpbasedot.mapper.BasicEntityMapper;
import com.coophorizontal.dtos.DepartamentoDto;
import com.coophorizontal.entities.Departamento;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author nalvarez
 */
@Component("departamentoMapper")
public class DepartamentoMapper implements BasicEntityMapper {

    @Override
    public BaseEntity entityToDto(BaseEntity baseEntity) {
        Departamento entity = (Departamento) baseEntity;
        DepartamentoDto dto = new DepartamentoDto();
        if (entity != null) {
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());

        }
        return dto;
    }

    @Override
    public List<? extends BaseEntity> listEntitiesToListDtos(List<? extends BaseEntity> entities) {
        ArrayList<DepartamentoDto> dtos = new ArrayList<>();
        if (entities != null) {
            for (BaseEntity entity : entities) {
                dtos.add((DepartamentoDto) entityToDto(entity));
            }
        }
        return dtos;
    }
}
