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
public class PsikOrderStateLangPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_order_state")
    private int idOrderState;
    @Basic(optional = false)
    @Column(name = "id_lang")
    private int idLang;

    public PsikOrderStateLangPK() {
    }

    public PsikOrderStateLangPK(int idOrderState, int idLang) {
        this.idOrderState = idOrderState;
        this.idLang = idLang;
    }

    public int getIdOrderState() {
        return idOrderState;
    }

    public void setIdOrderState(int idOrderState) {
        this.idOrderState = idOrderState;
    }

    public int getIdLang() {
        return idLang;
    }

    public void setIdLang(int idLang) {
        this.idLang = idLang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrderState;
        hash += (int) idLang;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderStateLangPK)) {
            return false;
        }
        PsikOrderStateLangPK other = (PsikOrderStateLangPK) object;
        if (this.idOrderState != other.idOrderState) {
            return false;
        }
        if (this.idLang != other.idLang) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderStateLangPK[ idOrderState=" + idOrderState + ", idLang=" + idLang + " ]";
    }
    
}
