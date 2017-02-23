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
@Table(name = "psik_order_payment")
@NamedQueries({
    @NamedQuery(name = "PsikOrderPayment.findAll", query = "SELECT p FROM PsikOrderPayment p")})
public class PsikOrderPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_payment")
    private Integer idOrderPayment;
    @Column(name = "order_reference")
    private String orderReference;
    @Basic(optional = false)
    @Column(name = "id_currency")
    private int idCurrency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "payment_method")
    private String paymentMethod;
    @Basic(optional = false)
    @Column(name = "conversion_rate")
    private BigDecimal conversionRate;
    @Column(name = "transaction_id")
    private String transactionId;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "card_brand")
    private String cardBrand;
    @Column(name = "card_expiration")
    private String cardExpiration;
    @Column(name = "card_holder")
    private String cardHolder;
    @Basic(optional = false)
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;

    public PsikOrderPayment() {
    }

    public PsikOrderPayment(Integer idOrderPayment) {
        this.idOrderPayment = idOrderPayment;
    }

    public PsikOrderPayment(Integer idOrderPayment, int idCurrency, BigDecimal amount, String paymentMethod, BigDecimal conversionRate, Date dateAdd) {
        this.idOrderPayment = idOrderPayment;
        this.idCurrency = idCurrency;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.conversionRate = conversionRate;
        this.dateAdd = dateAdd;
    }

    public Integer getIdOrderPayment() {
        return idOrderPayment;
    }

    public void setIdOrderPayment(Integer idOrderPayment) {
        this.idOrderPayment = idOrderPayment;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
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
        hash += (idOrderPayment != null ? idOrderPayment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderPayment)) {
            return false;
        }
        PsikOrderPayment other = (PsikOrderPayment) object;
        if ((this.idOrderPayment == null && other.idOrderPayment != null) || (this.idOrderPayment != null && !this.idOrderPayment.equals(other.idOrderPayment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderPayment[ idOrderPayment=" + idOrderPayment + " ]";
    }
    
}
