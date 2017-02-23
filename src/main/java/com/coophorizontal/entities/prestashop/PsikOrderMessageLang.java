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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "psik_order_message_lang")
@NamedQueries({
    @NamedQuery(name = "PsikOrderMessageLang.findAll", query = "SELECT p FROM PsikOrderMessageLang p")})
public class PsikOrderMessageLang implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsikOrderMessageLangPK psikOrderMessageLangPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "message")
    private String message;

    public PsikOrderMessageLang() {
    }

    public PsikOrderMessageLang(PsikOrderMessageLangPK psikOrderMessageLangPK) {
        this.psikOrderMessageLangPK = psikOrderMessageLangPK;
    }

    public PsikOrderMessageLang(PsikOrderMessageLangPK psikOrderMessageLangPK, String name, String message) {
        this.psikOrderMessageLangPK = psikOrderMessageLangPK;
        this.name = name;
        this.message = message;
    }

    public PsikOrderMessageLang(int idOrderMessage, int idLang) {
        this.psikOrderMessageLangPK = new PsikOrderMessageLangPK(idOrderMessage, idLang);
    }

    public PsikOrderMessageLangPK getPsikOrderMessageLangPK() {
        return psikOrderMessageLangPK;
    }

    public void setPsikOrderMessageLangPK(PsikOrderMessageLangPK psikOrderMessageLangPK) {
        this.psikOrderMessageLangPK = psikOrderMessageLangPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psikOrderMessageLangPK != null ? psikOrderMessageLangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderMessageLang)) {
            return false;
        }
        PsikOrderMessageLang other = (PsikOrderMessageLang) object;
        if ((this.psikOrderMessageLangPK == null && other.psikOrderMessageLangPK != null) || (this.psikOrderMessageLangPK != null && !this.psikOrderMessageLangPK.equals(other.psikOrderMessageLangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderMessageLang[ psikOrderMessageLangPK=" + psikOrderMessageLangPK + " ]";
    }
    
}
