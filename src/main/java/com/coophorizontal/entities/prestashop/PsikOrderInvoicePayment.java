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
@Table(name = "psik_order_invoice_payment")
@NamedQueries({
    @NamedQuery(name = "PsikOrderInvoicePayment.findAll", query = "SELECT p FROM PsikOrderInvoicePayment p")})
public class PsikOrderInvoicePayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsikOrderInvoicePaymentPK psikOrderInvoicePaymentPK;
    @Basic(optional = false)
    @Column(name = "id_order")
    private int idOrder;

    public PsikOrderInvoicePayment() {
    }

    public PsikOrderInvoicePayment(PsikOrderInvoicePaymentPK psikOrderInvoicePaymentPK) {
        this.psikOrderInvoicePaymentPK = psikOrderInvoicePaymentPK;
    }

    public PsikOrderInvoicePayment(PsikOrderInvoicePaymentPK psikOrderInvoicePaymentPK, int idOrder) {
        this.psikOrderInvoicePaymentPK = psikOrderInvoicePaymentPK;
        this.idOrder = idOrder;
    }

    public PsikOrderInvoicePayment(int idOrderInvoice, int idOrderPayment) {
        this.psikOrderInvoicePaymentPK = new PsikOrderInvoicePaymentPK(idOrderInvoice, idOrderPayment);
    }

    public PsikOrderInvoicePaymentPK getPsikOrderInvoicePaymentPK() {
        return psikOrderInvoicePaymentPK;
    }

    public void setPsikOrderInvoicePaymentPK(PsikOrderInvoicePaymentPK psikOrderInvoicePaymentPK) {
        this.psikOrderInvoicePaymentPK = psikOrderInvoicePaymentPK;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psikOrderInvoicePaymentPK != null ? psikOrderInvoicePaymentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderInvoicePayment)) {
            return false;
        }
        PsikOrderInvoicePayment other = (PsikOrderInvoicePayment) object;
        if ((this.psikOrderInvoicePaymentPK == null && other.psikOrderInvoicePaymentPK != null) || (this.psikOrderInvoicePaymentPK != null && !this.psikOrderInvoicePaymentPK.equals(other.psikOrderInvoicePaymentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderInvoicePayment[ psikOrderInvoicePaymentPK=" + psikOrderInvoicePaymentPK + " ]";
    }
    
}
