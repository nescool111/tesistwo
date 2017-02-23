/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.magento;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "mgpn_customer_entity")
@NamedQueries({
    @NamedQuery(name = "MgpnCustomerEntity.findAll", query = "SELECT m FROM MgpnCustomerEntity m")})
public class MgpnCustomerEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entity_id")
    private Integer entityId;
    @Basic(optional = false)
    @Column(name = "entity_type_id")
    private short entityTypeId;
    @Basic(optional = false)
    @Column(name = "attribute_set_id")
    private short attributeSetId;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "group_id")
    private short groupId;
    @Column(name = "increment_id")
    private String incrementId;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic(optional = false)
    @Column(name = "is_active")
    private short isActive;
    @Basic(optional = false)
    @Column(name = "disable_auto_group_change")
    private short disableAutoGroupChange;
    @JoinColumn(name = "website_id", referencedColumnName = "website_id")
    @ManyToOne
    private MgpnCoreWebsite mgpnCoreWebsite;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    @ManyToOne
    private MgpnCoreStore mgpnCoreStore;
    @OneToMany(mappedBy = "mgpnCustomerEntity")
    private List<MgpnSalesFlatOrder> mgpnSalesFlatOrderList;

    public MgpnCustomerEntity() {
    }

    public MgpnCustomerEntity(Integer entityId) {
        this.entityId = entityId;
    }

    public MgpnCustomerEntity(Integer entityId, short entityTypeId, short attributeSetId, short groupId, Date createdAt, Date updatedAt, short isActive, short disableAutoGroupChange) {
        this.entityId = entityId;
        this.entityTypeId = entityTypeId;
        this.attributeSetId = attributeSetId;
        this.groupId = groupId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isActive = isActive;
        this.disableAutoGroupChange = disableAutoGroupChange;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public short getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(short entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public short getAttributeSetId() {
        return attributeSetId;
    }

    public void setAttributeSetId(short attributeSetId) {
        this.attributeSetId = attributeSetId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getGroupId() {
        return groupId;
    }

    public void setGroupId(short groupId) {
        this.groupId = groupId;
    }

    public String getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(String incrementId) {
        this.incrementId = incrementId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public short getDisableAutoGroupChange() {
        return disableAutoGroupChange;
    }

    public void setDisableAutoGroupChange(short disableAutoGroupChange) {
        this.disableAutoGroupChange = disableAutoGroupChange;
    }

    public MgpnCoreWebsite getMgpnCoreWebsite() {
        return mgpnCoreWebsite;
    }

    public void setMgpnCoreWebsite(MgpnCoreWebsite mgpnCoreWebsite) {
        this.mgpnCoreWebsite = mgpnCoreWebsite;
    }

    public MgpnCoreStore getMgpnCoreStore() {
        return mgpnCoreStore;
    }

    public void setMgpnCoreStore(MgpnCoreStore mgpnCoreStore) {
        this.mgpnCoreStore = mgpnCoreStore;
    }

    public List<MgpnSalesFlatOrder> getMgpnSalesFlatOrderList() {
        return mgpnSalesFlatOrderList;
    }

    public void setMgpnSalesFlatOrderList(List<MgpnSalesFlatOrder> mgpnSalesFlatOrderList) {
        this.mgpnSalesFlatOrderList = mgpnSalesFlatOrderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityId != null ? entityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgpnCustomerEntity)) {
            return false;
        }
        MgpnCustomerEntity other = (MgpnCustomerEntity) object;
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.MgpnCustomerEntity[ entityId=" + entityId + " ]";
    }
    
}
