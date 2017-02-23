/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.prestashop;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author NestoR
 */
@Embeddable
public class PsikOrderSlipDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_order_slip")
    private int idOrderSlip;
    @Basic(optional = false)
    @Column(name = "id_order_detail")
    private int idOrderDetail;

    public PsikOrderSlipDetailPK() {
    }

    public PsikOrderSlipDetailPK(int idOrderSlip, int idOrderDetail) {
        this.idOrderSlip = idOrderSlip;
        this.idOrderDetail = idOrderDetail;
    }

    public int getIdOrderSlip() {
        return idOrderSlip;
    }

    public void setIdOrderSlip(int idOrderSlip) {
        this.idOrderSlip = idOrderSlip;
    }

    public int getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(int idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrderSlip;
        hash += (int) idOrderDetail;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderSlipDetailPK)) {
            return false;
        }
        PsikOrderSlipDetailPK other = (PsikOrderSlipDetailPK) object;
        if (this.idOrderSlip != other.idOrderSlip) {
            return false;
        }
        if (this.idOrderDetail != other.idOrderDetail) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderSlipDetailPK[ idOrderSlip=" + idOrderSlip + ", idOrderDetail=" + idOrderDetail + " ]";
    }
    
}
