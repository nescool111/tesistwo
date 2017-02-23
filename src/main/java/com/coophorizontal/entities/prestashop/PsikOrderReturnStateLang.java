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
@Table(name = "psik_order_return_state_lang")
@NamedQueries({
    @NamedQuery(name = "PsikOrderReturnStateLang.findAll", query = "SELECT p FROM PsikOrderReturnStateLang p")})
public class PsikOrderReturnStateLang implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsikOrderReturnStateLangPK psikOrderReturnStateLangPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public PsikOrderReturnStateLang() {
    }

    public PsikOrderReturnStateLang(PsikOrderReturnStateLangPK psikOrderReturnStateLangPK) {
        this.psikOrderReturnStateLangPK = psikOrderReturnStateLangPK;
    }

    public PsikOrderReturnStateLang(PsikOrderReturnStateLangPK psikOrderReturnStateLangPK, String name) {
        this.psikOrderReturnStateLangPK = psikOrderReturnStateLangPK;
        this.name = name;
    }

    public PsikOrderReturnStateLang(int idOrderReturnState, int idLang) {
        this.psikOrderReturnStateLangPK = new PsikOrderReturnStateLangPK(idOrderReturnState, idLang);
    }

    public PsikOrderReturnStateLangPK getPsikOrderReturnStateLangPK() {
        return psikOrderReturnStateLangPK;
    }

    public void setPsikOrderReturnStateLangPK(PsikOrderReturnStateLangPK psikOrderReturnStateLangPK) {
        this.psikOrderReturnStateLangPK = psikOrderReturnStateLangPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psikOrderReturnStateLangPK != null ? psikOrderReturnStateLangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderReturnStateLang)) {
            return false;
        }
        PsikOrderReturnStateLang other = (PsikOrderReturnStateLang) object;
        if ((this.psikOrderReturnStateLangPK == null && other.psikOrderReturnStateLangPK != null) || (this.psikOrderReturnStateLangPK != null && !this.psikOrderReturnStateLangPK.equals(other.psikOrderReturnStateLangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderReturnStateLang[ psikOrderReturnStateLangPK=" + psikOrderReturnStateLangPK + " ]";
    }
    
}
