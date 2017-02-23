/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_sales_order_status")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesOrderStatus.findAll", query = "SELECT m FROM MgpnSalesOrderStatus m")})
public class MgpnSalesOrderStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "label")
    private String label;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnSalesOrderStatus")
    private List<MgpnSalesOrderStatusState> mgpnSalesOrderStatusStateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnSalesOrderStatus")
    private List<MgpnSalesOrderStatusLabel> mgpnSalesOrderStatusLabelList;

    public MgpnSalesOrderStatus() {
    }

    public MgpnSalesOrderStatus(String status) {
        this.status = status;
    }

    public MgpnSalesOrderStatus(String status, String label) {
        this.status = status;
        this.label = label;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<MgpnSalesOrderStatusState> getMgpnSalesOrderStatusStateList() {
        return mgpnSalesOrderStatusStateList;
    }

    public void setMgpnSalesOrderStatusStateList(List<MgpnSalesOrderStatusState> mgpnSalesOrderStatusStateList) {
        this.mgpnSalesOrderStatusStateList = mgpnSalesOrderStatusStateList;
    }

    public List<MgpnSalesOrderStatusLabel> getMgpnSalesOrderStatusLabelList() {
        return mgpnSalesOrderStatusLabelList;
    }

    public void setMgpnSalesOrderStatusLabelList(List<MgpnSalesOrderStatusLabel> mgpnSalesOrderStatusLabelList) {
        this.mgpnSalesOrderStatusLabelList = mgpnSalesOrderStatusLabelList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (status != null ? status.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderStatus)) {
            return false;
        }
        MgpnSalesOrderStatus other = (MgpnSalesOrderStatus) object;
        if ((this.status == null && other.status != null) || (this.status != null && !this.status.equals(other.status))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderStatus[ status=" + status + " ]";
    }
    
}
