/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.prestashop;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "psik_order_return_state")
@NamedQueries({
    @NamedQuery(name = "PsikOrderReturnState.findAll", query = "SELECT p FROM PsikOrderReturnState p")})
public class PsikOrderReturnState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_return_state")
    private Integer idOrderReturnState;
    @Column(name = "color")
    private String color;

    public PsikOrderReturnState() {
    }

    public PsikOrderReturnState(Integer idOrderReturnState) {
        this.idOrderReturnState = idOrderReturnState;
    }

    public Integer getIdOrderReturnState() {
        return idOrderReturnState;
    }

    public void setIdOrderReturnState(Integer idOrderReturnState) {
        this.idOrderReturnState = idOrderReturnState;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderReturnState != null ? idOrderReturnState.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderReturnState)) {
            return false;
        }
        PsikOrderReturnState other = (PsikOrderReturnState) object;
        if ((this.idOrderReturnState == null && other.idOrderReturnState != null) || (this.idOrderReturnState != null && !this.idOrderReturnState.equals(other.idOrderReturnState))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderReturnState[ idOrderReturnState=" + idOrderReturnState + " ]";
    }
    
}
