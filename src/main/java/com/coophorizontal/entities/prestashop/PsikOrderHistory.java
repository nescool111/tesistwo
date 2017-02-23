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
@Table(name = "psik_order_history")
@NamedQueries({
    @NamedQuery(name = "PsikOrderHistory.findAll", query = "SELECT p FROM PsikOrderHistory p")})
public class PsikOrderHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_history")
    private Integer idOrderHistory;
    @Basic(optional = false)
    @Column(name = "id_employee")
    private int idEmployee;
    @Basic(optional = false)
    @Column(name = "id_order")
    private int idOrder;
    @Basic(optional = false)
    @Column(name = "id_order_state")
    private int idOrderState;
    @Basic(optional = false)
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;

    public PsikOrderHistory() {
    }

    public PsikOrderHistory(Integer idOrderHistory) {
        this.idOrderHistory = idOrderHistory;
    }

    public PsikOrderHistory(Integer idOrderHistory, int idEmployee, int idOrder, int idOrderState, Date dateAdd) {
        this.idOrderHistory = idOrderHistory;
        this.idEmployee = idEmployee;
        this.idOrder = idOrder;
        this.idOrderState = idOrderState;
        this.dateAdd = dateAdd;
    }

    public Integer getIdOrderHistory() {
        return idOrderHistory;
    }

    public void setIdOrderHistory(Integer idOrderHistory) {
        this.idOrderHistory = idOrderHistory;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdOrderState() {
        return idOrderState;
    }

    public void setIdOrderState(int idOrderState) {
        this.idOrderState = idOrderState;
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
        hash += (idOrderHistory != null ? idOrderHistory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsikOrderHistory)) {
            return false;
        }
        PsikOrderHistory other = (PsikOrderHistory) object;
        if ((this.idOrderHistory == null && other.idOrderHistory != null) || (this.idOrderHistory != null && !this.idOrderHistory.equals(other.idOrderHistory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.PsikOrderHistory[ idOrderHistory=" + idOrderHistory + " ]";
    }
    
}
