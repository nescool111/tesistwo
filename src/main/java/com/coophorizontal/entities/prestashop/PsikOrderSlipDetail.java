/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.prestashop;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "psik_order_slip_detail")
@NamedQueries({
    @NamedQuery(name = "PsikOrderSlipDetail.findAll", query = "SELECT p FROM PsikOrderSlipDetail p")})
public class PsikOrderSlipDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsikOrderSlipDetailPK psikOrderSlipDetailPK;
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "unit_price_tax_excl")
    private BigDecimal unitPriceTaxExcl;
    @Column(name = "unit_price_tax_incl")
    private BigDecimal unitPriceTaxIncl;
    @Column(name = "total_price_tax_excl")
    private BigDecimal totalPriceTaxExcl;
    @Column(name = "total_price_tax_incl")
    private BigDecimal totalPriceTaxIncl;
    @Column(name = "amount_tax_excl")
    private BigDecimal amountTaxExcl;
    @Column(name = "amount_tax_incl")
    private BigDecimal amountTaxIncl;

    public PsikOrderSlipDetail() {
    }

    public PsikOrderSlipDetail(PsikOrderSlipDetailPK psikOrderSlipDetailPK) {
        this.psikOrderSlipDetailPK = psikOrderSlipDetailPK;
    }

    public PsikOrderSlipDetail(PsikOrderSlipDetailPK psikOrderSlipDetailPK, int productQuantity) {
        this.psikOrderSlipDetailPK = psikOrderSlipDetailPK;
        this.productQuantity = productQuantity;
    }

    public PsikOrderSlipDetail(int idOrderSlip, int idOrderDetail) {
        this.psikOrderSlipDetailPK = new PsikOrderSlipDetailPK(idOrderSlip, idOrderDetail);
    }

    public PsikOrderSlipDetailPK getPsikOrderSlipDetailPK() {
        return psikOrderSlipDetailPK;
    }

    public void setPsikOrderSlipDetailPK(PsikOrderSlipDetailPK psikOrderSlipDetailPK) {
        this.psikOrderSlipDetailPK = psikOrderSlipDetailPK;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getAmountTaxExcl() {
        return amountTaxExcl;
    }

    public void setAmountTaxExcl(BigDecimal amountTaxExcl) {
        this.amountTaxExcl = amountTaxExcl;
    }

    public BigDecimal getAmountTaxIncl() {
        return amountTaxIncl;
    }

    public void setAmountTaxIncl(BigDecimal amountTaxIncl) {
        this.amountTaxIncl = amountTaxIncl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psikOrderSlipDetailPK != null ? psikOrderSlipDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderSlipDetail)) {
            return false;
        }
        PsikOrderSlipDetail other = (PsikOrderSlipDetail) object;
        if ((this.psikOrderSlipDetailPK == null && other.psikOrderSlipDetailPK != null) || (this.psikOrderSlipDetailPK != null && !this.psikOrderSlipDetailPK.equals(other.psikOrderSlipDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderSlipDetail[ psikOrderSlipDetailPK=" + psikOrderSlipDetailPK + " ]";
    }
    
}
