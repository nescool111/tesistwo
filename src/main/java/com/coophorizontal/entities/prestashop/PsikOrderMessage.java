/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.prestashop;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NestoR
 */
@Entity
@Table(name = "psik_order_message")
@NamedQueries({
    @NamedQuery(name = "PsikOrderMessage.findAll", query = "SELECT p FROM PsikOrderMessage p")})
public class PsikOrderMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_message")
    private Integer idOrderMessage;
    @Basic(optional = false)
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;

    public PsikOrderMessage() {
    }

    public PsikOrderMessage(Integer idOrderMessage) {
        this.idOrderMessage = idOrderMessage;
    }

    public PsikOrderMessage(Integer idOrderMessage, Date dateAdd) {
        this.idOrderMessage = idOrderMessage;
        this.dateAdd = dateAdd;
    }

    public Integer getIdOrderMessage() {
        return idOrderMessage;
    }

    public void setIdOrderMessage(Integer idOrderMessage) {
        this.idOrderMessage = idOrderMessage;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderMessage != null ? idOrderMessage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderMessage)) {
            return false;
        }
        PsikOrderMessage other = (PsikOrderMessage) object;
        if ((this.idOrderMessage == null && other.idOrderMessage != null) || (this.idOrderMessage != null && !this.idOrderMessage.equals(other.idOrderMessage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderMessage[ idOrderMessage=" + idOrderMessage + " ]";
    }
    
}
