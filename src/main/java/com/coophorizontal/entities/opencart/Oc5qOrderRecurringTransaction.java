/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.opencart;

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
@Table(name = "oc5q_order_recurring_transaction")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderRecurringTransaction.findAll", query = "SELECT o FROM Oc5qOrderRecurringTransaction o")})
public class Oc5qOrderRecurringTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_recurring_transaction_id")
    private Integer orderRecurringTransactionId;
    @Basic(optional = false)
    @Column(name = "order_recurring_id")
    private int orderRecurringId;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;

    public Oc5qOrderRecurringTransaction() {
    }

    public Oc5qOrderRecurringTransaction(Integer orderRecurringTransactionId) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
    }

    public Oc5qOrderRecurringTransaction(Integer orderRecurringTransactionId, int orderRecurringId, Date created, BigDecimal amount, String type) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
        this.orderRecurringId = orderRecurringId;
        this.created = created;
        this.amount = amount;
        this.type = type;
    }

    public Integer getOrderRecurringTransactionId() {
        return orderRecurringTransactionId;
    }

    public void setOrderRecurringTransactionId(Integer orderRecurringTransactionId) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
    }

    public int getOrderRecurringId() {
        return orderRecurringId;
    }

    public void setOrderRecurringId(int orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderRecurringTransactionId != null ? orderRecurringTransactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderRecurringTransaction)) {
            return false;
        }
        Oc5qOrderRecurringTransaction other = (Oc5qOrderRecurringTransaction) object;
        if ((this.orderRecurringTransactionId == null && other.orderRecurringTransactionId != null) || (this.orderRecurringTransactionId != null && !this.orderRecurringTransactionId.equals(other.orderRecurringTransactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderRecurringTransaction[ orderRecurringTransactionId=" + orderRecurringTransactionId + " ]";
    }
    
}
