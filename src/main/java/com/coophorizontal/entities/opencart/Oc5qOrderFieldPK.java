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
public class Oc5qOrderFieldPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "custom_field_id")
    private int customFieldId;
    @Basic(optional = false)
    @Column(name = "custom_field_value_id")
    private int customFieldValueId;

    public Oc5qOrderFieldPK() {
    }

    public Oc5qOrderFieldPK(int orderId, int customFieldId, int customFieldValueId) {
        this.orderId = orderId;
        this.customFieldId = customFieldId;
        this.customFieldValueId = customFieldValueId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(int customFieldId) {
        this.customFieldId = customFieldId;
    }

    public int getCustomFieldValueId() {
        return customFieldValueId;
    }

    public void setCustomFieldValueId(int customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderId;
        hash += (int) customFieldId;
        hash += (int) customFieldValueId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderFieldPK)) {
            return false;
        }
        Oc5qOrderFieldPK other = (Oc5qOrderFieldPK) object;
        if (this.orderId != other.orderId) {
            return false;
        }
        if (this.customFieldId != other.customFieldId) {
            return false;
        }
        if (this.customFieldValueId != other.customFieldValueId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderFieldPK[ orderId=" + orderId + ", customFieldId=" + customFieldId + ", customFieldValueId=" + customFieldValueId + " ]";
    }
    
}
