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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "psik_order_cart_rule")
@NamedQueries({
    @NamedQuery(name = "PsikOrderCartRule.findAll", query = "SELECT p FROM PsikOrderCartRule p")})
public class PsikOrderCartRule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_cart_rule")
    private Integer idOrderCartRule;
    @Basic(optional = false)
    @Column(name = "id_order")
    private int idOrder;
    @Basic(optional = false)
    @Column(name = "id_cart_rule")
    private int idCartRule;
    @Column(name = "id_order_invoice")
    private Integer idOrderInvoice;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "value")
    private BigDecimal value;
    @Basic(optional = false)
    @Column(name = "value_tax_excl")
    private BigDecimal valueTaxExcl;
    @Basic(optional = false)
    @Column(name = "free_shipping")
    private boolean freeShipping;

    public PsikOrderCartRule() {
    }

    public PsikOrderCartRule(Integer idOrderCartRule) {
        this.idOrderCartRule = idOrderCartRule;
    }

    public PsikOrderCartRule(Integer idOrderCartRule, int idOrder, int idCartRule, String name, BigDecimal value, BigDecimal valueTaxExcl, boolean freeShipping) {
        this.idOrderCartRule = idOrderCartRule;
        this.idOrder = idOrder;
        this.idCartRule = idCartRule;
        this.name = name;
        this.value = value;
        this.valueTaxExcl = valueTaxExcl;
        this.freeShipping = freeShipping;
    }

    public Integer getIdOrderCartRule() {
        return idOrderCartRule;
    }

    public void setIdOrderCartRule(Integer idOrderCartRule) {
        this.idOrderCartRule = idOrderCartRule;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdCartRule() {
        return idCartRule;
    }

    public void setIdCartRule(int idCartRule) {
        this.idCartRule = idCartRule;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValueTaxExcl() {
        return valueTaxExcl;
    }

    public void setValueTaxExcl(BigDecimal valueTaxExcl) {
        this.valueTaxExcl = valueTaxExcl;
    }

    public boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderCartRule != null ? idOrderCartRule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderCartRule)) {
            return false;
        }
        PsikOrderCartRule other = (PsikOrderCartRule) object;
        if ((this.idOrderCartRule == null && other.idOrderCartRule != null) || (this.idOrderCartRule != null && !this.idOrderCartRule.equals(other.idOrderCartRule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderCartRule[ idOrderCartRule=" + idOrderCartRule + " ]";
    }
    
}
