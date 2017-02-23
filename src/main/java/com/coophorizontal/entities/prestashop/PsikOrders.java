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
@Table(name = "psik_orders")
@NamedQueries({
    @NamedQuery(name = "PsikOrders.findAll", query = "SELECT p FROM PsikOrders p")})
public class PsikOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order")
    private Integer idOrder;
    @Column(name = "reference")
    private String reference;
    @Basic(optional = false)
    @Column(name = "id_shop_group")
    private int idShopGroup;
    @Basic(optional = false)
    @Column(name = "id_shop")
    private int idShop;
    @Basic(optional = false)
    @Column(name = "id_carrier")
    private int idCarrier;
    @Basic(optional = false)
    @Column(name = "id_lang")
    private int idLang;
    @Basic(optional = false)
    @Column(name = "id_customer")
    private int idCustomer;
    @Basic(optional = false)
    @Column(name = "id_cart")
    private int idCart;
    @Basic(optional = false)
    @Column(name = "id_currency")
    private int idCurrency;
    @Basic(optional = false)
    @Column(name = "id_address_delivery")
    private int idAddressDelivery;
    @Basic(optional = false)
    @Column(name = "id_address_invoice")
    private int idAddressInvoice;
    @Basic(optional = false)
    @Column(name = "current_state")
    private int currentState;
    @Basic(optional = false)
    @Column(name = "secure_key")
    private String secureKey;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "conversion_rate")
    private BigDecimal conversionRate;
    @Column(name = "module")
    private String module;
    @Basic(optional = false)
    @Column(name = "recyclable")
    private boolean recyclable;
    @Basic(optional = false)
    @Column(name = "gift")
    private boolean gift;
    @Lob
    @Column(name = "gift_message")
    private String giftMessage;
    @Basic(optional = false)
    @Column(name = "mobile_theme")
    private boolean mobileTheme;
    @Column(name = "shipping_number")
    private String shippingNumber;
    @Basic(optional = false)
    @Column(name = "total_discounts")
    private BigDecimal totalDiscounts;
    @Basic(optional = false)
    @Column(name = "total_discounts_tax_incl")
    private BigDecimal totalDiscountsTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_discounts_tax_excl")
    private BigDecimal totalDiscountsTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_paid")
    private BigDecimal totalPaid;
    @Basic(optional = false)
    @Column(name = "total_paid_tax_incl")
    private BigDecimal totalPaidTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_paid_tax_excl")
    private BigDecimal totalPaidTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_paid_real")
    private BigDecimal totalPaidReal;
    @Basic(optional = false)
    @Column(name = "total_products")
    private BigDecimal totalProducts;
    @Basic(optional = false)
    @Column(name = "total_products_wt")
    private BigDecimal totalProductsWt;
    @Basic(optional = false)
    @Column(name = "total_shipping")
    private BigDecimal totalShipping;
    @Basic(optional = false)
    @Column(name = "total_shipping_tax_incl")
    private BigDecimal totalShippingTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_shipping_tax_excl")
    private BigDecimal totalShippingTaxExcl;
    @Basic(optional = false)
    @Column(name = "carrier_tax_rate")
    private BigDecimal carrierTaxRate;
    @Basic(optional = false)
    @Column(name = "total_wrapping")
    private BigDecimal totalWrapping;
    @Basic(optional = false)
    @Column(name = "total_wrapping_tax_incl")
    private BigDecimal totalWrappingTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_wrapping_tax_excl")
    private BigDecimal totalWrappingTaxExcl;
    @Basic(optional = false)
    @Column(name = "round_mode")
    private boolean roundMode;
    @Basic(optional = false)
    @Column(name = "round_type")
    private boolean roundType;
    @Basic(optional = false)
    @Column(name = "invoice_number")
    private int invoiceNumber;
    @Basic(optional = false)
    @Column(name = "delivery_number")
    private int deliveryNumber;
    @Basic(optional = false)
    @Column(name = "invoice_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;
    @Basic(optional = false)
    @Column(name = "delivery_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    @Basic(optional = false)
    @Column(name = "valid")
    private int valid;
    @Basic(optional = false)
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;
    @Basic(optional = false)
    @Column(name = "date_upd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpd;

    public PsikOrders() {
    }

    public PsikOrders(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public PsikOrders(Integer idOrder, int idShopGroup, int idShop, int idCarrier, int idLang, int idCustomer, int idCart, int idCurrency, int idAddressDelivery, int idAddressInvoice, int currentState, String secureKey, String payment, BigDecimal conversionRate, boolean recyclable, boolean gift, boolean mobileTheme, BigDecimal totalDiscounts, BigDecimal totalDiscountsTaxIncl, BigDecimal totalDiscountsTaxExcl, BigDecimal totalPaid, BigDecimal totalPaidTaxIncl, BigDecimal totalPaidTaxExcl, BigDecimal totalPaidReal, BigDecimal totalProducts, BigDecimal totalProductsWt, BigDecimal totalShipping, BigDecimal totalShippingTaxIncl, BigDecimal totalShippingTaxExcl, BigDecimal carrierTaxRate, BigDecimal totalWrapping, BigDecimal totalWrappingTaxIncl, BigDecimal totalWrappingTaxExcl, boolean roundMode, boolean roundType, int invoiceNumber, int deliveryNumber, Date invoiceDate, Date deliveryDate, int valid, Date dateAdd, Date dateUpd) {
        this.idOrder = idOrder;
        this.idShopGroup = idShopGroup;
        this.idShop = idShop;
        this.idCarrier = idCarrier;
        this.idLang = idLang;
        this.idCustomer = idCustomer;
        this.idCart = idCart;
        this.idCurrency = idCurrency;
        this.idAddressDelivery = idAddressDelivery;
        this.idAddressInvoice = idAddressInvoice;
        this.currentState = currentState;
        this.secureKey = secureKey;
        this.payment = payment;
        this.conversionRate = conversionRate;
        this.recyclable = recyclable;
        this.gift = gift;
        this.mobileTheme = mobileTheme;
        this.totalDiscounts = totalDiscounts;
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
        this.totalPaid = totalPaid;
        this.totalPaidTaxIncl = totalPaidTaxIncl;
        this.totalPaidTaxExcl = totalPaidTaxExcl;
        this.totalPaidReal = totalPaidReal;
        this.totalProducts = totalProducts;
        this.totalProductsWt = totalProductsWt;
        this.totalShipping = totalShipping;
        this.totalShippingTaxIncl = totalShippingTaxIncl;
        this.totalShippingTaxExcl = totalShippingTaxExcl;
        this.carrierTaxRate = carrierTaxRate;
        this.totalWrapping = totalWrapping;
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
        this.roundMode = roundMode;
        this.roundType = roundType;
        this.invoiceNumber = invoiceNumber;
        this.deliveryNumber = deliveryNumber;
        this.invoiceDate = invoiceDate;
        this.deliveryDate = deliveryDate;
        this.valid = valid;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(int idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    public int getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(int idCarrier) {
        this.idCarrier = idCarrier;
    }

    public int getIdLang() {
        return idLang;
    }

    public void setIdLang(int idLang) {
        this.idLang = idLang;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    public int getIdAddressDelivery() {
        return idAddressDelivery;
    }

    public void setIdAddressDelivery(int idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }

    public int getIdAddressInvoice() {
        return idAddressInvoice;
    }

    public void setIdAddressInvoice(int idAddressInvoice) {
        this.idAddressInvoice = idAddressInvoice;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public boolean getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    public boolean getGift() {
        return gift;
    }

    public void setGift(boolean gift) {
        this.gift = gift;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public boolean getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(boolean mobileTheme) {
        this.mobileTheme = mobileTheme;
    }

    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    public BigDecimal getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(BigDecimal totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public BigDecimal getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }

    public void setTotalDiscountsTaxIncl(BigDecimal totalDiscountsTaxIncl) {
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
    }

    public BigDecimal getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }

    public void setTotalDiscountsTaxExcl(BigDecimal totalDiscountsTaxExcl) {
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    public BigDecimal getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public BigDecimal getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public BigDecimal getTotalPaidReal() {
        return totalPaidReal;
    }

    public void setTotalPaidReal(BigDecimal totalPaidReal) {
        this.totalPaidReal = totalPaidReal;
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

    public BigDecimal getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(BigDecimal totalShipping) {
        this.totalShipping = totalShipping;
    }

    public BigDecimal getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public BigDecimal getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public BigDecimal getCarrierTaxRate() {
        return carrierTaxRate;
    }

    public void setCarrierTaxRate(BigDecimal carrierTaxRate) {
        this.carrierTaxRate = carrierTaxRate;
    }

    public BigDecimal getTotalWrapping() {
        return totalWrapping;
    }

    public void setTotalWrapping(BigDecimal totalWrapping) {
        this.totalWrapping = totalWrapping;
    }

    public BigDecimal getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public BigDecimal getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public boolean getRoundMode() {
        return roundMode;
    }

    public void setRoundMode(boolean roundMode) {
        this.roundMode = roundMode;
    }

    public boolean getRoundType() {
        return roundType;
    }

    public void setRoundType(boolean roundType) {
        this.roundType = roundType;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(Date dateUpd) {
        this.dateUpd = dateUpd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrders)) {
            return false;
        }
        PsikOrders other = (PsikOrders) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrders[ idOrder=" + idOrder + " ]";
    }
    
}
