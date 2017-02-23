/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.entities.opencart;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "oc5q_order")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrder.findAll", query = "SELECT o FROM Oc5qOrder o")})
public class Oc5qOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @Column(name = "invoice_no")
    private int invoiceNo;
    @Basic(optional = false)
    @Column(name = "invoice_prefix")
    private String invoicePrefix;
    @Basic(optional = false)
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @Column(name = "store_name")
    private String storeName;
    @Basic(optional = false)
    @Column(name = "store_url")
    private String storeUrl;
    @Basic(optional = false)
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @Column(name = "customer_group_id")
    private int customerGroupId;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "fax")
    private String fax;
    @Basic(optional = false)
    @Column(name = "payment_firstname")
    private String paymentFirstname;
    @Basic(optional = false)
    @Column(name = "payment_lastname")
    private String paymentLastname;
    @Basic(optional = false)
    @Column(name = "payment_company")
    private String paymentCompany;
    @Basic(optional = false)
    @Column(name = "payment_company_id")
    private String paymentCompanyId;
    @Basic(optional = false)
    @Column(name = "payment_tax_id")
    private String paymentTaxId;
    @Basic(optional = false)
    @Column(name = "payment_address_1")
    private String paymentAddress1;
    @Basic(optional = false)
    @Column(name = "payment_address_2")
    private String paymentAddress2;
    @Basic(optional = false)
    @Column(name = "payment_city")
    private String paymentCity;
    @Basic(optional = false)
    @Column(name = "payment_postcode")
    private String paymentPostcode;
    @Basic(optional = false)
    @Column(name = "payment_country")
    private String paymentCountry;
    @Basic(optional = false)
    @Column(name = "payment_country_id")
    private int paymentCountryId;
    @Basic(optional = false)
    @Column(name = "payment_zone")
    private String paymentZone;
    @Basic(optional = false)
    @Column(name = "payment_zone_id")
    private int paymentZoneId;
    @Basic(optional = false)
    @Lob
    @Column(name = "payment_address_format")
    private String paymentAddressFormat;
    @Basic(optional = false)
    @Column(name = "payment_method")
    private String paymentMethod;
    @Basic(optional = false)
    @Column(name = "payment_code")
    private String paymentCode;
    @Basic(optional = false)
    @Column(name = "shipping_firstname")
    private String shippingFirstname;
    @Basic(optional = false)
    @Column(name = "shipping_lastname")
    private String shippingLastname;
    @Basic(optional = false)
    @Column(name = "shipping_company")
    private String shippingCompany;
    @Basic(optional = false)
    @Column(name = "shipping_address_1")
    private String shippingAddress1;
    @Basic(optional = false)
    @Column(name = "shipping_address_2")
    private String shippingAddress2;
    @Basic(optional = false)
    @Column(name = "shipping_city")
    private String shippingCity;
    @Basic(optional = false)
    @Column(name = "shipping_postcode")
    private String shippingPostcode;
    @Basic(optional = false)
    @Column(name = "shipping_country")
    private String shippingCountry;
    @Basic(optional = false)
    @Column(name = "shipping_country_id")
    private int shippingCountryId;
    @Basic(optional = false)
    @Column(name = "shipping_zone")
    private String shippingZone;
    @Basic(optional = false)
    @Column(name = "shipping_zone_id")
    private int shippingZoneId;
    @Basic(optional = false)
    @Lob
    @Column(name = "shipping_address_format")
    private String shippingAddressFormat;
    @Basic(optional = false)
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Basic(optional = false)
    @Column(name = "shipping_code")
    private String shippingCode;
    @Basic(optional = false)
    @Lob
    @Column(name = "comment")
    private String comment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @Basic(optional = false)
    @Column(name = "order_status_id")
    private int orderStatusId;
    @Basic(optional = false)
    @Column(name = "affiliate_id")
    private int affiliateId;
    @Basic(optional = false)
    @Column(name = "commission")
    private BigDecimal commission;
    @Basic(optional = false)
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @Column(name = "currency_id")
    private int currencyId;
    @Basic(optional = false)
    @Column(name = "currency_code")
    private String currencyCode;
    @Basic(optional = false)
    @Column(name = "currency_value")
    private BigDecimal currencyValue;
    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "forwarded_ip")
    private String forwardedIp;
    @Basic(optional = false)
    @Column(name = "user_agent")
    private String userAgent;
    @Basic(optional = false)
    @Column(name = "accept_language")
    private String acceptLanguage;
    @Basic(optional = false)
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public Oc5qOrder() {
    }

    public Oc5qOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public Oc5qOrder(Integer orderId, int invoiceNo, String invoicePrefix, int storeId, String storeName, String storeUrl, int customerId, int customerGroupId, String firstname, String lastname, String email, String telephone, String fax, String paymentFirstname, String paymentLastname, String paymentCompany, String paymentCompanyId, String paymentTaxId, String paymentAddress1, String paymentAddress2, String paymentCity, String paymentPostcode, String paymentCountry, int paymentCountryId, String paymentZone, int paymentZoneId, String paymentAddressFormat, String paymentMethod, String paymentCode, String shippingFirstname, String shippingLastname, String shippingCompany, String shippingAddress1, String shippingAddress2, String shippingCity, String shippingPostcode, String shippingCountry, int shippingCountryId, String shippingZone, int shippingZoneId, String shippingAddressFormat, String shippingMethod, String shippingCode, String comment, BigDecimal total, int orderStatusId, int affiliateId, BigDecimal commission, int languageId, int currencyId, String currencyCode, BigDecimal currencyValue, String ip, String forwardedIp, String userAgent, String acceptLanguage, Date dateAdded, Date dateModified) {
        this.orderId = orderId;
        this.invoiceNo = invoiceNo;
        this.invoicePrefix = invoicePrefix;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeUrl = storeUrl;
        this.customerId = customerId;
        this.customerGroupId = customerGroupId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.paymentFirstname = paymentFirstname;
        this.paymentLastname = paymentLastname;
        this.paymentCompany = paymentCompany;
        this.paymentCompanyId = paymentCompanyId;
        this.paymentTaxId = paymentTaxId;
        this.paymentAddress1 = paymentAddress1;
        this.paymentAddress2 = paymentAddress2;
        this.paymentCity = paymentCity;
        this.paymentPostcode = paymentPostcode;
        this.paymentCountry = paymentCountry;
        this.paymentCountryId = paymentCountryId;
        this.paymentZone = paymentZone;
        this.paymentZoneId = paymentZoneId;
        this.paymentAddressFormat = paymentAddressFormat;
        this.paymentMethod = paymentMethod;
        this.paymentCode = paymentCode;
        this.shippingFirstname = shippingFirstname;
        this.shippingLastname = shippingLastname;
        this.shippingCompany = shippingCompany;
        this.shippingAddress1 = shippingAddress1;
        this.shippingAddress2 = shippingAddress2;
        this.shippingCity = shippingCity;
        this.shippingPostcode = shippingPostcode;
        this.shippingCountry = shippingCountry;
        this.shippingCountryId = shippingCountryId;
        this.shippingZone = shippingZone;
        this.shippingZoneId = shippingZoneId;
        this.shippingAddressFormat = shippingAddressFormat;
        this.shippingMethod = shippingMethod;
        this.shippingCode = shippingCode;
        this.comment = comment;
        this.total = total;
        this.orderStatusId = orderStatusId;
        this.affiliateId = affiliateId;
        this.commission = commission;
        this.languageId = languageId;
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.currencyValue = currencyValue;
        this.ip = ip;
        this.forwardedIp = forwardedIp;
        this.userAgent = userAgent;
        this.acceptLanguage = acceptLanguage;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoicePrefix() {
        return invoicePrefix;
    }

    public void setInvoicePrefix(String invoicePrefix) {
        this.invoicePrefix = invoicePrefix;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(int customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPaymentFirstname() {
        return paymentFirstname;
    }

    public void setPaymentFirstname(String paymentFirstname) {
        this.paymentFirstname = paymentFirstname;
    }

    public String getPaymentLastname() {
        return paymentLastname;
    }

    public void setPaymentLastname(String paymentLastname) {
        this.paymentLastname = paymentLastname;
    }

    public String getPaymentCompany() {
        return paymentCompany;
    }

    public void setPaymentCompany(String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    public String getPaymentCompanyId() {
        return paymentCompanyId;
    }

    public void setPaymentCompanyId(String paymentCompanyId) {
        this.paymentCompanyId = paymentCompanyId;
    }

    public String getPaymentTaxId() {
        return paymentTaxId;
    }

    public void setPaymentTaxId(String paymentTaxId) {
        this.paymentTaxId = paymentTaxId;
    }

    public String getPaymentAddress1() {
        return paymentAddress1;
    }

    public void setPaymentAddress1(String paymentAddress1) {
        this.paymentAddress1 = paymentAddress1;
    }

    public String getPaymentAddress2() {
        return paymentAddress2;
    }

    public void setPaymentAddress2(String paymentAddress2) {
        this.paymentAddress2 = paymentAddress2;
    }

    public String getPaymentCity() {
        return paymentCity;
    }

    public void setPaymentCity(String paymentCity) {
        this.paymentCity = paymentCity;
    }

    public String getPaymentPostcode() {
        return paymentPostcode;
    }

    public void setPaymentPostcode(String paymentPostcode) {
        this.paymentPostcode = paymentPostcode;
    }

    public String getPaymentCountry() {
        return paymentCountry;
    }

    public void setPaymentCountry(String paymentCountry) {
        this.paymentCountry = paymentCountry;
    }

    public int getPaymentCountryId() {
        return paymentCountryId;
    }

    public void setPaymentCountryId(int paymentCountryId) {
        this.paymentCountryId = paymentCountryId;
    }

    public String getPaymentZone() {
        return paymentZone;
    }

    public void setPaymentZone(String paymentZone) {
        this.paymentZone = paymentZone;
    }

    public int getPaymentZoneId() {
        return paymentZoneId;
    }

    public void setPaymentZoneId(int paymentZoneId) {
        this.paymentZoneId = paymentZoneId;
    }

    public String getPaymentAddressFormat() {
        return paymentAddressFormat;
    }

    public void setPaymentAddressFormat(String paymentAddressFormat) {
        this.paymentAddressFormat = paymentAddressFormat;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getShippingFirstname() {
        return shippingFirstname;
    }

    public void setShippingFirstname(String shippingFirstname) {
        this.shippingFirstname = shippingFirstname;
    }

    public String getShippingLastname() {
        return shippingLastname;
    }

    public void setShippingLastname(String shippingLastname) {
        this.shippingLastname = shippingLastname;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getShippingAddress1() {
        return shippingAddress1;
    }

    public void setShippingAddress1(String shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public String getShippingAddress2() {
        return shippingAddress2;
    }

    public void setShippingAddress2(String shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingPostcode() {
        return shippingPostcode;
    }

    public void setShippingPostcode(String shippingPostcode) {
        this.shippingPostcode = shippingPostcode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public int getShippingCountryId() {
        return shippingCountryId;
    }

    public void setShippingCountryId(int shippingCountryId) {
        this.shippingCountryId = shippingCountryId;
    }

    public String getShippingZone() {
        return shippingZone;
    }

    public void setShippingZone(String shippingZone) {
        this.shippingZone = shippingZone;
    }

    public int getShippingZoneId() {
        return shippingZoneId;
    }

    public void setShippingZoneId(int shippingZoneId) {
        this.shippingZoneId = shippingZoneId;
    }

    public String getShippingAddressFormat() {
        return shippingAddressFormat;
    }

    public void setShippingAddressFormat(String shippingAddressFormat) {
        this.shippingAddressFormat = shippingAddressFormat;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public int getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(int affiliateId) {
        this.affiliateId = affiliateId;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(BigDecimal currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getForwardedIp() {
        return forwardedIp;
    }

    public void setForwardedIp(String forwardedIp) {
        this.forwardedIp = forwardedIp;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oc5qOrder)) {
            return false;
        }
        Oc5qOrder other = (Oc5qOrder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrder[ orderId=" + orderId + " ]";
    }
    
}
