/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.prestashop;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "psik_order_return_detail")
@NamedQueries({
    @NamedQuery(name = "PsikOrderReturnDetail.findAll", query = "SELECT p FROM PsikOrderReturnDetail p")})
public class PsikOrderReturnDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsikOrderReturnDetailPK psikOrderReturnDetailPK;
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;

    public PsikOrderReturnDetail() {
    }

    public PsikOrderReturnDetail(PsikOrderReturnDetailPK psikOrderReturnDetailPK) {
        this.psikOrderReturnDetailPK = psikOrderReturnDetailPK;
    }

    public PsikOrderReturnDetail(PsikOrderReturnDetailPK psikOrderReturnDetailPK, int productQuantity) {
        this.psikOrderReturnDetailPK = psikOrderReturnDetailPK;
        this.productQuantity = productQuantity;
    }

    public PsikOrderReturnDetail(int idOrderReturn, int idOrderDetail, int idCustomization) {
        this.psikOrderReturnDetailPK = new PsikOrderReturnDetailPK(idOrderReturn, idOrderDetail, idCustomization);
    }

    public PsikOrderReturnDetailPK getPsikOrderReturnDetailPK() {
        return psikOrderReturnDetailPK;
    }

    public void setPsikOrderReturnDetailPK(PsikOrderReturnDetailPK psikOrderReturnDetailPK) {
        this.psikOrderReturnDetailPK = psikOrderReturnDetailPK;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psikOrderReturnDetailPK != null ? psikOrderReturnDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderReturnDetail)) {
            return false;
        }
        PsikOrderReturnDetail other = (PsikOrderReturnDetail) object;
        if ((this.psikOrderReturnDetailPK == null && other.psikOrderReturnDetailPK != null) || (this.psikOrderReturnDetailPK != null && !this.psikOrderReturnDetailPK.equals(other.psikOrderReturnDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderReturnDetail[ psikOrderReturnDetailPK=" + psikOrderReturnDetailPK + " ]";
    }
    
}
