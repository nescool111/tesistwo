package com.coophorizontal.mappers;

import com.dot.gcpbasedot.domain.BaseEntity;
import com.dot.gcpbasedot.mapper.BasicEntityMapper;
import com.coophorizontal.dtos.EstadoDto;
import com.coophorizontal.entities.Estado;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author nalvarez
 */
@Component("estadoMapper")
public class EstadoMapper implements BasicEntityMapper {

    @Override
    public BaseEntity entityToDto(BaseEntity baseEntity) {
        Estado entity = (Estado) baseEntity;
        EstadoDto dto = new EstadoDto();
        if (entity != null) {
            dto.setId(entity.getId());
            dto.setDescripcion(entity.getDescripcion());

        }
        return dto;
    }

    @Override
    public List<? extends BaseEntity> listEntitiesToListDtos(List<? extends BaseEntity> entities) {
        ArrayList<EstadoDto> dtos = new ArrayList<>();
        if (entities != null) {
            for (BaseEntity entity : entities) {
                dtos.add((EstadoDto) entityToDto(entity));
            }
        }
        return dtos;
    }
}
