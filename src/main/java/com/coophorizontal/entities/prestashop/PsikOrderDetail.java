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
@Table(name = "psik_order_detail")
@NamedQueries({
    @NamedQuery(name = "PsikOrderDetail.findAll", query = "SELECT p FROM PsikOrderDetail p")})
public class PsikOrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_detail")
    private Integer idOrderDetail;
    @Basic(optional = false)
    @Column(name = "id_order")
    private int idOrder;
    @Column(name = "id_order_invoice")
    private Integer idOrderInvoice;
    @Column(name = "id_warehouse")
    private Integer idWarehouse;
    @Basic(optional = false)
    @Column(name = "id_shop")
    private int idShop;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_attribute_id")
    private Integer productAttributeId;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;
    @Basic(optional = false)
    @Column(name = "product_quantity_in_stock")
    private int productQuantityInStock;
    @Basic(optional = false)
    @Column(name = "product_quantity_refunded")
    private int productQuantityRefunded;
    @Basic(optional = false)
    @Column(name = "product_quantity_return")
    private int productQuantityReturn;
    @Basic(optional = false)
    @Column(name = "product_quantity_reinjected")
    private int productQuantityReinjected;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Basic(optional = false)
    @Column(name = "reduction_percent")
    private BigDecimal reductionPercent;
    @Basic(optional = false)
    @Column(name = "reduction_amount")
    private BigDecimal reductionAmount;
    @Basic(optional = false)
    @Column(name = "reduction_amount_tax_incl")
    private BigDecimal reductionAmountTaxIncl;
    @Basic(optional = false)
    @Column(name = "reduction_amount_tax_excl")
    private BigDecimal reductionAmountTaxExcl;
    @Basic(optional = false)
    @Column(name = "group_reduction")
    private BigDecimal groupReduction;
    @Basic(optional = false)
    @Column(name = "product_quantity_discount")
    private BigDecimal productQuantityDiscount;
    @Column(name = "product_ean13")
    private String productEan13;
    @Column(name = "product_upc")
    private String productUpc;
    @Column(name = "product_reference")
    private String productReference;
    @Column(name = "product_supplier_reference")
    private String productSupplierReference;
    @Basic(optional = false)
    @Column(name = "product_weight")
    private BigDecimal productWeight;
    @Column(name = "id_tax_rules_group")
    private Integer idTaxRulesGroup;
    @Basic(optional = false)
    @Column(name = "tax_computation_method")
    private boolean taxComputationMethod;
    @Basic(optional = false)
    @Column(name = "tax_name")
    private String taxName;
    @Basic(optional = false)
    @Column(name = "tax_rate")
    private BigDecimal taxRate;
    @Basic(optional = false)
    @Column(name = "ecotax")
    private BigDecimal ecotax;
    @Basic(optional = false)
    @Column(name = "ecotax_tax_rate")
    private BigDecimal ecotaxTaxRate;
    @Basic(optional = false)
    @Column(name = "discount_quantity_applied")
    private boolean discountQuantityApplied;
    @Column(name = "download_hash")
    private String downloadHash;
    @Column(name = "download_nb")
    private Integer downloadNb;
    @Column(name = "download_deadline")
    @Temporal(TemporalType.TIMESTAMP)
    private Date downloadDeadline;
    @Basic(optional = false)
    @Column(name = "total_price_tax_incl")
    private BigDecimal totalPriceTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_price_tax_excl")
    private BigDecimal totalPriceTaxExcl;
    @Basic(optional = false)
    @Column(name = "unit_price_tax_incl")
    private BigDecimal unitPriceTaxIncl;
    @Basic(optional = false)
    @Column(name = "unit_price_tax_excl")
    private BigDecimal unitPriceTaxExcl;
    @Basic(optional = false)
    @Column(name = "total_shipping_price_tax_incl")
    private BigDecimal totalShippingPriceTaxIncl;
    @Basic(optional = false)
    @Column(name = "total_shipping_price_tax_excl")
    private BigDecimal totalShippingPriceTaxExcl;
    @Basic(optional = false)
    @Column(name = "purchase_supplier_price")
    private BigDecimal purchaseSupplierPrice;
    @Basic(optional = false)
    @Column(name = "original_product_price")
    private BigDecimal originalProductPrice;
    @Basic(optional = false)
    @Column(name = "original_wholesale_price")
    private BigDecimal originalWholesalePrice;

    public PsikOrderDetail() {
    }

    public PsikOrderDetail(Integer idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public PsikOrderDetail(Integer idOrderDetail, int idOrder, int idShop, int productId, String productName, int productQuantity, int productQuantityInStock, int productQuantityRefunded, int productQuantityReturn, int productQuantityReinjected, BigDecimal productPrice, BigDecimal reductionPercent, BigDecimal reductionAmount, BigDecimal reductionAmountTaxIncl, BigDecimal reductionAmountTaxExcl, BigDecimal groupReduction, BigDecimal productQuantityDiscount, BigDecimal productWeight, boolean taxComputationMethod, String taxName, BigDecimal taxRate, BigDecimal ecotax, BigDecimal ecotaxTaxRate, boolean discountQuantityApplied, BigDecimal totalPriceTaxIncl, BigDecimal totalPriceTaxExcl, BigDecimal unitPriceTaxIncl, BigDecimal unitPriceTaxExcl, BigDecimal totalShippingPriceTaxIncl, BigDecimal totalShippingPriceTaxExcl, BigDecimal purchaseSupplierPrice, BigDecimal originalProductPrice, BigDecimal originalWholesalePrice) {
        this.idOrderDetail = idOrderDetail;
        this.idOrder = idOrder;
        this.idShop = idShop;
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productQuantityInStock = productQuantityInStock;
        this.productQuantityRefunded = productQuantityRefunded;
        this.productQuantityReturn = productQuantityReturn;
        this.productQuantityReinjected = productQuantityReinjected;
        this.productPrice = productPrice;
        this.reductionPercent = reductionPercent;
        this.reductionAmount = reductionAmount;
        this.reductionAmountTaxIncl = reductionAmountTaxIncl;
        this.reductionAmountTaxExcl = reductionAmountTaxExcl;
        this.groupReduction = groupReduction;
        this.productQuantityDiscount = productQuantityDiscount;
        this.productWeight = productWeight;
        this.taxComputationMethod = taxComputationMethod;
        this.taxName = taxName;
        this.taxRate = taxRate;
        this.ecotax = ecotax;
        this.ecotaxTaxRate = ecotaxTaxRate;
        this.discountQuantityApplied = discountQuantityApplied;
        this.totalPriceTaxIncl = totalPriceTaxIncl;
        this.totalPriceTaxExcl = totalPriceTaxExcl;
        this.unitPriceTaxIncl = unitPriceTaxIncl;
        this.unitPriceTaxExcl = unitPriceTaxExcl;
        this.totalShippingPriceTaxIncl = totalShippingPriceTaxIncl;
        this.totalShippingPriceTaxExcl = totalShippingPriceTaxExcl;
        this.purchaseSupplierPrice = purchaseSupplierPrice;
        this.originalProductPrice = originalProductPrice;
        this.originalWholesalePrice = originalWholesalePrice;
    }

    public Integer getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(Integer idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Integer getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Integer productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductQuantityInStock() {
        return productQuantityInStock;
    }

    public void setProductQuantityInStock(int productQuantityInStock) {
        this.productQuantityInStock = productQuantityInStock;
    }

    public int getProductQuantityRefunded() {
        return productQuantityRefunded;
    }

    public void setProductQuantityRefunded(int productQuantityRefunded) {
        this.productQuantityRefunded = productQuantityRefunded;
    }

    public int getProductQuantityReturn() {
        return productQuantityReturn;
    }

    public void setProductQuantityReturn(int productQuantityReturn) {
        this.productQuantityReturn = productQuantityReturn;
    }

    public int getProductQuantityReinjected() {
        return productQuantityReinjected;
    }

    public void setProductQuantityReinjected(int productQuantityReinjected) {
        this.productQuantityReinjected = productQuantityReinjected;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getReductionAmountTaxIncl() {
        return reductionAmountTaxIncl;
    }

    public void setReductionAmountTaxIncl(BigDecimal reductionAmountTaxIncl) {
        this.reductionAmountTaxIncl = reductionAmountTaxIncl;
    }

    public BigDecimal getReductionAmountTaxExcl() {
        return reductionAmountTaxExcl;
    }

    public void setReductionAmountTaxExcl(BigDecimal reductionAmountTaxExcl) {
        this.reductionAmountTaxExcl = reductionAmountTaxExcl;
    }

    public BigDecimal getGroupReduction() {
        return groupReduction;
    }

    public void setGroupReduction(BigDecimal groupReduction) {
        this.groupReduction = groupReduction;
    }

    public BigDecimal getProductQuantityDiscount() {
        return productQuantityDiscount;
    }

    public void setProductQuantityDiscount(BigDecimal productQuantityDiscount) {
        this.productQuantityDiscount = productQuantityDiscount;
    }

    public String getProductEan13() {
        return productEan13;
    }

    public void setProductEan13(String productEan13) {
        this.productEan13 = productEan13;
    }

    public String getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }

    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public boolean getTaxComputationMethod() {
        return taxComputationMethod;
    }

    public void setTaxComputationMethod(boolean taxComputationMethod) {
        this.taxComputationMethod = taxComputationMethod;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public BigDecimal getEcotaxTaxRate() {
        return ecotaxTaxRate;
    }

    public void setEcotaxTaxRate(BigDecimal ecotaxTaxRate) {
        this.ecotaxTaxRate = ecotaxTaxRate;
    }

    public boolean getDiscountQuantityApplied() {
        return discountQuantityApplied;
    }

    public void setDiscountQuantityApplied(boolean discountQuantityApplied) {
        this.discountQuantityApplied = discountQuantityApplied;
    }

    public String getDownloadHash() {
        return downloadHash;
    }

    public void setDownloadHash(String downloadHash) {
        this.downloadHash = downloadHash;
    }

    public Integer getDownloadNb() {
        return downloadNb;
    }

    public void setDownloadNb(Integer downloadNb) {
        this.downloadNb = downloadNb;
    }

    public Date getDownloadDeadline() {
        return downloadDeadline;
    }

    public void setDownloadDeadline(Date downloadDeadline) {
        this.downloadDeadline = downloadDeadline;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getTotalShippingPriceTaxIncl() {
        return totalShippingPriceTaxIncl;
    }

    public void setTotalShippingPriceTaxIncl(BigDecimal totalShippingPriceTaxIncl) {
        this.totalShippingPriceTaxIncl = totalShippingPriceTaxIncl;
    }

    public BigDecimal getTotalShippingPriceTaxExcl() {
        return totalShippingPriceTaxExcl;
    }

    public void setTotalShippingPriceTaxExcl(BigDecimal totalShippingPriceTaxExcl) {
        this.totalShippingPriceTaxExcl = totalShippingPriceTaxExcl;
    }

    public BigDecimal getPurchaseSupplierPrice() {
        return purchaseSupplierPrice;
    }

    public void setPurchaseSupplierPrice(BigDecimal purchaseSupplierPrice) {
        this.purchaseSupplierPrice = purchaseSupplierPrice;
    }

    public BigDecimal getOriginalProductPrice() {
        return originalProductPrice;
    }

    public void setOriginalProductPrice(BigDecimal originalProductPrice) {
        this.originalProductPrice = originalProductPrice;
    }

    public BigDecimal getOriginalWholesalePrice() {
        return originalWholesalePrice;
    }

    public void setOriginalWholesalePrice(BigDecimal originalWholesalePrice) {
        this.originalWholesalePrice = originalWholesalePrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderDetail != null ? idOrderDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderDetail)) {
            return false;
        }
        PsikOrderDetail other = (PsikOrderDetail) object;
        if ((this.idOrderDetail == null && other.idOrderDetail != null) || (this.idOrderDetail != null && !this.idOrderDetail.equals(other.idOrderDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderDetail[ idOrderDetail=" + idOrderDetail + " ]";
    }
    
}
