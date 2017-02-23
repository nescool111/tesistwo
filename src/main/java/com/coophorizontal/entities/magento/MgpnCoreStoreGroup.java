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
@Table(name = "mgpn_core_store_group")
@NamedQueries({
    @NamedQuery(name = "MgpnCoreStoreGroup.findAll", query = "SELECT m FROM MgpnCoreStoreGroup m")})
public class MgpnCoreStoreGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "group_id")
    private Short groupId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "root_category_id")
    private int rootCategoryId;
    @Basic(optional = false)
    @Column(name = "default_store_id")
    private short defaultStoreId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mgpnCoreStoreGroup")
    private List<MgpnCoreStore> mgpnCoreStoreList;
    @JoinColumn(name = "website_id", referencedColumnName = "website_id")
    @ManyToOne(optional = false)
    private MgpnCoreWebsite mgpnCoreWebsite;

    public MgpnCoreStoreGroup() {
    }

    public MgpnCoreStoreGroup(Short groupId) {
        this.groupId = groupId;
    }

    public MgpnCoreStoreGroup(Short groupId, String name, int rootCategoryId, short defaultStoreId) {
        this.groupId = groupId;
        this.name = name;
        this.rootCategoryId = rootCategoryId;
        this.defaultStoreId = defaultStoreId;
    }

    public Short getGroupId() {
        return groupId;
    }

    public void setGroupId(Short groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(int rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public short getDefaultStoreId() {
        return defaultStoreId;
    }

    public void setDefaultStoreId(short defaultStoreId) {
        this.defaultStoreId = defaultStoreId;
    }

    public List<MgpnCoreStore> getMgpnCoreStoreList() {
        return mgpnCoreStoreList;
    }

    public void setMgpnCoreStoreList(List<MgpnCoreStore> mgpnCoreStoreList) {
        this.mgpnCoreStoreList = mgpnCoreStoreList;
    }

    public MgpnCoreWebsite getMgpnCoreWebsite() {
        return mgpnCoreWebsite;
    }

    public void setMgpnCoreWebsite(MgpnCoreWebsite mgpnCoreWebsite) {
        this.mgpnCoreWebsite = mgpnCoreWebsite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnCoreStoreGroup)) {
            return false;
        }
        MgpnCoreStoreGroup other = (MgpnCoreStoreGroup) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnCoreStoreGroup[ groupId=" + groupId + " ]";
    }
    
}
