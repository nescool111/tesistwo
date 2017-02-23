/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.prestashop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "psik_order_invoice")
@NamedQueries({
    @NamedQuery(name = "PsikOrderInvoice.findAll", query = "SELECT p FROM PsikOrderInvoice p")})
public class PsikOrderInvoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_invoice")
    private Integer idOrderInvoice;
    @Basic(optional = false)
    @Column(name = "id_order")
    private int idOrder;
    @Basic(optional = false)
    @Column(name = "number")
    private int number;
    @Basic(optional = false)
    @Column(name = "delivery_number")
    private int deliveryNumber;
    @Column(name = "delivery_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total_discount_tax_excl")
    private BigDecimal totalDiscountTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_discount_tax_incl")
    private BigDecimal totalDiscountTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_paid_tax_excl")
    private BigDecimal totalPaidTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_paid_tax_incl")
    private BigDecimal totalPaidTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_products")
    private BigDecimal totalProducts;
    @Basic(optional = false)
    @Column(name = "total_products_wt")
    private BigDecimal totalProductsWt;
    @Basic(optional = false)
    @Column(name = "total_shipping_tax_excl")
    private BigDecimal totalShippingTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_shipping_tax_incl")
    private BigDecimal totalShippingTaxIncl;
    @Basic(optional = false)
    @Column(name = "shipping_tax_computation_method")
    private int shippingTaxComputationMethod;
    @Basic(optional = false)
    @Column(name = "total_wrapping_tax_excl")
    private BigDecimal totalWrappingTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_wrapping_tax_incl")
    private BigDecimal totalWrappingTaxIncl;
    @Lob
    @Column(name = "shop_address")
    private String shopAddress;
    @Lob
    @Column(name = "invoice_address")
    private String invoiceAddress;
    @Lob
    @Column(name = "delivery_address")
    private String deliveryAddress;
    @Lob
    @Column(name = "note")
    private String note;
    @Basic(optional = false)
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;

    public PsikOrderInvoice() {
    }

    public PsikOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public PsikOrderInvoice(Integer idOrderInvoice, int idOrder, int number, int deliveryNumber, BigDecimal totalDiscountTaxExcl, BigDecimal totalDiscountTaxIncl, BigDecimal totalPaidTaxExcl, BigDecimal totalPaidTaxIncl, BigDecimal totalProducts, BigDecimal totalProductsWt, BigDecimal totalShippingTaxExcl, BigDecimal totalShippingTaxIncl, int shippingTaxComputationMethod, BigDecimal totalWrappingTaxExcl, BigDecimal totalWrappingTaxIncl, Date dateAdd) {
        this.idOrderInvoice = idOrderInvoice;
        this.idOrder = idOrder;
        this.number = number;
        this.deliveryNumber = deliveryNumber;
        this.totalDiscountTaxExcl = totalDiscountTaxExcl;
        this.totalDiscountTaxIncl = totalDiscountTaxIncl;
        this.totalPaidTaxExcl = totalPaidTaxExcl;
        this.totalPaidTaxIncl = totalPaidTaxIncl;
        this.totalProducts = totalProducts;
        this.totalProductsWt = totalProductsWt;
        this.totalShippingTaxExcl = totalShippingTaxExcl;
        this.totalShippingTaxIncl = totalShippingTaxIncl;
        this.shippingTaxComputationMethod = shippingTaxComputationMethod;
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
        this.dateAdd = dateAdd;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BigDecimal getTotalDiscountTaxExcl() {
        return totalDiscountTaxExcl;
    }

    public void setTotalDiscountTaxExcl(BigDecimal totalDiscountTaxExcl) {
        this.totalDiscountTaxExcl = totalDiscountTaxExcl;
    }

    public BigDecimal getTotalDiscountTaxIncl() {
        return totalDiscountTaxIncl;
    }

    public void setTotalDiscountTaxIncl(BigDecimal totalDiscountTaxIncl) {
        this.totalDiscountTaxIncl = totalDiscountTaxIncl;
    }

    public BigDecimal getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public BigDecimal getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public BigDecimal getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(BigDecimal totalProducts) {
        this.totalProducts = totalProducts;
    }

    public BigDecimal getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(BigDecimal totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }

    public BigDecimal getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public BigDecimal getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public int getShippingTaxComputationMethod() {
        return shippingTaxComputationMethod;
    }

    public void setShippingTaxComputationMethod(int shippingTaxComputationMethod) {
        this.shippingTaxComputationMethod = shippingTaxComputationMethod;
    }

    public BigDecimal getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public BigDecimal getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderInvoice != null ? idOrderInvoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderInvoice)) {
            return false;
        }
        PsikOrderInvoice other = (PsikOrderInvoice) object;
        if ((this.idOrderInvoice == null && other.idOrderInvoice != null) || (this.idOrderInvoice != null && !this.idOrderInvoice.equals(other.idOrderInvoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderInvoice[ idOrderInvoice=" + idOrderInvoice + " ]";
    }
    
}
