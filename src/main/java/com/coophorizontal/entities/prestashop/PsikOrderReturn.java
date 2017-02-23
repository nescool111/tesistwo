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
import javax.persistence.Lob;
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
@Table(name = "psik_order_return")
@NamedQueries({
    @NamedQuery(name = "PsikOrderReturn.findAll", query = "SELECT p FROM PsikOrderReturn p")})
public class PsikOrderReturn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_return")
    private Integer idOrderReturn;
    @Basic(optional = false)
    @Column(name = "id_customer")
    private int idCustomer;
    @Basic(optional = false)
    @Column(name = "id_order")
    private int idOrder;
    @Basic(optional = false)
    @Column(name = "state")
    private boolean state;
    @Basic(optional = false)
    @Lob
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;
    @Basic(optional = false)
    @Column(name = "date_upd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpd;

    public PsikOrderReturn() {
    }

    public PsikOrderReturn(Integer idOrderReturn) {
        this.idOrderReturn = idOrderReturn;
    }

    public PsikOrderReturn(Integer idOrderReturn, int idCustomer, int idOrder, boolean state, String question, Date dateAdd, Date dateUpd) {
        this.idOrderReturn = idOrderReturn;
        this.idCustomer = idCustomer;
        this.idOrder = idOrder;
        this.state = state;
        this.question = question;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
    }

    public Integer getIdOrderReturn() {
        return idOrderReturn;
    }

    public void setIdOrderReturn(Integer idOrderReturn) {
        this.idOrderReturn = idOrderReturn;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(Date dateUpd) {
        this.dateUpd = dateUpd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderReturn != null ? idOrderReturn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderReturn)) {
            return false;
        }
        PsikOrderReturn other = (PsikOrderReturn) object;
        if ((this.idOrderReturn == null && other.idOrderReturn != null) || (this.idOrderReturn != null && !this.idOrderReturn.equals(other.idOrderReturn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderReturn[ idOrderReturn=" + idOrderReturn + " ]";
    }
    
}
