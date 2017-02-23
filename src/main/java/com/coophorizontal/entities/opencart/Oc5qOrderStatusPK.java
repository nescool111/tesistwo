/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.opencart;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author NestoR
 */
@Embeddable
public class Oc5qOrderStatusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "order_status_id")
    private int orderStatusId;
    @Basic(optional = false)
    @Column(name = "language_id")
    private int languageId;

    public Oc5qOrderStatusPK() {
    }

    public Oc5qOrderStatusPK(int orderStatusId, int languageId) {
        this.orderStatusId = orderStatusId;
        this.languageId = languageId;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderStatusId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderStatusPK)) {
            return false;
        }
        Oc5qOrderStatusPK other = (Oc5qOrderStatusPK) object;
        if (this.orderStatusId != other.orderStatusId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderStatusPK[ orderStatusId=" + orderStatusId + ", languageId=" + languageId + " ]";
    }
    
}
