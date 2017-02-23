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
@Table(name = "mgpn_sales_flat_order_item")
@NamedQueries({
    @NamedQuery(name = "MgpnSalesFlatOrderItem.findAll", query = "SELECT m FROM MgpnSalesFlatOrderItem m")})
public class MgpnSalesFlatOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Column(name = "parent_item_id")
    private Integer parentItemId;
    @Column(name = "quote_item_id")
    private Integer quoteItemId;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_type")
    private String productType;
    @Lob
    @Column(name = "product_options")
    private String productOptions;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private BigDecimal weight;
    @Column(name = "is_virtual")
    private Short isVirtual;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "applied_rule_ids")
    private String appliedRuleIds;
    @Lob
    @Column(name = "additional_data")
    private String additionalData;
    @Basic(optional = false)
    @Column(name = "free_shipping")
    private short freeShipping;
    @Column(name = "is_qty_decimal")
    private Short isQtyDecimal;
    @Basic(optional = false)
    @Column(name = "no_discount")
    private short noDiscount;
    @Column(name = "qty_backordered")
    private BigDecimal qtyBackordered;
    @Column(name = "qty_canceled")
    private BigDecimal qtyCanceled;
    @Column(name = "qty_invoiced")
    private BigDecimal qtyInvoiced;
    @Column(name = "qty_ordered")
    private BigDecimal qtyOrdered;
    @Column(name = "qty_refunded")
    private BigDecimal qtyRefunded;
    @Column(name = "qty_shipped")
    private BigDecimal qtyShipped;
    @Column(name = "base_cost")
    private BigDecimal baseCost;
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @Column(name = "base_price")
    private BigDecimal basePrice;
    @Column(name = "original_price")
    private BigDecimal originalPrice;
    @Column(name = "base_original_price")
    private BigDecimal baseOriginalPrice;
    @Column(name = "tax_percent")
    private BigDecimal taxPercent;
    @Column(name = "tax_amount")
    private BigDecimal taxAmount;
    @Column(name = "base_tax_amount")
    private BigDecimal baseTaxAmount;
    @Column(name = "tax_invoiced")
    private BigDecimal taxInvoiced;
    @Column(name = "base_tax_invoiced")
    private BigDecimal baseTaxInvoiced;
    @Column(name = "discount_percent")
    private BigDecimal discountPercent;
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;
    @Column(name = "base_discount_amount")
    private BigDecimal baseDiscountAmount;
    @Column(name = "discount_invoiced")
    private BigDecimal discountInvoiced;
    @Column(name = "base_discount_invoiced")
    private BigDecimal baseDiscountInvoiced;
    @Column(name = "amount_refunded")
    private BigDecimal amountRefunded;
    @Column(name = "base_amount_refunded")
    private BigDecimal baseAmountRefunded;
    @Basic(optional = false)
    @Column(name = "row_total")
    private BigDecimal rowTotal;
    @Basic(optional = false)
    @Column(name = "base_row_total")
    private BigDecimal baseRowTotal;
    @Basic(optional = false)
    @Column(name = "row_invoiced")
    private BigDecimal rowInvoiced;
    @Basic(optional = false)
    @Column(name = "base_row_invoiced")
    private BigDecimal baseRowInvoiced;
    @Column(name = "row_weight")
    private BigDecimal rowWeight;
    @Column(name = "base_tax_before_discount")
    private BigDecimal baseTaxBeforeDiscount;
    @Column(name = "tax_before_discount")
    private BigDecimal taxBeforeDiscount;
    @Column(name = "ext_order_item_id")
    private String extOrderItemId;
    @Column(name = "locked_do_invoice")
    private Short lockedDoInvoice;
    @Column(name = "locked_do_ship")
    private Short lockedDoShip;
    @Column(name = "price_incl_tax")
    private BigDecimal priceInclTax;
    @Column(name = "base_price_incl_tax")
    private BigDecimal basePriceInclTax;
    @Column(name = "row_total_incl_tax")
    private BigDecimal rowTotalInclTax;
    @Column(name = "base_row_total_incl_tax")
    private BigDecimal baseRowTotalInclTax;
    @Column(name = "hidden_tax_amount")
    private BigDecimal hiddenTaxAmount;
    @Column(name = "base_hidden_tax_amount")
    private BigDecimal baseHiddenTaxAmount;
    @Column(name = "hidden_tax_invoiced")
    private BigDecimal hiddenTaxInvoiced;
    @Column(name = "base_hidden_tax_invoiced")
    private BigDecimal baseHiddenTaxInvoiced;
    @Column(name = "hidden_tax_refunded")
    private BigDecimal hiddenTaxRefunded;
    @Column(name = "base_hidden_tax_refunded")
    private BigDecimal baseHiddenTaxRefunded;
    @Basic(optional = false)
    @Column(name = "is_nominal")
    private int isNominal;
    @Column(name = "tax_canceled")
    private BigDecimal taxCanceled;
    @Column(name = "hidden_tax_canceled")
    private BigDecimal hiddenTaxCanceled;
    @Column(name = "tax_refunded")
    private BigDecimal taxRefunded;
    @Column(name = "base_tax_refunded")
    private BigDecimal baseTaxRefunded;
    @Column(name = "discount_refunded")
    private BigDecimal discountRefunded;
    @Column(name = "base_discount_refunded")
    private BigDecimal baseDiscountRefunded;
    @Column(name = "gift_message_id")
    private Integer giftMessageId;
    @Column(name = "gift_message_available")
    private Integer giftMessageAvailable;
    @Column(name = "base_weee_tax_applied_amount")
    private BigDecimal baseWeeeTaxAppliedAmount;
    @Column(name = "base_weee_tax_applied_row_amnt")
    private BigDecimal baseWeeeTaxAppliedRowAmnt;
    @Column(name = "weee_tax_applied_amount")
    private BigDecimal weeeTaxAppliedAmount;
    @Column(name = "weee_tax_applied_row_amount")
    private BigDecimal weeeTaxAppliedRowAmount;
    @Lob
    @Column(name = "weee_tax_applied")
    private String weeeTaxApplied;
    @Column(name = "weee_tax_disposition")
    private BigDecimal weeeTaxDisposition;
    @Column(name = "weee_tax_row_disposition")
    private BigDecimal weeeTaxRowDisposition;
    @Column(name = "base_weee_tax_disposition")
    private BigDecimal baseWeeeTaxDisposition;
    @Column(name = "base_weee_tax_row_disposition")
    private BigDecimal baseWeeeTaxRowDisposition;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnSalesFlatOrderItem")
    private List<MgpnSalesOrderTaxItem> mgpnSalesOrderTaxItemList;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    @ManyToOne
    private MgpnCoreStore mgpnCoreStore;
    @JoinColumn(name = "order_id", referencedColumnName = "entity_id")
    @ManyToOne(optional = false)
    private MgpnSalesFlatOrder mgpnSalesFlatOrder;

    public MgpnSalesFlatOrderItem() {
    }

    public MgpnSalesFlatOrderItem(Integer itemId) {
        this.itemId = itemId;
    }

    public MgpnSalesFlatOrderItem(Integer itemId, Date createdAt, Date updatedAt, short freeShipping, short noDiscount, BigDecimal price, BigDecimal basePrice, BigDecimal rowTotal, BigDecimal baseRowTotal, BigDecimal rowInvoiced, BigDecimal baseRowInvoiced, int isNominal) {
        this.itemId = itemId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.freeShipping = freeShipping;
        this.noDiscount = noDiscount;
        this.price = price;
        this.basePrice = basePrice;
        this.rowTotal = rowTotal;
        this.baseRowTotal = baseRowTotal;
        this.rowInvoiced = rowInvoiced;
        this.baseRowInvoiced = baseRowInvoiced;
        this.isNominal = isNominal;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public Integer getQuoteItemId() {
        return quoteItemId;
    }

    public void setQuoteItemId(Integer quoteItemId) {
        this.quoteItemId = quoteItemId;
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(String productOptions) {
        this.productOptions = productOptions;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Short getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Short isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    public void setAppliedRuleIds(String appliedRuleIds) {
        this.appliedRuleIds = appliedRuleIds;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public short getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(short freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Short getIsQtyDecimal() {
        return isQtyDecimal;
    }

    public void setIsQtyDecimal(Short isQtyDecimal) {
        this.isQtyDecimal = isQtyDecimal;
    }

    public short getNoDiscount() {
        return noDiscount;
    }

    public void setNoDiscount(short noDiscount) {
        this.noDiscount = noDiscount;
    }

    public BigDecimal getQtyBackordered() {
        return qtyBackordered;
    }

    public void setQtyBackordered(BigDecimal qtyBackordered) {
        this.qtyBackordered = qtyBackordered;
    }

    public BigDecimal getQtyCanceled() {
        return qtyCanceled;
    }

    public void setQtyCanceled(BigDecimal qtyCanceled) {
        this.qtyCanceled = qtyCanceled;
    }

    public BigDecimal getQtyInvoiced() {
        return qtyInvoiced;
    }

    public void setQtyInvoiced(BigDecimal qtyInvoiced) {
        this.qtyInvoiced = qtyInvoiced;
    }

    public BigDecimal getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(BigDecimal qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public BigDecimal getQtyRefunded() {
        return qtyRefunded;
    }

    public void setQtyRefunded(BigDecimal qtyRefunded) {
        this.qtyRefunded = qtyRefunded;
    }

    public BigDecimal getQtyShipped() {
        return qtyShipped;
    }

    public void setQtyShipped(BigDecimal qtyShipped) {
        this.qtyShipped = qtyShipped;
    }

    public BigDecimal getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(BigDecimal baseCost) {
        this.baseCost = baseCost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getBaseOriginalPrice() {
        return baseOriginalPrice;
    }

    public void setBaseOriginalPrice(BigDecimal baseOriginalPrice) {
        this.baseOriginalPrice = baseOriginalPrice;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getTaxInvoiced() {
        return taxInvoiced;
    }

    public void setTaxInvoiced(BigDecimal taxInvoiced) {
        this.taxInvoiced = taxInvoiced;
    }

    public BigDecimal getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    public void setBaseTaxInvoiced(BigDecimal baseTaxInvoiced) {
        this.baseTaxInvoiced = baseTaxInvoiced;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getDiscountInvoiced() {
        return discountInvoiced;
    }

    public void setDiscountInvoiced(BigDecimal discountInvoiced) {
        this.discountInvoiced = discountInvoiced;
    }

    public BigDecimal getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    public void setBaseDiscountInvoiced(BigDecimal baseDiscountInvoiced) {
        this.baseDiscountInvoiced = baseDiscountInvoiced;
    }

    public BigDecimal getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(BigDecimal amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public BigDecimal getBaseAmountRefunded() {
        return baseAmountRefunded;
    }

    public void setBaseAmountRefunded(BigDecimal baseAmountRefunded) {
        this.baseAmountRefunded = baseAmountRefunded;
    }

    public BigDecimal getRowTotal() {
        return rowTotal;
    }

    public void setRowTotal(BigDecimal rowTotal) {
        this.rowTotal = rowTotal;
    }

    public BigDecimal getBaseRowTotal() {
        return baseRowTotal;
    }

    public void setBaseRowTotal(BigDecimal baseRowTotal) {
        this.baseRowTotal = baseRowTotal;
    }

    public BigDecimal getRowInvoiced() {
        return rowInvoiced;
    }

    public void setRowInvoiced(BigDecimal rowInvoiced) {
        this.rowInvoiced = rowInvoiced;
    }

    public BigDecimal getBaseRowInvoiced() {
        return baseRowInvoiced;
    }

    public void setBaseRowInvoiced(BigDecimal baseRowInvoiced) {
        this.baseRowInvoiced = baseRowInvoiced;
    }

    public BigDecimal getRowWeight() {
        return rowWeight;
    }

    public void setRowWeight(BigDecimal rowWeight) {
        this.rowWeight = rowWeight;
    }

    public BigDecimal getBaseTaxBeforeDiscount() {
        return baseTaxBeforeDiscount;
    }

    public void setBaseTaxBeforeDiscount(BigDecimal baseTaxBeforeDiscount) {
        this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
    }

    public BigDecimal getTaxBeforeDiscount() {
        return taxBeforeDiscount;
    }

    public void setTaxBeforeDiscount(BigDecimal taxBeforeDiscount) {
        this.taxBeforeDiscount = taxBeforeDiscount;
    }

    public String getExtOrderItemId() {
        return extOrderItemId;
    }

    public void setExtOrderItemId(String extOrderItemId) {
        this.extOrderItemId = extOrderItemId;
    }

    public Short getLockedDoInvoice() {
        return lockedDoInvoice;
    }

    public void setLockedDoInvoice(Short lockedDoInvoice) {
        this.lockedDoInvoice = lockedDoInvoice;
    }

    public Short getLockedDoShip() {
        return lockedDoShip;
    }

    public void setLockedDoShip(Short lockedDoShip) {
        this.lockedDoShip = lockedDoShip;
    }

    public BigDecimal getPriceInclTax() {
        return priceInclTax;
    }

    public void setPriceInclTax(BigDecimal priceInclTax) {
        this.priceInclTax = priceInclTax;
    }

    public BigDecimal getBasePriceInclTax() {
        return basePriceInclTax;
    }

    public void setBasePriceInclTax(BigDecimal basePriceInclTax) {
        this.basePriceInclTax = basePriceInclTax;
    }

    public BigDecimal getRowTotalInclTax() {
        return rowTotalInclTax;
    }

    public void setRowTotalInclTax(BigDecimal rowTotalInclTax) {
        this.rowTotalInclTax = rowTotalInclTax;
    }

    public BigDecimal getBaseRowTotalInclTax() {
        return baseRowTotalInclTax;
    }

    public void setBaseRowTotalInclTax(BigDecimal baseRowTotalInclTax) {
        this.baseRowTotalInclTax = baseRowTotalInclTax;
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

    public int getIsNominal() {
        return isNominal;
    }

    public void setIsNominal(int isNominal) {
        this.isNominal = isNominal;
    }

    public BigDecimal getTaxCanceled() {
        return taxCanceled;
    }

    public void setTaxCanceled(BigDecimal taxCanceled) {
        this.taxCanceled = taxCanceled;
    }

    public BigDecimal getHiddenTaxCanceled() {
        return hiddenTaxCanceled;
    }

    public void setHiddenTaxCanceled(BigDecimal hiddenTaxCanceled) {
        this.hiddenTaxCanceled = hiddenTaxCanceled;
    }

    public BigDecimal getTaxRefunded() {
        return taxRefunded;
    }

    public void setTaxRefunded(BigDecimal taxRefunded) {
        this.taxRefunded = taxRefunded;
    }

    public BigDecimal getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    public void setBaseTaxRefunded(BigDecimal baseTaxRefunded) {
        this.baseTaxRefunded = baseTaxRefunded;
    }

    public BigDecimal getDiscountRefunded() {
        return discountRefunded;
    }

    public void setDiscountRefunded(BigDecimal discountRefunded) {
        this.discountRefunded = discountRefunded;
    }

    public BigDecimal getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    public void setBaseDiscountRefunded(BigDecimal baseDiscountRefunded) {
        this.baseDiscountRefunded = baseDiscountRefunded;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

    public Integer getGiftMessageAvailable() {
        return giftMessageAvailable;
    }

    public void setGiftMessageAvailable(Integer giftMessageAvailable) {
        this.giftMessageAvailable = giftMessageAvailable;
    }

    public BigDecimal getBaseWeeeTaxAppliedAmount() {
        return baseWeeeTaxAppliedAmount;
    }

    public void setBaseWeeeTaxAppliedAmount(BigDecimal baseWeeeTaxAppliedAmount) {
        this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
    }

    public BigDecimal getBaseWeeeTaxAppliedRowAmnt() {
        return baseWeeeTaxAppliedRowAmnt;
    }

    public void setBaseWeeeTaxAppliedRowAmnt(BigDecimal baseWeeeTaxAppliedRowAmnt) {
        this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
    }

    public BigDecimal getWeeeTaxAppliedAmount() {
        return weeeTaxAppliedAmount;
    }

    public void setWeeeTaxAppliedAmount(BigDecimal weeeTaxAppliedAmount) {
        this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
    }

    public BigDecimal getWeeeTaxAppliedRowAmount() {
        return weeeTaxAppliedRowAmount;
    }

    public void setWeeeTaxAppliedRowAmount(BigDecimal weeeTaxAppliedRowAmount) {
        this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
    }

    public String getWeeeTaxApplied() {
        return weeeTaxApplied;
    }

    public void setWeeeTaxApplied(String weeeTaxApplied) {
        this.weeeTaxApplied = weeeTaxApplied;
    }

    public BigDecimal getWeeeTaxDisposition() {
        return weeeTaxDisposition;
    }

    public void setWeeeTaxDisposition(BigDecimal weeeTaxDisposition) {
        this.weeeTaxDisposition = weeeTaxDisposition;
    }

    public BigDecimal getWeeeTaxRowDisposition() {
        return weeeTaxRowDisposition;
    }

    public void setWeeeTaxRowDisposition(BigDecimal weeeTaxRowDisposition) {
        this.weeeTaxRowDisposition = weeeTaxRowDisposition;
    }

    public BigDecimal getBaseWeeeTaxDisposition() {
        return baseWeeeTaxDisposition;
    }

    public void setBaseWeeeTaxDisposition(BigDecimal baseWeeeTaxDisposition) {
        this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
    }

    public BigDecimal getBaseWeeeTaxRowDisposition() {
        return baseWeeeTaxRowDisposition;
    }

    public void setBaseWeeeTaxRowDisposition(BigDecimal baseWeeeTaxRowDisposition) {
        this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
    }

    public List<MgpnSalesOrderTaxItem> getMgpnSalesOrderTaxItemList() {
        return mgpnSalesOrderTaxItemList;
    }

    public void setMgpnSalesOrderTaxItemList(List<MgpnSalesOrderTaxItem> mgpnSalesOrderTaxItemList) {
        this.mgpnSalesOrderTaxItemList = mgpnSalesOrderTaxItemList;
    }

    public MgpnCoreStore getMgpnCoreStore() {
        return mgpnCoreStore;
    }

    public void setMgpnCoreStore(MgpnCoreStore mgpnCoreStore) {
        this.mgpnCoreStore = mgpnCoreStore;
    }

    public MgpnSalesFlatOrder getMgpnSalesFlatOrder() {
        return mgpnSalesFlatOrder;
    }

    public void setMgpnSalesFlatOrder(MgpnSalesFlatOrder mgpnSalesFlatOrder) {
        this.mgpnSalesFlatOrder = mgpnSalesFlatOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnSalesFlatOrderItem)) {
            return false;
        }
        MgpnSalesFlatOrderItem other = (MgpnSalesFlatOrderItem) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnSalesFlatOrderItem[ itemId=" + itemId + " ]";
    }
    
}
