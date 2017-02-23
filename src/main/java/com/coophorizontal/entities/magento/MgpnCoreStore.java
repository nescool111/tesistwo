/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_core_store")
@NamedQueries({
    @NamedQuery(name = "MgpnCoreStore.findAll", query = "SELECT m FROM MgpnCoreStore m")})
public class MgpnCoreStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_id")
    private Short storeId;
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "sort_order")
    private short sortOrder;
    @Basic(optional = false)
    @Column(name = "is_active")
    private short isActive;
    @OneToMany(mappedBy = "mgpnCoreStore")
    private List<MgpnCustomerEntity> mgpnCustomerEntityList;
    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
    @ManyToOne(optional = false)
    private MgpnCoreStoreGroup mgpnCoreStoreGroup;
    @JoinColumn(name = "website_id", referencedColumnName = "website_id")
    @ManyToOne(optional = false)
    private MgpnCoreWebsite mgpnCoreWebsite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnCoreStore")
    private List<MgpnSalesOrderStatusLabel> mgpnSalesOrderStatusLabelList;
    @OneToMany(mappedBy = "mgpnCoreStore")
    private List<MgpnSalesFlatOrder> mgpnSalesFlatOrderList;
    @OneToMany(mappedBy = "mgpnCoreStore")
    private List<MgpnSalesOrderAggregatedUpdated> mgpnSalesOrderAggregatedUpdatedList;
    @OneToMany(mappedBy = "mgpnCoreStore")
    private List<MgpnSalesOrderAggregatedCreated> mgpnSalesOrderAggregatedCreatedList;
    @OneToMany(mappedBy = "mgpnCoreStore")
    private List<MgpnSalesFlatOrderItem> mgpnSalesFlatOrderItemList;

    public MgpnCoreStore() {
    }

    public MgpnCoreStore(Short storeId) {
        this.storeId = storeId;
    }

    public MgpnCoreStore(Short storeId, String name, short sortOrder, short isActive) {
        this.storeId = storeId;
        this.name = name;
        this.sortOrder = sortOrder;
        this.isActive = isActive;
    }

    public Short getStoreId() {
        return storeId;
    }

    public void setStoreId(Short storeId) {
        this.storeId = storeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public List<MgpnCustomerEntity> getMgpnCustomerEntityList() {
        return mgpnCustomerEntityList;
    }

    public void setMgpnCustomerEntityList(List<MgpnCustomerEntity> mgpnCustomerEntityList) {
        this.mgpnCustomerEntityList = mgpnCustomerEntityList;
    }

    public MgpnCoreStoreGroup getMgpnCoreStoreGroup() {
        return mgpnCoreStoreGroup;
    }

    public void setMgpnCoreStoreGroup(MgpnCoreStoreGroup mgpnCoreStoreGroup) {
        this.mgpnCoreStoreGroup = mgpnCoreStoreGroup;
    }

    public MgpnCoreWebsite getMgpnCoreWebsite() {
        return mgpnCoreWebsite;
    }

    public void setMgpnCoreWebsite(MgpnCoreWebsite mgpnCoreWebsite) {
        this.mgpnCoreWebsite = mgpnCoreWebsite;
    }

    public List<MgpnSalesOrderStatusLabel> getMgpnSalesOrderStatusLabelList() {
        return mgpnSalesOrderStatusLabelList;
    }

    public void setMgpnSalesOrderStatusLabelList(List<MgpnSalesOrderStatusLabel> mgpnSalesOrderStatusLabelList) {
        this.mgpnSalesOrderStatusLabelList = mgpnSalesOrderStatusLabelList;
    }

    public List<MgpnSalesFlatOrder> getMgpnSalesFlatOrderList() {
        return mgpnSalesFlatOrderList;
    }

    public void setMgpnSalesFlatOrderList(List<MgpnSalesFlatOrder> mgpnSalesFlatOrderList) {
        this.mgpnSalesFlatOrderList = mgpnSalesFlatOrderList;
    }

    public List<MgpnSalesOrderAggregatedUpdated> getMgpnSalesOrderAggregatedUpdatedList() {
        return mgpnSalesOrderAggregatedUpdatedList;
    }

    public void setMgpnSalesOrderAggregatedUpdatedList(List<MgpnSalesOrderAggregatedUpdated> mgpnSalesOrderAggregatedUpdatedList) {
        this.mgpnSalesOrderAggregatedUpdatedList = mgpnSalesOrderAggregatedUpdatedList;
    }

    public List<MgpnSalesOrderAggregatedCreated> getMgpnSalesOrderAggregatedCreatedList() {
        return mgpnSalesOrderAggregatedCreatedList;
    }

    public void setMgpnSalesOrderAggregatedCreatedList(List<MgpnSalesOrderAggregatedCreated> mgpnSalesOrderAggregatedCreatedList) {
        this.mgpnSalesOrderAggregatedCreatedList = mgpnSalesOrderAggregatedCreatedList;
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
        hash += (storeId != null ? storeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnCoreStore)) {
            return false;
        }
        MgpnCoreStore other = (MgpnCoreStore) object;
        if ((this.storeId == null && other.storeId != null) || (this.storeId != null && !this.storeId.equals(other.storeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnCoreStore[ storeId=" + storeId + " ]";
    }
    
}
