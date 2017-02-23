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
@Table(name = "psik_order_state_lang")
@NamedQueries({
    @NamedQuery(name = "PsikOrderStateLang.findAll", query = "SELECT p FROM PsikOrderStateLang p")})
public class PsikOrderStateLang implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsikOrderStateLangPK psikOrderStateLangPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "template")
    private String template;

    public PsikOrderStateLang() {
    }

    public PsikOrderStateLang(PsikOrderStateLangPK psikOrderStateLangPK) {
        this.psikOrderStateLangPK = psikOrderStateLangPK;
    }

    public PsikOrderStateLang(PsikOrderStateLangPK psikOrderStateLangPK, String name, String template) {
        this.psikOrderStateLangPK = psikOrderStateLangPK;
        this.name = name;
        this.template = template;
    }

    public PsikOrderStateLang(int idOrderState, int idLang) {
        this.psikOrderStateLangPK = new PsikOrderStateLangPK(idOrderState, idLang);
    }

    public PsikOrderStateLangPK getPsikOrderStateLangPK() {
        return psikOrderStateLangPK;
    }

    public void setPsikOrderStateLangPK(PsikOrderStateLangPK psikOrderStateLangPK) {
        this.psikOrderStateLangPK = psikOrderStateLangPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psikOrderStateLangPK != null ? psikOrderStateLangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderStateLang)) {
            return false;
        }
        PsikOrderStateLang other = (PsikOrderStateLang) object;
        if ((this.psikOrderStateLangPK == null && other.psikOrderStateLangPK != null) || (this.psikOrderStateLangPK != null && !this.psikOrderStateLangPK.equals(other.psikOrderStateLangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderStateLang[ psikOrderStateLangPK=" + psikOrderStateLangPK + " ]";
    }
    
}
