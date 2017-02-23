/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_sales_order_status_state")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesOrderStatusState.findAll", query = "SELECT m FROM MgpnSalesOrderStatusState m")})
public class MgpnSalesOrderStatusState implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MgpnSalesOrderStatusStatePK mgpnSalesOrderStatusStatePK;
    @Basic(optional = false)
    @Column(name = "is_default")
    private short isDefault;
    @JoinColumn(name = "status", referencedColumnName = "status", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MgpnSalesOrderStatus mgpnSalesOrderStatus;

    public MgpnSalesOrderStatusState() {
    }

    public MgpnSalesOrderStatusState(MgpnSalesOrderStatusStatePK mgpnSalesOrderStatusStatePK) {
        this.mgpnSalesOrderStatusStatePK = mgpnSalesOrderStatusStatePK;
    }

    public MgpnSalesOrderStatusState(MgpnSalesOrderStatusStatePK mgpnSalesOrderStatusStatePK, short isDefault) {
        this.mgpnSalesOrderStatusStatePK = mgpnSalesOrderStatusStatePK;
        this.isDefault = isDefault;
    }

    public MgpnSalesOrderStatusState(String status, String state) {
        this.mgpnSalesOrderStatusStatePK = new MgpnSalesOrderStatusStatePK(status, state);
    }

    public MgpnSalesOrderStatusStatePK getMgpnSalesOrderStatusStatePK() {
        return mgpnSalesOrderStatusStatePK;
    }

    public void setMgpnSalesOrderStatusStatePK(MgpnSalesOrderStatusStatePK mgpnSalesOrderStatusStatePK) {
        this.mgpnSalesOrderStatusStatePK = mgpnSalesOrderStatusStatePK;
    }

    public short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(short isDefault) {
        this.isDefault = isDefault;
    }

    public MgpnSalesOrderStatus getMgpnSalesOrderStatus() {
        return mgpnSalesOrderStatus;
    }

    public void setMgpnSalesOrderStatus(MgpnSalesOrderStatus mgpnSalesOrderStatus) {
        this.mgpnSalesOrderStatus = mgpnSalesOrderStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mgpnSalesOrderStatusStatePK != null ? mgpnSalesOrderStatusStatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderStatusState)) {
            return false;
        }
        MgpnSalesOrderStatusState other = (MgpnSalesOrderStatusState) object;
        if ((this.mgpnSalesOrderStatusStatePK == null && other.mgpnSalesOrderStatusStatePK != null) || (this.mgpnSalesOrderStatusStatePK != null && !this.mgpnSalesOrderStatusStatePK.equals(other.mgpnSalesOrderStatusStatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderStatusState[ mgpnSalesOrderStatusStatePK=" + mgpnSalesOrderStatusStatePK + " ]";
    }
    
}
