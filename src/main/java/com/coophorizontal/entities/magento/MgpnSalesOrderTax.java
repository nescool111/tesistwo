/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "mgpn_sales_order_tax")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesOrderTax.findAll", query = "SELECT m FROM MgpnSalesOrderTax m")})
public class MgpnSalesOrderTax implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_id")
    private Integer taxId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "code")
    private String code;
    @Column(name = "title")
    private String title;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "percent")
    private BigDecimal percent;
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "priority")
    private int priority;
    @Basic(optional = false)
    @Column(name = "position")
    private int position;
    @Column(name = "base_amount")
    private BigDecimal baseAmount;
    @Basic(optional = false)
    @Column(name = "process")
    private short process;
    @Column(name = "base_real_amount")
    private BigDecimal baseRealAmount;
    @Basic(optional = false)
    @Column(name = "hidden")
    private short hidden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnSalesOrderTax")
    private List<MgpnSalesOrderTaxItem> mgpnSalesOrderTaxItemList;

    public MgpnSalesOrderTax() {
    }

    public MgpnSalesOrderTax(Integer taxId) {
        this.taxId = taxId;
    }

    public MgpnSalesOrderTax(Integer taxId, int orderId, int priority, int position, short process, short hidden) {
        this.taxId = taxId;
        this.orderId = orderId;
        this.priority = priority;
        this.position = position;
        this.process = process;
        this.hidden = hidden;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public short getProcess() {
        return process;
    }

    public void setProcess(short process) {
        this.process = process;
    }

    public BigDecimal getBaseRealAmount() {
        return baseRealAmount;
    }

    public void setBaseRealAmount(BigDecimal baseRealAmount) {
        this.baseRealAmount = baseRealAmount;
    }

    public short getHidden() {
        return hidden;
    }

    public void setHidden(short hidden) {
        this.hidden = hidden;
    }

    public List<MgpnSalesOrderTaxItem> getMgpnSalesOrderTaxItemList() {
        return mgpnSalesOrderTaxItemList;
    }

    public void setMgpnSalesOrderTaxItemList(List<MgpnSalesOrderTaxItem> mgpnSalesOrderTaxItemList) {
        this.mgpnSalesOrderTaxItemList = mgpnSalesOrderTaxItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxId != null ? taxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderTax)) {
            return false;
        }
        MgpnSalesOrderTax other = (MgpnSalesOrderTax) object;
        if ((this.taxId == null && other.taxId != null) || (this.taxId != null && !this.taxId.equals(other.taxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderTax[ taxId=" + taxId + " ]";
    }
    
}
