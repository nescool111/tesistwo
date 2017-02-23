/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.opencart;

import java.io.Serializable;
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
@Table(name = "oc5q_order_download")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderDownload.findAll", query = "SELECT o FROM Oc5qOrderDownload o")})
public class Oc5qOrderDownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_download_id")
    private Integer orderDownloadId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "order_product_id")
    private int orderProductId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @Column(name = "mask")
    private String mask;
    @Basic(optional = false)
    @Column(name = "remaining")
    private int remaining;

    public Oc5qOrderDownload() {
    }

    public Oc5qOrderDownload(Integer orderDownloadId) {
        this.orderDownloadId = orderDownloadId;
    }

    public Oc5qOrderDownload(Integer orderDownloadId, int orderId, int orderProductId, String name, String filename, String mask, int remaining) {
        this.orderDownloadId = orderDownloadId;
        this.orderId = orderId;
        this.orderProductId = orderProductId;
        this.name = name;
        this.filename = filename;
        this.mask = mask;
        this.remaining = remaining;
    }

    public Integer getOrderDownloadId() {
        return orderDownloadId;
    }

    public void setOrderDownloadId(Integer orderDownloadId) {
        this.orderDownloadId = orderDownloadId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(int orderProductId) {
        this.orderProductId = orderProductId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDownloadId != null ? orderDownloadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrderDownload)) {
            return false;
        }
        Oc5qOrderDownload other = (Oc5qOrderDownload) object;
        if ((this.orderDownloadId == null && other.orderDownloadId != null) || (this.orderDownloadId != null && !this.orderDownloadId.equals(other.orderDownloadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderDownload[ orderDownloadId=" + orderDownloadId + " ]";
    }
    
}
