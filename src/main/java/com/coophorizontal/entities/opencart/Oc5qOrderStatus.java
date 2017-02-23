/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.opencart;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "oc5q_order_status")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderStatus.findAll", query = "SELECT o FROM Oc5qOrderStatus o")})
public class Oc5qOrderStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Oc5qOrderStatusPK oc5qOrderStatusPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public Oc5qOrderStatus() {
    }

    public Oc5qOrderStatus(Oc5qOrderStatusPK oc5qOrderStatusPK) {
        this.oc5qOrderStatusPK = oc5qOrderStatusPK;
    }

    public Oc5qOrderStatus(Oc5qOrderStatusPK oc5qOrderStatusPK, String name) {
        this.oc5qOrderStatusPK = oc5qOrderStatusPK;
        this.name = name;
    }

    public Oc5qOrderStatus(int orderStatusId, int languageId) {
        this.oc5qOrderStatusPK = new Oc5qOrderStatusPK(orderStatusId, languageId);
    }

    public Oc5qOrderStatusPK getOc5qOrderStatusPK() {
        return oc5qOrderStatusPK;
    }

    public void setOc5qOrderStatusPK(Oc5qOrderStatusPK oc5qOrderStatusPK) {
        this.oc5qOrderStatusPK = oc5qOrderStatusPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oc5qOrderStatusPK != null ? oc5qOrderStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderStatus)) {
            return false;
        }
        Oc5qOrderStatus other = (Oc5qOrderStatus) object;
        if ((this.oc5qOrderStatusPK == null && other.oc5qOrderStatusPK != null) || (this.oc5qOrderStatusPK != null && !this.oc5qOrderStatusPK.equals(other.oc5qOrderStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderStatus[ oc5qOrderStatusPK=" + oc5qOrderStatusPK + " ]";
    }
    
}
