/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author NestoR
 */
@Embeddable
public class MgpnSalesOrderStatusLabelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "store_id")
    private short storeId;

    public MgpnSalesOrderStatusLabelPK() {
    }

    public MgpnSalesOrderStatusLabelPK(String status, short storeId) {
        this.status = status;
        this.storeId = storeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public short getStoreId() {
        return storeId;
    }

    public void setStoreId(short storeId) {
        this.storeId = storeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (status != null ? status.hashCode() : 0);
        hash += (int) storeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderStatusLabelPK)) {
            return false;
        }
        MgpnSalesOrderStatusLabelPK other = (MgpnSalesOrderStatusLabelPK) object;
        if ((this.status == null && other.status != null) || (this.status != null && !this.status.equals(other.status))) {
            return false;
        }
        if (this.storeId != other.storeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderStatusLabelPK[ status=" + status + ", storeId=" + storeId + " ]";
    }
    
}
