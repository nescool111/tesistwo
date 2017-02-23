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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "oc5q_order_field")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderField.findAll", query = "SELECT o FROM Oc5qOrderField o")})
public class Oc5qOrderField implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Oc5qOrderFieldPK oc5qOrderFieldPK;
    @Basic(optional = false)
    @Column(name = "name")
    private int name;
    @Basic(optional = false)
    @Lob
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @Column(name = "sort_order")
    private int sortOrder;

    public Oc5qOrderField() {
    }

    public Oc5qOrderField(Oc5qOrderFieldPK oc5qOrderFieldPK) {
        this.oc5qOrderFieldPK = oc5qOrderFieldPK;
    }

    public Oc5qOrderField(Oc5qOrderFieldPK oc5qOrderFieldPK, int name, String value, int sortOrder) {
        this.oc5qOrderFieldPK = oc5qOrderFieldPK;
        this.name = name;
        this.value = value;
        this.sortOrder = sortOrder;
    }

    public Oc5qOrderField(int orderId, int customFieldId, int customFieldValueId) {
        this.oc5qOrderFieldPK = new Oc5qOrderFieldPK(orderId, customFieldId, customFieldValueId);
    }

    public Oc5qOrderFieldPK getOc5qOrderFieldPK() {
        return oc5qOrderFieldPK;
    }

    public void setOc5qOrderFieldPK(Oc5qOrderFieldPK oc5qOrderFieldPK) {
        this.oc5qOrderFieldPK = oc5qOrderFieldPK;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oc5qOrderFieldPK != null ? oc5qOrderFieldPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderField)) {
            return false;
        }
        Oc5qOrderField other = (Oc5qOrderField) object;
        if ((this.oc5qOrderFieldPK == null && other.oc5qOrderFieldPK != null) || (this.oc5qOrderFieldPK != null && !this.oc5qOrderFieldPK.equals(other.oc5qOrderFieldPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderField[ oc5qOrderFieldPK=" + oc5qOrderFieldPK + " ]";
    }
    
}
