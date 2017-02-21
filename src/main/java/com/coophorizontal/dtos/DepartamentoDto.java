package com.coophorizontal.dtos;

import com.dot.gcpbasedot.annotation.ColumnWidth;
import com.dot.gcpbasedot.domain.BaseEntity;
import java.util.List;

/**
 * *
 * @author Nestor Fernando Alvarez <nalvarez@grupodot.com> @version 1.0
 */
public class DepartamentoDto implements BaseEntity {

    private static final long serialVersionUID = 1L;

    @ColumnWidth(100)
    private Integer id;

    private String nombre;

   
    private List<CiudadDto> ciudadList;

   // private List<UsuarioDto> usuarioList;

    public DepartamentoDto() {
    }

    public DepartamentoDto(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Object id) {
        this.id = (Integer) id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public List<CiudadDto> getCiudadList() {
        return ciudadList;
    }

    public void setCiudadList(List<CiudadDto> ciudadList) {
        this.ciudadList = ciudadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof DepartamentoDto)) {
            return false;
        }
        DepartamentoDto other = (DepartamentoDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Departamento[ id=" + id + " ]";
    }
}
