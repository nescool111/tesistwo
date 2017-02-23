/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_sales_order_aggregated_created")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesOrderAggregatedCreated.findAll", query = "SELECT m FROM MgpnSalesOrderAggregatedCreated m")})
public class MgpnSalesOrderAggregatedCreated implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "period")
    @Temporal(TemporalType.DATE)
    private Date period;
    @Basic(optional = false)
    @Column(name = "order_status")
    private String orderStatus;
    @Basic(optional = false)
    @Column(name = "orders_count")
    private int ordersCount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total_qty_ordered")
    private BigDecimal totalQtyOrdered;
    @Basic(optional = false)
    @Column(name = "total_qty_invoiced")
    private BigDecimal totalQtyInvoiced;
    @Basic(optional = false)
    @Column(name = "total_income_amount")
    private BigDecimal totalIncomeAmount;
    @Basic(optional = false)
    @Column(name = "total_revenue_amount")
    private BigDecimal totalRevenueAmount;
    @Basic(optional = false)
    @Column(name = "total_profit_amount")
    private BigDecimal totalProfitAmount;
    @Basic(optional = false)
    @Column(name = "total_invoiced_amount")
    private BigDecimal totalInvoicedAmount;
    @Basic(optional = false)
    @Column(name = "total_canceled_amount")
    private BigDecimal totalCanceledAmount;
    @Basic(optional = false)
    @Column(name = "total_paid_amount")
    private BigDecimal totalPaidAmount;
    @Basic(optional = false)
    @Column(name = "total_refunded_amount")
    private BigDecimal totalRefundedAmount;
    @Basic(optional = false)
    @Column(name = "total_tax_amount")
    private BigDecimal totalTaxAmount;
    @Basic(optional = false)
    @Column(name = "total_tax_amount_actual")
    private BigDecimal totalTaxAmountActual;
    @Basic(optional = false)
    @Column(name = "total_shipping_amount")
    private BigDecimal totalShippingAmount;
    @Basic(optional = false)
    @Column(name = "total_shipping_amount_actual")
    private BigDecimal totalShippingAmountActual;
    @Basic(optional = false)
    @Column(name = "total_discount_amount")
    private BigDecimal totalDiscountAmount;
    @Basic(optional = false)
    @Column(name = "total_discount_amount_actual")
    private BigDecimal totalDiscountAmountActual;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    @ManyToOne
    private MgpnCoreStore mgpnCoreStore;

    public MgpnSalesOrderAggregatedCreated() {
    }

    public MgpnSalesOrderAggregatedCreated(Integer id) {
        this.id = id;
    }

    public MgpnSalesOrderAggregatedCreated(Integer id, String orderStatus, int ordersCount, BigDecimal totalQtyOrdered, BigDecimal totalQtyInvoiced, BigDecimal totalIncomeAmount, BigDecimal totalRevenueAmount, BigDecimal totalProfitAmount, BigDecimal totalInvoicedAmount, BigDecimal totalCanceledAmount, BigDecimal totalPaidAmount, BigDecimal totalRefundedAmount, BigDecimal totalTaxAmount, BigDecimal totalTaxAmountActual, BigDecimal totalShippingAmount, BigDecimal totalShippingAmountActual, BigDecimal totalDiscountAmount, BigDecimal totalDiscountAmountActual) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.ordersCount = ordersCount;
        this.totalQtyOrdered = totalQtyOrdered;
        this.totalQtyInvoiced = totalQtyInvoiced;
        this.totalIncomeAmount = totalIncomeAmount;
        this.totalRevenueAmount = totalRevenueAmount;
        this.totalProfitAmount = totalProfitAmount;
        this.totalInvoicedAmount = totalInvoicedAmount;
        this.totalCanceledAmount = totalCanceledAmount;
        this.totalPaidAmount = totalPaidAmount;
        this.totalRefundedAmount = totalRefundedAmount;
        this.totalTaxAmount = totalTaxAmount;
        this.totalTaxAmountActual = totalTaxAmountActual;
        this.totalShippingAmount = totalShippingAmount;
        this.totalShippingAmountActual = totalShippingAmountActual;
        this.totalDiscountAmount = totalDiscountAmount;
        this.totalDiscountAmountActual = totalDiscountAmountActual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }

    public BigDecimal getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    public void setTotalQtyOrdered(BigDecimal totalQtyOrdered) {
        this.totalQtyOrdered = totalQtyOrdered;
    }

    public BigDecimal getTotalQtyInvoiced() {
        return totalQtyInvoiced;
    }

    public void setTotalQtyInvoiced(BigDecimal totalQtyInvoiced) {
        this.totalQtyInvoiced = totalQtyInvoiced;
    }

    public BigDecimal getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    public void setTotalIncomeAmount(BigDecimal totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }

    public BigDecimal getTotalRevenueAmount() {
        return totalRevenueAmount;
    }

    public void setTotalRevenueAmount(BigDecimal totalRevenueAmount) {
        this.totalRevenueAmount = totalRevenueAmount;
    }

    public BigDecimal getTotalProfitAmount() {
        return totalProfitAmount;
    }

    public void setTotalProfitAmount(BigDecimal totalProfitAmount) {
        this.totalProfitAmount = totalProfitAmount;
    }

    public BigDecimal getTotalInvoicedAmount() {
        return totalInvoicedAmount;
    }

    public void setTotalInvoicedAmount(BigDecimal totalInvoicedAmount) {
        this.totalInvoicedAmount = totalInvoicedAmount;
    }

    public BigDecimal getTotalCanceledAmount() {
        return totalCanceledAmount;
    }

    public void setTotalCanceledAmount(BigDecimal totalCanceledAmount) {
        this.totalCanceledAmount = totalCanceledAmount;
    }

    public BigDecimal getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(BigDecimal totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public BigDecimal getTotalRefundedAmount() {
        return totalRefundedAmount;
    }

    public void setTotalRefundedAmount(BigDecimal totalRefundedAmount) {
        this.totalRefundedAmount = totalRefundedAmount;
    }

    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public BigDecimal getTotalTaxAmountActual() {
        return totalTaxAmountActual;
    }

    public void setTotalTaxAmountActual(BigDecimal totalTaxAmountActual) {
        this.totalTaxAmountActual = totalTaxAmountActual;
    }

    public BigDecimal getTotalShippingAmount() {
        return totalShippingAmount;
    }

    public void setTotalShippingAmount(BigDecimal totalShippingAmount) {
        this.totalShippingAmount = totalShippingAmount;
    }

    public BigDecimal getTotalShippingAmountActual() {
        return totalShippingAmountActual;
    }

    public void setTotalShippingAmountActual(BigDecimal totalShippingAmountActual) {
        this.totalShippingAmountActual = totalShippingAmountActual;
    }

    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public BigDecimal getTotalDiscountAmountActual() {
        return totalDiscountAmountActual;
    }

    public void setTotalDiscountAmountActual(BigDecimal totalDiscountAmountActual) {
        this.totalDiscountAmountActual = totalDiscountAmountActual;
    }

    public MgpnCoreStore getMgpnCoreStore() {
        return mgpnCoreStore;
    }

    public void setMgpnCoreStore(MgpnCoreStore mgpnCoreStore) {
        this.mgpnCoreStore = mgpnCoreStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesOrderAggregatedCreated)) {
            return false;
        }
        MgpnSalesOrderAggregatedCreated other = (MgpnSalesOrderAggregatedCreated) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesOrderAggregatedCreated[ id=" + id + " ]";
    }
    
}
