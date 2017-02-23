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
@Table(name = "oc5q_order_recurring")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderRecurring.findAll", query = "SELECT o FROM Oc5qOrderRecurring o")})
public class Oc5qOrderRecurring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_recurring_id")
    private Integer orderRecurringId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "status")
    private short status;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;
    @Basic(optional = false)
    @Column(name = "profile_id")
    private int profileId;
    @Basic(optional = false)
    @Column(name = "profile_name")
    private String profileName;
    @Basic(optional = false)
    @Column(name = "profile_description")
    private String profileDescription;
    @Basic(optional = false)
    @Column(name = "recurring_frequency")
    private String recurringFrequency;
    @Basic(optional = false)
    @Column(name = "recurring_cycle")
    private short recurringCycle;
    @Basic(optional = false)
    @Column(name = "recurring_duration")
    private short recurringDuration;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "recurring_price")
    private BigDecimal recurringPrice;
    @Basic(optional = false)
    @Column(name = "trial")
    private boolean trial;
    @Basic(optional = false)
    @Column(name = "trial_frequency")
    private String trialFrequency;
    @Basic(optional = false)
    @Column(name = "trial_cycle")
    private short trialCycle;
    @Basic(optional = false)
    @Column(name = "trial_duration")
    private short trialDuration;
    @Basic(optional = false)
    @Column(name = "trial_price")
    private BigDecimal trialPrice;
    @Basic(optional = false)
    @Column(name = "profile_reference")
    private String profileReference;

    public Oc5qOrderRecurring() {
    }

    public Oc5qOrderRecurring(Integer orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public Oc5qOrderRecurring(Integer orderRecurringId, int orderId, Date created, short status, int productId, String productName, int productQuantity, int profileId, String profileName, String profileDescription, String recurringFrequency, short recurringCycle, short recurringDuration, BigDecimal recurringPrice, boolean trial, String trialFrequency, short trialCycle, short trialDuration, BigDecimal trialPrice, String profileReference) {
        this.orderRecurringId = orderRecurringId;
        this.orderId = orderId;
        this.created = created;
        this.status = status;
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.profileId = profileId;
        this.profileName = profileName;
        this.profileDescription = profileDescription;
        this.recurringFrequency = recurringFrequency;
        this.recurringCycle = recurringCycle;
        this.recurringDuration = recurringDuration;
        this.recurringPrice = recurringPrice;
        this.trial = trial;
        this.trialFrequency = trialFrequency;
        this.trialCycle = trialCycle;
        this.trialDuration = trialDuration;
        this.trialPrice = trialPrice;
        this.profileReference = profileReference;
    }

    public Integer getOrderRecurringId() {
        return orderRecurringId;
    }

    public void setOrderRecurringId(Integer orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    public void setRecurringFrequency(String recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }

    public short getRecurringCycle() {
        return recurringCycle;
    }

    public void setRecurringCycle(short recurringCycle) {
        this.recurringCycle = recurringCycle;
    }

    public short getRecurringDuration() {
        return recurringDuration;
    }

    public void setRecurringDuration(short recurringDuration) {
        this.recurringDuration = recurringDuration;
    }

    public BigDecimal getRecurringPrice() {
        return recurringPrice;
    }

    public void setRecurringPrice(BigDecimal recurringPrice) {
        this.recurringPrice = recurringPrice;
    }

    public boolean getTrial() {
        return trial;
    }

    public void setTrial(boolean trial) {
        this.trial = trial;
    }

    public String getTrialFrequency() {
        return trialFrequency;
    }

    public void setTrialFrequency(String trialFrequency) {
        this.trialFrequency = trialFrequency;
    }

    public short getTrialCycle() {
        return trialCycle;
    }

    public void setTrialCycle(short trialCycle) {
        this.trialCycle = trialCycle;
    }

    public short getTrialDuration() {
        return trialDuration;
    }

    public void setTrialDuration(short trialDuration) {
        this.trialDuration = trialDuration;
    }

    public BigDecimal getTrialPrice() {
        return trialPrice;
    }

    public void setTrialPrice(BigDecimal trialPrice) {
        this.trialPrice = trialPrice;
    }

    public String getProfileReference() {
        return profileReference;
    }

    public void setProfileReference(String profileReference) {
        this.profileReference = profileReference;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderRecurringId != null ? orderRecurringId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderRecurring)) {
            return false;
        }
        Oc5qOrderRecurring other = (Oc5qOrderRecurring) object;
        if ((this.orderRecurringId == null && other.orderRecurringId != null) || (this.orderRecurringId != null && !this.orderRecurringId.equals(other.orderRecurringId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderRecurring[ orderRecurringId=" + orderRecurringId + " ]";
    }
    
}
