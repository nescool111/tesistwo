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
@Table(name = "mgpn_sales_order_status_label")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesOrderStatusLabel.findAll", query = "SELECT m FROM MgpnSalesOrderStatusLabel m")})
public class MgpnSalesOrderStatusLabel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MgpnSalesOrderStatusLabelPK mgpnSalesOrderStatusLabelPK;
    @Basic(optional = false)
    @Column(name = "label")
    private String label;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MgpnCoreStore mgpnCoreStore;
    @JoinColumn(name = "status", referencedColumnName = "status", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MgpnSalesOrderStatus mgpnSalesOrderStatus;

    public MgpnSalesOrderStatusLabel() {
    }

    public MgpnSalesOrderStatusLabel(MgpnSalesOrderStatusLabelPK mgpnSalesOrderStatusLabelPK) {
        this.mgpnSalesOrderStatusLabelPK = mgpnSalesOrderStatusLabelPK;
    }

    public MgpnSalesOrderStatusLabel(MgpnSalesOrderStatusLabelPK mgpnSalesOrderStatusLabelPK, String label) {
        this.mgpnSalesOrderStatusLabelPK = mgpnSalesOrderStatusLabelPK;
        this.label = label;
    }

    public MgpnSalesOrderStatusLabel(String status, short storeId) {
        this.mgpnSalesOrderStatusLabelPK = new MgpnSalesOrderStatusLabelPK(status, storeId);
    }

    public MgpnSalesOrderStatusLabelPK getMgpnSalesOrderStatusLabelPK() {
        return mgpnSalesOrderStatusLabelPK;
    }

    public void setMgpnSalesOrderStatusLabelPK(MgpnSalesOrderStatusLabelPK mgpnSalesOrderStatusLabelPK) {
        this.mgpnSalesOrderStatusLabelPK = mgpnSalesOrderStatusLabelPK;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MgpnCoreStore getMgpnCoreStore() {
        return mgpnCoreStore;
    }

    public void setMgpnCoreStore(MgpnCoreStore mgpnCoreStore) {
        this.mgpnCoreStore = mgpnCoreStore;
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
        hash += (mgpnSalesOrderStatusLabelPK != null ? mgpnSalesOrderStatusLabelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderStatusLabel)) {
            return false;
        }
        MgpnSalesOrderStatusLabel other = (MgpnSalesOrderStatusLabel) object;
        if ((this.mgpnSalesOrderStatusLabelPK == null && other.mgpnSalesOrderStatusLabelPK != null) || (this.mgpnSalesOrderStatusLabelPK != null && !this.mgpnSalesOrderStatusLabelPK.equals(other.mgpnSalesOrderStatusLabelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderStatusLabel[ mgpnSalesOrderStatusLabelPK=" + mgpnSalesOrderStatusLabelPK + " ]";
    }
    
}
