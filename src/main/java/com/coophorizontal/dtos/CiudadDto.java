package com.coophorizontal.dtos;

import com.dot.gcpbasedot.annotation.ColumnWidth;
import com.dot.gcpbasedot.domain.BaseEntity;
import com.coophorizontal.entities.Ciudad;
//import com.coophorizontal.entities.Usuario;

/**
 *
 * @author Nestor Fernando Alvarez <nalvarez@grupodot.com> @version 1.0
 */
public class CiudadDto implements BaseEntity {

    private static final long serialVersionUID = 1L;

    @ColumnWidth(100)
    private Integer id;

    private String nombre;

    private DepartamentoDto departamento;

 //   private List<Usuario> usuarioList;

    public CiudadDto() {
    }

    public CiudadDto(Integer id) {
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

    public DepartamentoDto getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoDto departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ciudad)) {
            return false;
        }
        CiudadDto other = (CiudadDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Ciudad[ id=" + id + " ]";
    }
}
