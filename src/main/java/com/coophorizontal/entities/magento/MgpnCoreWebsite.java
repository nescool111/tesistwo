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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_core_website")
@NamedQueries({
    @NamedQuery(name = "MgpnCoreWebsite.findAll", query = "SELECT m FROM MgpnCoreWebsite m")})
public class MgpnCoreWebsite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "website_id")
    private Short websiteId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "sort_order")
    private short sortOrder;
    @Basic(optional = false)
    @Column(name = "default_group_id")
    private short defaultGroupId;
    @Column(name = "is_default")
    private Short isDefault;
    @OneToMany(mappedBy = "mgpnCoreWebsite")
    private List<MgpnCustomerEntity> mgpnCustomerEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnCoreWebsite")
    private List<MgpnCoreStore> mgpnCoreStoreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnCoreWebsite")
    private List<MgpnCoreStoreGroup> mgpnCoreStoreGroupList;

    public MgpnCoreWebsite() {
    }

    public MgpnCoreWebsite(Short websiteId) {
        this.websiteId = websiteId;
    }

    public MgpnCoreWebsite(Short websiteId, short sortOrder, short defaultGroupId) {
        this.websiteId = websiteId;
        this.sortOrder = sortOrder;
        this.defaultGroupId = defaultGroupId;
    }

    public Short getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Short websiteId) {
        this.websiteId = websiteId;
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

    public short getDefaultGroupId() {
        return defaultGroupId;
    }

    public void setDefaultGroupId(short defaultGroupId) {
        this.defaultGroupId = defaultGroupId;
    }

    public Short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Short isDefault) {
        this.isDefault = isDefault;
    }

    public List<MgpnCustomerEntity> getMgpnCustomerEntityList() {
        return mgpnCustomerEntityList;
    }

    public void setMgpnCustomerEntityList(List<MgpnCustomerEntity> mgpnCustomerEntityList) {
        this.mgpnCustomerEntityList = mgpnCustomerEntityList;
    }

    public List<MgpnCoreStore> getMgpnCoreStoreList() {
        return mgpnCoreStoreList;
    }

    public void setMgpnCoreStoreList(List<MgpnCoreStore> mgpnCoreStoreList) {
        this.mgpnCoreStoreList = mgpnCoreStoreList;
    }

    public List<MgpnCoreStoreGroup> getMgpnCoreStoreGroupList() {
        return mgpnCoreStoreGroupList;
    }

    public void setMgpnCoreStoreGroupList(List<MgpnCoreStoreGroup> mgpnCoreStoreGroupList) {
        this.mgpnCoreStoreGroupList = mgpnCoreStoreGroupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (websiteId != null ? websiteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnCoreWebsite)) {
            return false;
        }
        MgpnCoreWebsite other = (MgpnCoreWebsite) object;
        if ((this.websiteId == null && other.websiteId != null) || (this.websiteId != null && !this.websiteId.equals(other.websiteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnCoreWebsite[ websiteId=" + websiteId + " ]";
    }
    
}
