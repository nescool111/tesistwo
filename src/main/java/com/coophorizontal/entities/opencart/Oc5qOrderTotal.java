/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.opencart;

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
@Table(name = "oc5q_order_total")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderTotal.findAll", query = "SELECT o FROM Oc5qOrderTotal o")})
public class Oc5qOrderTotal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_total_id")
    private Integer orderTotalId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "text")
    private String text;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "value")
    private BigDecimal value;
    @Basic(optional = false)
    @Column(name = "sort_order")
    private int sortOrder;

    public Oc5qOrderTotal() {
    }

    public Oc5qOrderTotal(Integer orderTotalId) {
        this.orderTotalId = orderTotalId;
    }

    public Oc5qOrderTotal(Integer orderTotalId, int orderId, String code, String title, String text, BigDecimal value, int sortOrder) {
        this.orderTotalId = orderTotalId;
        this.orderId = orderId;
        this.code = code;
        this.title = title;
        this.text = text;
        this.value = value;
        this.sortOrder = sortOrder;
    }

    public Integer getOrderTotalId() {
        return orderTotalId;
    }

    public void setOrderTotalId(Integer orderTotalId) {
        this.orderTotalId = orderTotalId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderTotalId != null ? orderTotalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderTotal)) {
            return false;
        }
        Oc5qOrderTotal other = (Oc5qOrderTotal) object;
        if ((this.orderTotalId == null && other.orderTotalId != null) || (this.orderTotalId != null && !this.orderTotalId.equals(other.orderTotalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderTotal[ orderTotalId=" + orderTotalId + " ]";
    }
    
}
