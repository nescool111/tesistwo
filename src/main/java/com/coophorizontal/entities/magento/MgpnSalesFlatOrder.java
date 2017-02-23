/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_sales_flat_order")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesFlatOrder.findAll", query = "SELECT m FROM MgpnSalesFlatOrder m")})
public class MgpnSalesFlatOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entity_id")
    private Integer entityId;
    @Column(name = "state")
    private String state;
    @Column(name = "status")
    private String status;
    @Column(name = "coupon_code")
    private String couponCode;
    @Column(name = "protect_code")
    private String protectCode;
    @Column(name = "shipping_description")
    private String shippingDescription;
    @Column(name = "is_virtual")
    private Short isVirtual;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "base_discount_amount")
    private BigDecimal baseDiscountAmount;
    @Column(name = "base_discount_canceled")
    private BigDecimal baseDiscountCanceled;
    @Column(name = "base_discount_invoiced")
    private BigDecimal baseDiscountInvoiced;
    @Column(name = "base_discount_refunded")
    private BigDecimal baseDiscountRefunded;
    @Column(name = "base_grand_total")
    private BigDecimal baseGrandTotal;
    @Column(name = "base_shipping_amount")
    private BigDecimal baseShippingAmount;
    @Column(name = "base_shipping_canceled")
    private BigDecimal baseShippingCanceled;
    @Column(name = "base_shipping_invoiced")
    private BigDecimal baseShippingInvoiced;
    @Column(name = "base_shipping_refunded")
    private BigDecimal baseShippingRefunded;
    @Column(name = "base_shipping_tax_amount")
    private BigDecimal baseShippingTaxAmount;
    @Column(name = "base_shipping_tax_refunded")
    private BigDecimal baseShippingTaxRefunded;
    @Column(name = "base_subtotal")
    private BigDecimal baseSubtotal;
    @Column(name = "base_subtotal_canceled")
    private BigDecimal baseSubtotalCanceled;
    @Column(name = "base_subtotal_invoiced")
    private BigDecimal baseSubtotalInvoiced;
    @Column(name = "base_subtotal_refunded")
    private BigDecimal baseSubtotalRefunded;
    @Column(name = "base_tax_amount")
    private BigDecimal baseTaxAmount;
    @Column(name = "base_tax_canceled")
    private BigDecimal baseTaxCanceled;
    @Column(name = "base_tax_invoiced")
    private BigDecimal baseTaxInvoiced;
    @Column(name = "base_tax_refunded")
    private BigDecimal baseTaxRefunded;
    @Column(name = "base_to_global_rate")
    private BigDecimal baseToGlobalRate;
    @Column(name = "base_to_order_rate")
    private BigDecimal baseToOrderRate;
    @Column(name = "base_total_canceled")
    private BigDecimal baseTotalCanceled;
    @Column(name = "base_total_invoiced")
    private BigDecimal baseTotalInvoiced;
    @Column(name = "base_total_invoiced_cost")
    private BigDecimal baseTotalInvoicedCost;
    @Column(name = "base_total_offline_refunded")
    private BigDecimal baseTotalOfflineRefunded;
    @Column(name = "base_total_online_refunded")
    private BigDecimal baseTotalOnlineRefunded;
    @Column(name = "base_total_paid")
    private BigDecimal baseTotalPaid;
    @Column(name = "base_total_qty_ordered")
    private BigDecimal baseTotalQtyOrdered;
    @Column(name = "base_total_refunded")
    private BigDecimal baseTotalRefunded;
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;
    @Column(name = "discount_canceled")
    private BigDecimal discountCanceled;
    @Column(name = "discount_invoiced")
    private BigDecimal discountInvoiced;
    @Column(name = "discount_refunded")
    private BigDecimal discountRefunded;
    @Column(name = "grand_total")
    private BigDecimal grandTotal;
    @Column(name = "shipping_amount")
    private BigDecimal shippingAmount;
    @Column(name = "shipping_canceled")
    private BigDecimal shippingCanceled;
    @Column(name = "shipping_invoiced")
    private BigDecimal shippingInvoiced;
    @Column(name = "shipping_refunded")
    private BigDecimal shippingRefunded;
    @Column(name = "shipping_tax_amount")
    private BigDecimal shippingTaxAmount;
    @Column(name = "shipping_tax_refunded")
    private BigDecimal shippingTaxRefunded;
    @Column(name = "store_to_base_rate")
    private BigDecimal storeToBaseRate;
    @Column(name = "store_to_order_rate")
    private BigDecimal storeToOrderRate;
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Column(name = "subtotal_canceled")
    private BigDecimal subtotalCanceled;
    @Column(name = "subtotal_invoiced")
    private BigDecimal subtotalInvoiced;
    @Column(name = "subtotal_refunded")
    private BigDecimal subtotalRefunded;
    @Column(name = "tax_amount")
    private BigDecimal taxAmount;
    @Column(name = "tax_canceled")
    private BigDecimal taxCanceled;
    @Column(name = "tax_invoiced")
    private BigDecimal taxInvoiced;
    @Column(name = "tax_refunded")
    private BigDecimal taxRefunded;
    @Column(name = "total_canceled")
    private BigDecimal totalCanceled;
    @Column(name = "total_invoiced")
    private BigDecimal totalInvoiced;
    @Column(name = "total_offline_refunded")
    private BigDecimal totalOfflineRefunded;
    @Column(name = "total_online_refunded")
    private BigDecimal totalOnlineRefunded;
    @Column(name = "total_paid")
    private BigDecimal totalPaid;
    @Column(name = "total_qty_ordered")
    private BigDecimal totalQtyOrdered;
    @Column(name = "total_refunded")
    private BigDecimal totalRefunded;
    @Column(name = "can_ship_partially")
    private Short canShipPartially;
    @Column(name = "can_ship_partially_item")
    private Short canShipPartiallyItem;
    @Column(name = "customer_is_guest")
    private Short customerIsGuest;
    @Column(name = "customer_note_notify")
    private Short customerNoteNotify;
    @Column(name = "billing_address_id")
    private Integer billingAddressId;
    @Column(name = "customer_group_id")
    private Short customerGroupId;
    @Column(name = "edit_increment")
    private Integer editIncrement;
    @Column(name = "email_sent")
    private Short emailSent;
    @Column(name = "forced_shipment_with_invoice")
    private Short forcedShipmentWithInvoice;
    @Column(name = "payment_auth_expiration")
    private Integer paymentAuthExpiration;
    @Column(name = "quote_address_id")
    private Integer quoteAddressId;
    @Column(name = "quote_id")
    private Integer quoteId;
    @Column(name = "shipping_address_id")
    private Integer shippingAddressId;
    @Column(name = "adjustment_negative")
    private BigDecimal adjustmentNegative;
    @Column(name = "adjustment_positive")
    private BigDecimal adjustmentPositive;
    @Column(name = "base_adjustment_negative")
    private BigDecimal baseAdjustmentNegative;
    @Column(name = "base_adjustment_positive")
    private BigDecimal baseAdjustmentPositive;
    @Column(name = "base_shipping_discount_amount")
    private BigDecimal baseShippingDiscountAmount;
    @Column(name = "base_subtotal_incl_tax")
    private BigDecimal baseSubtotalInclTax;
    @Column(name = "base_total_due")
    private BigDecimal baseTotalDue;
    @Column(name = "payment_authorization_amount")
    private BigDecimal paymentAuthorizationAmount;
    @Column(name = "shipping_discount_amount")
    private BigDecimal shippingDiscountAmount;
    @Column(name = "subtotal_incl_tax")
    private BigDecimal subtotalInclTax;
    @Column(name = "total_due")
    private BigDecimal totalDue;
    @Column(name = "weight")
    private BigDecimal weight;
    @Column(name = "customer_dob")
    @Temporal(TemporalType.TIMESTAMP)
    private Date customerDob;
    @Column(name = "increment_id")
    private String incrementId;
    @Column(name = "applied_rule_ids")
    private String appliedRuleIds;
    @Column(name = "base_currency_code")
    private String baseCurrencyCode;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_firstname")
    private String customerFirstname;
    @Column(name = "customer_lastname")
    private String customerLastname;
    @Column(name = "customer_middlename")
    private String customerMiddlename;
    @Column(name = "customer_prefix")
    private String customerPrefix;
    @Column(name = "customer_suffix")
    private String customerSuffix;
    @Column(name = "customer_taxvat")
    private String customerTaxvat;
    @Column(name = "discount_description")
    private String discountDescription;
    @Column(name = "ext_customer_id")
    private String extCustomerId;
    @Column(name = "ext_order_id")
    private String extOrderId;
    @Column(name = "global_currency_code")
    private String globalCurrencyCode;
    @Column(name = "hold_before_state")
    private String holdBeforeState;
    @Column(name = "hold_before_status")
    private String holdBeforeStatus;
    @Column(name = "order_currency_code")
    private String orderCurrencyCode;
    @Column(name = "original_increment_id")
    private String originalIncrementId;
    @Column(name = "relation_child_id")
    private String relationChildId;
    @Column(name = "relation_child_real_id")
    private String relationChildRealId;
    @Column(name = "relation_parent_id")
    private String relationParentId;
    @Column(name = "relation_parent_real_id")
    private String relationParentRealId;
    @Column(name = "remote_ip")
    private String remoteIp;
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Column(name = "store_currency_code")
    private String storeCurrencyCode;
    @Column(name = "store_name")
    private String storeName;
    @Column(name = "x_forwarded_for")
    private String xForwardedFor;
    @Lob
    @Column(name = "customer_note")
    private String customerNote;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic(optional = false)
    @Column(name = "total_item_count")
    private short totalItemCount;
    @Column(name = "customer_gender")
    private Integer customerGender;
    @Column(name = "hidden_tax_amount")
    private BigDecimal hiddenTaxAmount;
    @Column(name = "base_hidden_tax_amount")
    private BigDecimal baseHiddenTaxAmount;
    @Column(name = "shipping_hidden_tax_amount")
    private BigDecimal shippingHiddenTaxAmount;
    @Column(name = "base_shipping_hidden_tax_amnt")
    private BigDecimal baseShippingHiddenTaxAmnt;
    @Column(name = "hidden_tax_invoiced")
    private BigDecimal hiddenTaxInvoiced;
    @Column(name = "base_hidden_tax_invoiced")
    private BigDecimal baseHiddenTaxInvoiced;
    @Column(name = "hidden_tax_refunded")
    private BigDecimal hiddenTaxRefunded;
    @Column(name = "base_hidden_tax_refunded")
    private BigDecimal baseHiddenTaxRefunded;
    @Column(name = "shipping_incl_tax")
    private BigDecimal shippingInclTax;
    @Column(name = "base_shipping_incl_tax")
    private BigDecimal baseShippingInclTax;
    @Column(name = "coupon_rule_name")
    private String couponRuleName;
    @Column(name = "paypal_ipn_customer_notified")
    private Integer paypalIpnCustomerNotified;
    @Column(name = "gift_message_id")
    private Integer giftMessageId;
    @JoinColumn(name = "customer_id", referencedColumnName = "entity_id")
    @ManyToOne
    private MgpnCustomerEntity mgpnCustomerEntity;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    @ManyToOne
    private MgpnCoreStore mgpnCoreStore;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnSalesFlatOrder")
    private List<MgpnSalesFlatOrderItem> mgpnSalesFlatOrderItemList;

    public MgpnSalesFlatOrder() {
    }

    public MgpnSalesFlatOrder(Integer entityId) {
        this.entityId = entityId;
    }

    public MgpnSalesFlatOrder(Integer entityId, short totalItemCount) {
        this.entityId = entityId;
        this.totalItemCount = totalItemCount;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getProtectCode() {
        return protectCode;
    }

    public void setProtectCode(String protectCode) {
        this.protectCode = protectCode;
    }

    public String getShippingDescription() {
        return shippingDescription;
    }

    public void setShippingDescription(String shippingDescription) {
        this.shippingDescription = shippingDescription;
    }

    public Short getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Short isVirtual) {
        this.isVirtual = isVirtual;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getBaseDiscountCanceled() {
        return baseDiscountCanceled;
    }

    public void setBaseDiscountCanceled(BigDecimal baseDiscountCanceled) {
        this.baseDiscountCanceled = baseDiscountCanceled;
    }

    public BigDecimal getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    public void setBaseDiscountInvoiced(BigDecimal baseDiscountInvoiced) {
        this.baseDiscountInvoiced = baseDiscountInvoiced;
    }

    public BigDecimal getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    public void setBaseDiscountRefunded(BigDecimal baseDiscountRefunded) {
        this.baseDiscountRefunded = baseDiscountRefunded;
    }

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
    }

    public BigDecimal getBaseShippingAmount() {
        return baseShippingAmount;
    }

    public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
        this.baseShippingAmount = baseShippingAmount;
    }

    public BigDecimal getBaseShippingCanceled() {
        return baseShippingCanceled;
    }

    public void setBaseShippingCanceled(BigDecimal baseShippingCanceled) {
        this.baseShippingCanceled = baseShippingCanceled;
    }

    public BigDecimal getBaseShippingInvoiced() {
        return baseShippingInvoiced;
    }

    public void setBaseShippingInvoiced(BigDecimal baseShippingInvoiced) {
        this.baseShippingInvoiced = baseShippingInvoiced;
    }

    public BigDecimal getBaseShippingRefunded() {
        return baseShippingRefunded;
    }

    public void setBaseShippingRefunded(BigDecimal baseShippingRefunded) {
        this.baseShippingRefunded = baseShippingRefunded;
    }

    public BigDecimal getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
        this.baseShippingTaxAmount = baseShippingTaxAmount;
    }

    public BigDecimal getBaseShippingTaxRefunded() {
        return baseShippingTaxRefunded;
    }

    public void setBaseShippingTaxRefunded(BigDecimal baseShippingTaxRefunded) {
        this.baseShippingTaxRefunded = baseShippingTaxRefunded;
    }

    public BigDecimal getBaseSubtotal() {
        return baseSubtotal;
    }

    public void setBaseSubtotal(BigDecimal baseSubtotal) {
        this.baseSubtotal = baseSubtotal;
    }

    public BigDecimal getBaseSubtotalCanceled() {
        return baseSubtotalCanceled;
    }

    public void setBaseSubtotalCanceled(BigDecimal baseSubtotalCanceled) {
        this.baseSubtotalCanceled = baseSubtotalCanceled;
    }

    public BigDecimal getBaseSubtotalInvoiced() {
        return baseSubtotalInvoiced;
    }

    public void setBaseSubtotalInvoiced(BigDecimal baseSubtotalInvoiced) {
        this.baseSubtotalInvoiced = baseSubtotalInvoiced;
    }

    public BigDecimal getBaseSubtotalRefunded() {
        return baseSubtotalRefunded;
    }

    public void setBaseSubtotalRefunded(BigDecimal baseSubtotalRefunded) {
        this.baseSubtotalRefunded = baseSubtotalRefunded;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getBaseTaxCanceled() {
        return baseTaxCanceled;
    }

    public void setBaseTaxCanceled(BigDecimal baseTaxCanceled) {
        this.baseTaxCanceled = baseTaxCanceled;
    }

    public BigDecimal getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    public void setBaseTaxInvoiced(BigDecimal baseTaxInvoiced) {
        this.baseTaxInvoiced = baseTaxInvoiced;
    }

    public BigDecimal getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    public void setBaseTaxRefunded(BigDecimal baseTaxRefunded) {
        this.baseTaxRefunded = baseTaxRefunded;
    }

    public BigDecimal getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
        this.baseToGlobalRate = baseToGlobalRate;
    }

    public BigDecimal getBaseToOrderRate() {
        return baseToOrderRate;
    }

    public void setBaseToOrderRate(BigDecimal baseToOrderRate) {
        this.baseToOrderRate = baseToOrderRate;
    }

    public BigDecimal getBaseTotalCanceled() {
        return baseTotalCanceled;
    }

    public void setBaseTotalCanceled(BigDecimal baseTotalCanceled) {
        this.baseTotalCanceled = baseTotalCanceled;
    }

    public BigDecimal getBaseTotalInvoiced() {
        return baseTotalInvoiced;
    }

    public void setBaseTotalInvoiced(BigDecimal baseTotalInvoiced) {
        this.baseTotalInvoiced = baseTotalInvoiced;
    }

    public BigDecimal getBaseTotalInvoicedCost() {
        return baseTotalInvoicedCost;
    }

    public void setBaseTotalInvoicedCost(BigDecimal baseTotalInvoicedCost) {
        this.baseTotalInvoicedCost = baseTotalInvoicedCost;
    }

    public BigDecimal getBaseTotalOfflineRefunded() {
        return baseTotalOfflineRefunded;
    }

    public void setBaseTotalOfflineRefunded(BigDecimal baseTotalOfflineRefunded) {
        this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
    }

    public BigDecimal getBaseTotalOnlineRefunded() {
        return baseTotalOnlineRefunded;
    }

    public void setBaseTotalOnlineRefunded(BigDecimal baseTotalOnlineRefunded) {
        this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
    }

    public BigDecimal getBaseTotalPaid() {
        return baseTotalPaid;
    }

    public void setBaseTotalPaid(BigDecimal baseTotalPaid) {
        this.baseTotalPaid = baseTotalPaid;
    }

    public BigDecimal getBaseTotalQtyOrdered() {
        return baseTotalQtyOrdered;
    }

    public void setBaseTotalQtyOrdered(BigDecimal baseTotalQtyOrdered) {
        this.baseTotalQtyOrdered = baseTotalQtyOrdered;
    }

    public BigDecimal getBaseTotalRefunded() {
        return baseTotalRefunded;
    }

    public void setBaseTotalRefunded(BigDecimal baseTotalRefunded) {
        this.baseTotalRefunded = baseTotalRefunded;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getDiscountCanceled() {
        return discountCanceled;
    }

    public void setDiscountCanceled(BigDecimal discountCanceled) {
        this.discountCanceled = discountCanceled;
    }

    public BigDecimal getDiscountInvoiced() {
        return discountInvoiced;
    }

    public void setDiscountInvoiced(BigDecimal discountInvoiced) {
        this.discountInvoiced = discountInvoiced;
    }

    public BigDecimal getDiscountRefunded() {
        return discountRefunded;
    }

    public void setDiscountRefunded(BigDecimal discountRefunded) {
        this.discountRefunded = discountRefunded;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(BigDecimal shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public BigDecimal getShippingCanceled() {
        return shippingCanceled;
    }

    public void setShippingCanceled(BigDecimal shippingCanceled) {
        this.shippingCanceled = shippingCanceled;
    }

    public BigDecimal getShippingInvoiced() {
        return shippingInvoiced;
    }

    public void setShippingInvoiced(BigDecimal shippingInvoiced) {
        this.shippingInvoiced = shippingInvoiced;
    }

    public BigDecimal getShippingRefunded() {
        return shippingRefunded;
    }

    public void setShippingRefunded(BigDecimal shippingRefunded) {
        this.shippingRefunded = shippingRefunded;
    }

    public BigDecimal getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
        this.shippingTaxAmount = shippingTaxAmount;
    }

    public BigDecimal getShippingTaxRefunded() {
        return shippingTaxRefunded;
    }

    public void setShippingTaxRefunded(BigDecimal shippingTaxRefunded) {
        this.shippingTaxRefunded = shippingTaxRefunded;
    }

    public BigDecimal getStoreToBaseRate() {
        return storeToBaseRate;
    }

    public void setStoreToBaseRate(BigDecimal storeToBaseRate) {
        this.storeToBaseRate = storeToBaseRate;
    }

    public BigDecimal getStoreToOrderRate() {
        return storeToOrderRate;
    }

    public void setStoreToOrderRate(BigDecimal storeToOrderRate) {
        this.storeToOrderRate = storeToOrderRate;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getSubtotalCanceled() {
        return subtotalCanceled;
    }

    public void setSubtotalCanceled(BigDecimal subtotalCanceled) {
        this.subtotalCanceled = subtotalCanceled;
    }

    public BigDecimal getSubtotalInvoiced() {
        return subtotalInvoiced;
    }

    public void setSubtotalInvoiced(BigDecimal subtotalInvoiced) {
        this.subtotalInvoiced = subtotalInvoiced;
    }

    public BigDecimal getSubtotalRefunded() {
        return subtotalRefunded;
    }

    public void setSubtotalRefunded(BigDecimal subtotalRefunded) {
        this.subtotalRefunded = subtotalRefunded;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxCanceled() {
        return taxCanceled;
    }

    public void setTaxCanceled(BigDecimal taxCanceled) {
        this.taxCanceled = taxCanceled;
    }

    public BigDecimal getTaxInvoiced() {
        return taxInvoiced;
    }

    public void setTaxInvoiced(BigDecimal taxInvoiced) {
        this.taxInvoiced = taxInvoiced;
    }

    public BigDecimal getTaxRefunded() {
        return taxRefunded;
    }

    public void setTaxRefunded(BigDecimal taxRefunded) {
        this.taxRefunded = taxRefunded;
    }

    public BigDecimal getTotalCanceled() {
        return totalCanceled;
    }

    public void setTotalCanceled(BigDecimal totalCanceled) {
        this.totalCanceled = totalCanceled;
    }

    public BigDecimal getTotalInvoiced() {
        return totalInvoiced;
    }

    public void setTotalInvoiced(BigDecimal totalInvoiced) {
        this.totalInvoiced = totalInvoiced;
    }

    public BigDecimal getTotalOfflineRefunded() {
        return totalOfflineRefunded;
    }

    public void setTotalOfflineRefunded(BigDecimal totalOfflineRefunded) {
        this.totalOfflineRefunded = totalOfflineRefunded;
    }

    public BigDecimal getTotalOnlineRefunded() {
        return totalOnlineRefunded;
    }

    public void setTotalOnlineRefunded(BigDecimal totalOnlineRefunded) {
        this.totalOnlineRefunded = totalOnlineRefunded;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    public BigDecimal getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    public void setTotalQtyOrdered(BigDecimal totalQtyOrdered) {
        this.totalQtyOrdered = totalQtyOrdered;
    }

    public BigDecimal getTotalRefunded() {
        return totalRefunded;
    }

    public void setTotalRefunded(BigDecimal totalRefunded) {
        this.totalRefunded = totalRefunded;
    }

    public Short getCanShipPartially() {
        return canShipPartially;
    }

    public void setCanShipPartially(Short canShipPartially) {
        this.canShipPartially = canShipPartially;
    }

    public Short getCanShipPartiallyItem() {
        return canShipPartiallyItem;
    }

    public void setCanShipPartiallyItem(Short canShipPartiallyItem) {
        this.canShipPartiallyItem = canShipPartiallyItem;
    }

    public Short getCustomerIsGuest() {
        return customerIsGuest;
    }

    public void setCustomerIsGuest(Short customerIsGuest) {
        this.customerIsGuest = customerIsGuest;
    }

    public Short getCustomerNoteNotify() {
        return customerNoteNotify;
    }

    public void setCustomerNoteNotify(Short customerNoteNotify) {
        this.customerNoteNotify = customerNoteNotify;
    }

    public Integer getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Integer billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public Short getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Short customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public Integer getEditIncrement() {
        return editIncrement;
    }

    public void setEditIncrement(Integer editIncrement) {
        this.editIncrement = editIncrement;
    }

    public Short getEmailSent() {
        return emailSent;
    }

    public void setEmailSent(Short emailSent) {
        this.emailSent = emailSent;
    }

    public Short getForcedShipmentWithInvoice() {
        return forcedShipmentWithInvoice;
    }

    public void setForcedShipmentWithInvoice(Short forcedShipmentWithInvoice) {
        this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
    }

    public Integer getPaymentAuthExpiration() {
        return paymentAuthExpiration;
    }

    public void setPaymentAuthExpiration(Integer paymentAuthExpiration) {
        this.paymentAuthExpiration = paymentAuthExpiration;
    }

    public Integer getQuoteAddressId() {
        return quoteAddressId;
    }

    public void setQuoteAddressId(Integer quoteAddressId) {
        this.quoteAddressId = quoteAddressId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(Integer shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public BigDecimal getAdjustmentNegative() {
        return adjustmentNegative;
    }

    public void setAdjustmentNegative(BigDecimal adjustmentNegative) {
        this.adjustmentNegative = adjustmentNegative;
    }

    public BigDecimal getAdjustmentPositive() {
        return adjustmentPositive;
    }

    public void setAdjustmentPositive(BigDecimal adjustmentPositive) {
        this.adjustmentPositive = adjustmentPositive;
    }

    public BigDecimal getBaseAdjustmentNegative() {
        return baseAdjustmentNegative;
    }

    public void setBaseAdjustmentNegative(BigDecimal baseAdjustmentNegative) {
        this.baseAdjustmentNegative = baseAdjustmentNegative;
    }

    public BigDecimal getBaseAdjustmentPositive() {
        return baseAdjustmentPositive;
    }

    public void setBaseAdjustmentPositive(BigDecimal baseAdjustmentPositive) {
        this.baseAdjustmentPositive = baseAdjustmentPositive;
    }

    public BigDecimal getBaseShippingDiscountAmount() {
        return baseShippingDiscountAmount;
    }

    public void setBaseShippingDiscountAmount(BigDecimal baseShippingDiscountAmount) {
        this.baseShippingDiscountAmount = baseShippingDiscountAmount;
    }

    public BigDecimal getBaseSubtotalInclTax() {
        return baseSubtotalInclTax;
    }

    public void setBaseSubtotalInclTax(BigDecimal baseSubtotalInclTax) {
        this.baseSubtotalInclTax = baseSubtotalInclTax;
    }

    public BigDecimal getBaseTotalDue() {
        return baseTotalDue;
    }

    public void setBaseTotalDue(BigDecimal baseTotalDue) {
        this.baseTotalDue = baseTotalDue;
    }

    public BigDecimal getPaymentAuthorizationAmount() {
        return paymentAuthorizationAmount;
    }

    public void setPaymentAuthorizationAmount(BigDecimal paymentAuthorizationAmount) {
        this.paymentAuthorizationAmount = paymentAuthorizationAmount;
    }

    public BigDecimal getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    public void setShippingDiscountAmount(BigDecimal shippingDiscountAmount) {
        this.shippingDiscountAmount = shippingDiscountAmount;
    }

    public BigDecimal getSubtotalInclTax() {
        return subtotalInclTax;
    }

    public void setSubtotalInclTax(BigDecimal subtotalInclTax) {
        this.subtotalInclTax = subtotalInclTax;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(Date customerDob) {
        this.customerDob = customerDob;
    }

    public String getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(String incrementId) {
        this.incrementId = incrementId;
    }

    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    public void setAppliedRuleIds(String appliedRuleIds) {
        this.appliedRuleIds = appliedRuleIds;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerFirstname() {
        return customerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstname = customerFirstname;
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }

    public String getCustomerMiddlename() {
        return customerMiddlename;
    }

    public void setCustomerMiddlename(String customerMiddlename) {
        this.customerMiddlename = customerMiddlename;
    }

    public String getCustomerPrefix() {
        return customerPrefix;
    }

    public void setCustomerPrefix(String customerPrefix) {
        this.customerPrefix = customerPrefix;
    }

    public String getCustomerSuffix() {
        return customerSuffix;
    }

    public void setCustomerSuffix(String customerSuffix) {
        this.customerSuffix = customerSuffix;
    }

    public String getCustomerTaxvat() {
        return customerTaxvat;
    }

    public void setCustomerTaxvat(String customerTaxvat) {
        this.customerTaxvat = customerTaxvat;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    public String getExtCustomerId() {
        return extCustomerId;
    }

    public void setExtCustomerId(String extCustomerId) {
        this.extCustomerId = extCustomerId;
    }

    public String getExtOrderId() {
        return extOrderId;
    }

    public void setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
    }

    public String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    public void setGlobalCurrencyCode(String globalCurrencyCode) {
        this.globalCurrencyCode = globalCurrencyCode;
    }

    public String getHoldBeforeState() {
        return holdBeforeState;
    }

    public void setHoldBeforeState(String holdBeforeState) {
        this.holdBeforeState = holdBeforeState;
    }

    public String getHoldBeforeStatus() {
        return holdBeforeStatus;
    }

    public void setHoldBeforeStatus(String holdBeforeStatus) {
        this.holdBeforeStatus = holdBeforeStatus;
    }

    public String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    public void setOrderCurrencyCode(String orderCurrencyCode) {
        this.orderCurrencyCode = orderCurrencyCode;
    }

    public String getOriginalIncrementId() {
        return originalIncrementId;
    }

    public void setOriginalIncrementId(String originalIncrementId) {
        this.originalIncrementId = originalIncrementId;
    }

    public String getRelationChildId() {
        return relationChildId;
    }

    public void setRelationChildId(String relationChildId) {
        this.relationChildId = relationChildId;
    }

    public String getRelationChildRealId() {
        return relationChildRealId;
    }

    public void setRelationChildRealId(String relationChildRealId) {
        this.relationChildRealId = relationChildRealId;
    }

    public String getRelationParentId() {
        return relationParentId;
    }

    public void setRelationParentId(String relationParentId) {
        this.relationParentId = relationParentId;
    }

    public String getRelationParentRealId() {
        return relationParentRealId;
    }

    public void setRelationParentRealId(String relationParentRealId) {
        this.relationParentRealId = relationParentRealId;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    public void setStoreCurrencyCode(String storeCurrencyCode) {
        this.storeCurrencyCode = storeCurrencyCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getXForwardedFor() {
        return xForwardedFor;
    }

    public void setXForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public short getTotalItemCount() {
        return totalItemCount;
    }

    public void setTotalItemCount(short totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

    public Integer getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(Integer customerGender) {
        this.customerGender = customerGender;
    }

    public BigDecimal getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
        this.hiddenTaxAmount = hiddenTaxAmount;
    }

    public BigDecimal getBaseHiddenTaxAmount() {
        return baseHiddenTaxAmount;
    }

    public void setBaseHiddenTaxAmount(BigDecimal baseHiddenTaxAmount) {
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
    }

    public BigDecimal getShippingHiddenTaxAmount() {
        return shippingHiddenTaxAmount;
    }

    public void setShippingHiddenTaxAmount(BigDecimal shippingHiddenTaxAmount) {
        this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
    }

    public BigDecimal getBaseShippingHiddenTaxAmnt() {
        return baseShippingHiddenTaxAmnt;
    }

    public void setBaseShippingHiddenTaxAmnt(BigDecimal baseShippingHiddenTaxAmnt) {
        this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
    }

    public BigDecimal getHiddenTaxInvoiced() {
        return hiddenTaxInvoiced;
    }

    public void setHiddenTaxInvoiced(BigDecimal hiddenTaxInvoiced) {
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
    }

    public BigDecimal getBaseHiddenTaxInvoiced() {
        return baseHiddenTaxInvoiced;
    }

    public void setBaseHiddenTaxInvoiced(BigDecimal baseHiddenTaxInvoiced) {
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
    }

    public BigDecimal getHiddenTaxRefunded() {
        return hiddenTaxRefunded;
    }

    public void setHiddenTaxRefunded(BigDecimal hiddenTaxRefunded) {
        this.hiddenTaxRefunded = hiddenTaxRefunded;
    }

    public BigDecimal getBaseHiddenTaxRefunded() {
        return baseHiddenTaxRefunded;
    }

    public void setBaseHiddenTaxRefunded(BigDecimal baseHiddenTaxRefunded) {
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
    }

    public BigDecimal getShippingInclTax() {
        return shippingInclTax;
    }

    public void setShippingInclTax(BigDecimal shippingInclTax) {
        this.shippingInclTax = shippingInclTax;
    }

    public BigDecimal getBaseShippingInclTax() {
        return baseShippingInclTax;
    }

    public void setBaseShippingInclTax(BigDecimal baseShippingInclTax) {
        this.baseShippingInclTax = baseShippingInclTax;
    }

    public String getCouponRuleName() {
        return couponRuleName;
    }

    public void setCouponRuleName(String couponRuleName) {
        this.couponRuleName = couponRuleName;
    }

    public Integer getPaypalIpnCustomerNotified() {
        return paypalIpnCustomerNotified;
    }

    public void setPaypalIpnCustomerNotified(Integer paypalIpnCustomerNotified) {
        this.paypalIpnCustomerNotified = paypalIpnCustomerNotified;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

    public MgpnCustomerEntity getMgpnCustomerEntity() {
        return mgpnCustomerEntity;
    }

    public void setMgpnCustomerEntity(MgpnCustomerEntity mgpnCustomerEntity) {
        this.mgpnCustomerEntity = mgpnCustomerEntity;
    }

    public MgpnCoreStore getMgpnCoreStore() {
        return mgpnCoreStore;
    }

    public void setMgpnCoreStore(MgpnCoreStore mgpnCoreStore) {
        this.mgpnCoreStore = mgpnCoreStore;
    }

    public List<MgpnSalesFlatOrderItem> getMgpnSalesFlatOrderItemList() {
        return mgpnSalesFlatOrderItemList;
    }

    public void setMgpnSalesFlatOrderItemList(List<MgpnSalesFlatOrderItem> mgpnSalesFlatOrderItemList) {
        this.mgpnSalesFlatOrderItemList = mgpnSalesFlatOrderItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityId != null ? entityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesFlatOrder)) {
            return false;
        }
        MgpnSalesFlatOrder other = (MgpnSalesFlatOrder) object;
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesFlatOrder[ entityId=" + entityId + " ]";
    }
    
}
