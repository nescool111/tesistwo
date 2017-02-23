/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "mgpn_sales_order_tax_item")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesOrderTaxItem.findAll", query = "SELECT m FROM MgpnSalesOrderTaxItem m")})
public class MgpnSalesOrderTaxItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_item_id")
    private Integer taxItemId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "tax_percent")
    private BigDecimal taxPercent;
    @JoinColumn(name = "tax_id", referencedColumnName = "tax_id")
    @ManyToOne(optional = false)
    private MgpnSalesOrderTax mgpnSalesOrderTax;
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    @ManyToOne(optional = false)
    private MgpnSalesFlatOrderItem mgpnSalesFlatOrderItem;

    public MgpnSalesOrderTaxItem() {
    }

    public MgpnSalesOrderTaxItem(Integer taxItemId) {
        this.taxItemId = taxItemId;
    }

    public MgpnSalesOrderTaxItem(Integer taxItemId, BigDecimal taxPercent) {
        this.taxItemId = taxItemId;
        this.taxPercent = taxPercent;
    }

    public Integer getTaxItemId() {
        return taxItemId;
    }

    public void setTaxItemId(Integer taxItemId) {
        this.taxItemId = taxItemId;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }

    public MgpnSalesOrderTax getMgpnSalesOrderTax() {
        return mgpnSalesOrderTax;
    }

    public void setMgpnSalesOrderTax(MgpnSalesOrderTax mgpnSalesOrderTax) {
        this.mgpnSalesOrderTax = mgpnSalesOrderTax;
    }

    public MgpnSalesFlatOrderItem getMgpnSalesFlatOrderItem() {
        return mgpnSalesFlatOrderItem;
    }

    public void setMgpnSalesFlatOrderItem(MgpnSalesFlatOrderItem mgpnSalesFlatOrderItem) {
        this.mgpnSalesFlatOrderItem = mgpnSalesFlatOrderItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxItemId != null ? taxItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderTaxItem)) {
            return false;
        }
        MgpnSalesOrderTaxItem other = (MgpnSalesOrderTaxItem) object;
        if ((this.taxItemId == null && other.taxItemId != null) || (this.taxItemId != null && !this.taxItemId.equals(other.taxItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderTaxItem[ taxItemId=" + taxItemId + " ]";
    }
    
}
