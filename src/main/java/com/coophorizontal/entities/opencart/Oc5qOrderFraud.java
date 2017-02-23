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
@Table(name = "oc5q_order_fraud")
@NamedQueries({
    @NamedQuery(name = "Oc5qOrderFraud.findAll", query = "SELECT o FROM Oc5qOrderFraud o")})
public class Oc5qOrderFraud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @Column(name = "country_match")
    private String countryMatch;
    @Basic(optional = false)
    @Column(name = "country_code")
    private String countryCode;
    @Basic(optional = false)
    @Column(name = "high_risk_country")
    private String highRiskCountry;
    @Basic(optional = false)
    @Column(name = "distance")
    private int distance;
    @Basic(optional = false)
    @Column(name = "ip_region")
    private String ipRegion;
    @Basic(optional = false)
    @Column(name = "ip_city")
    private String ipCity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ip_latitude")
    private BigDecimal ipLatitude;
    @Basic(optional = false)
    @Column(name = "ip_longitude")
    private BigDecimal ipLongitude;
    @Basic(optional = false)
    @Column(name = "ip_isp")
    private String ipIsp;
    @Basic(optional = false)
    @Column(name = "ip_org")
    private String ipOrg;
    @Basic(optional = false)
    @Column(name = "ip_asnum")
    private int ipAsnum;
    @Basic(optional = false)
    @Column(name = "ip_user_type")
    private String ipUserType;
    @Basic(optional = false)
    @Column(name = "ip_country_confidence")
    private String ipCountryConfidence;
    @Basic(optional = false)
    @Column(name = "ip_region_confidence")
    private String ipRegionConfidence;
    @Basic(optional = false)
    @Column(name = "ip_city_confidence")
    private String ipCityConfidence;
    @Basic(optional = false)
    @Column(name = "ip_postal_confidence")
    private String ipPostalConfidence;
    @Basic(optional = false)
    @Column(name = "ip_postal_code")
    private String ipPostalCode;
    @Basic(optional = false)
    @Column(name = "ip_accuracy_radius")
    private int ipAccuracyRadius;
    @Basic(optional = false)
    @Column(name = "ip_net_speed_cell")
    private String ipNetSpeedCell;
    @Basic(optional = false)
    @Column(name = "ip_metro_code")
    private int ipMetroCode;
    @Basic(optional = false)
    @Column(name = "ip_area_code")
    private int ipAreaCode;
    @Basic(optional = false)
    @Column(name = "ip_time_zone")
    private String ipTimeZone;
    @Basic(optional = false)
    @Column(name = "ip_region_name")
    private String ipRegionName;
    @Basic(optional = false)
    @Column(name = "ip_domain")
    private String ipDomain;
    @Basic(optional = false)
    @Column(name = "ip_country_name")
    private String ipCountryName;
    @Basic(optional = false)
    @Column(name = "ip_continent_code")
    private String ipContinentCode;
    @Basic(optional = false)
    @Column(name = "ip_corporate_proxy")
    private String ipCorporateProxy;
    @Basic(optional = false)
    @Column(name = "anonymous_proxy")
    private String anonymousProxy;
    @Basic(optional = false)
    @Column(name = "proxy_score")
    private int proxyScore;
    @Basic(optional = false)
    @Column(name = "is_trans_proxy")
    private String isTransProxy;
    @Basic(optional = false)
    @Column(name = "free_mail")
    private String freeMail;
    @Basic(optional = false)
    @Column(name = "carder_email")
    private String carderEmail;
    @Basic(optional = false)
    @Column(name = "high_risk_username")
    private String highRiskUsername;
    @Basic(optional = false)
    @Column(name = "high_risk_password")
    private String highRiskPassword;
    @Basic(optional = false)
    @Column(name = "bin_match")
    private String binMatch;
    @Basic(optional = false)
    @Column(name = "bin_country")
    private String binCountry;
    @Basic(optional = false)
    @Column(name = "bin_name_match")
    private String binNameMatch;
    @Basic(optional = false)
    @Column(name = "bin_name")
    private String binName;
    @Basic(optional = false)
    @Column(name = "bin_phone_match")
    private String binPhoneMatch;
    @Basic(optional = false)
    @Column(name = "bin_phone")
    private String binPhone;
    @Basic(optional = false)
    @Column(name = "customer_phone_in_billing_location")
    private String customerPhoneInBillingLocation;
    @Basic(optional = false)
    @Column(name = "ship_forward")
    private String shipForward;
    @Basic(optional = false)
    @Column(name = "city_postal_match")
    private String cityPostalMatch;
    @Basic(optional = false)
    @Column(name = "ship_city_postal_match")
    private String shipCityPostalMatch;
    @Basic(optional = false)
    @Column(name = "score")
    private BigDecimal score;
    @Basic(optional = false)
    @Lob
    @Column(name = "explanation")
    private String explanation;
    @Basic(optional = false)
    @Column(name = "risk_score")
    private BigDecimal riskScore;
    @Basic(optional = false)
    @Column(name = "queries_remaining")
    private int queriesRemaining;
    @Basic(optional = false)
    @Column(name = "maxmind_id")
    private String maxmindId;
    @Basic(optional = false)
    @Lob
    @Column(name = "error")
    private String error;
    @Basic(optional = false)
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public Oc5qOrderFraud() {
    }

    public Oc5qOrderFraud(Integer orderId) {
        this.orderId = orderId;
    }

    public Oc5qOrderFraud(Integer orderId, int customerId, String countryMatch, String countryCode, String highRiskCountry, int distance, String ipRegion, String ipCity, BigDecimal ipLatitude, BigDecimal ipLongitude, String ipIsp, String ipOrg, int ipAsnum, String ipUserType, String ipCountryConfidence, String ipRegionConfidence, String ipCityConfidence, String ipPostalConfidence, String ipPostalCode, int ipAccuracyRadius, String ipNetSpeedCell, int ipMetroCode, int ipAreaCode, String ipTimeZone, String ipRegionName, String ipDomain, String ipCountryName, String ipContinentCode, String ipCorporateProxy, String anonymousProxy, int proxyScore, String isTransProxy, String freeMail, String carderEmail, String highRiskUsername, String highRiskPassword, String binMatch, String binCountry, String binNameMatch, String binName, String binPhoneMatch, String binPhone, String customerPhoneInBillingLocation, String shipForward, String cityPostalMatch, String shipCityPostalMatch, BigDecimal score, String explanation, BigDecimal riskScore, int queriesRemaining, String maxmindId, String error, Date dateAdded) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.countryMatch = countryMatch;
        this.countryCode = countryCode;
        this.highRiskCountry = highRiskCountry;
        this.distance = distance;
        this.ipRegion = ipRegion;
        this.ipCity = ipCity;
        this.ipLatitude = ipLatitude;
        this.ipLongitude = ipLongitude;
        this.ipIsp = ipIsp;
        this.ipOrg = ipOrg;
        this.ipAsnum = ipAsnum;
        this.ipUserType = ipUserType;
        this.ipCountryConfidence = ipCountryConfidence;
        this.ipRegionConfidence = ipRegionConfidence;
        this.ipCityConfidence = ipCityConfidence;
        this.ipPostalConfidence = ipPostalConfidence;
        this.ipPostalCode = ipPostalCode;
        this.ipAccuracyRadius = ipAccuracyRadius;
        this.ipNetSpeedCell = ipNetSpeedCell;
        this.ipMetroCode = ipMetroCode;
        this.ipAreaCode = ipAreaCode;
        this.ipTimeZone = ipTimeZone;
        this.ipRegionName = ipRegionName;
        this.ipDomain = ipDomain;
        this.ipCountryName = ipCountryName;
        this.ipContinentCode = ipContinentCode;
        this.ipCorporateProxy = ipCorporateProxy;
        this.anonymousProxy = anonymousProxy;
        this.proxyScore = proxyScore;
        this.isTransProxy = isTransProxy;
        this.freeMail = freeMail;
        this.carderEmail = carderEmail;
        this.highRiskUsername = highRiskUsername;
        this.highRiskPassword = highRiskPassword;
        this.binMatch = binMatch;
        this.binCountry = binCountry;
        this.binNameMatch = binNameMatch;
        this.binName = binName;
        this.binPhoneMatch = binPhoneMatch;
        this.binPhone = binPhone;
        this.customerPhoneInBillingLocation = customerPhoneInBillingLocation;
        this.shipForward = shipForward;
        this.cityPostalMatch = cityPostalMatch;
        this.shipCityPostalMatch = shipCityPostalMatch;
        this.score = score;
        this.explanation = explanation;
        this.riskScore = riskScore;
        this.queriesRemaining = queriesRemaining;
        this.maxmindId = maxmindId;
        this.error = error;
        this.dateAdded = dateAdded;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCountryMatch() {
        return countryMatch;
    }

    public void setCountryMatch(String countryMatch) {
        this.countryMatch = countryMatch;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getHighRiskCountry() {
        return highRiskCountry;
    }

    public void setHighRiskCountry(String highRiskCountry) {
        this.highRiskCountry = highRiskCountry;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getIpRegion() {
        return ipRegion;
    }

    public void setIpRegion(String ipRegion) {
        this.ipRegion = ipRegion;
    }

    public String getIpCity() {
        return ipCity;
    }

    public void setIpCity(String ipCity) {
        this.ipCity = ipCity;
    }

    public BigDecimal getIpLatitude() {
        return ipLatitude;
    }

    public void setIpLatitude(BigDecimal ipLatitude) {
        this.ipLatitude = ipLatitude;
    }

    public BigDecimal getIpLongitude() {
        return ipLongitude;
    }

    public void setIpLongitude(BigDecimal ipLongitude) {
        this.ipLongitude = ipLongitude;
    }

    public String getIpIsp() {
        return ipIsp;
    }

    public void setIpIsp(String ipIsp) {
        this.ipIsp = ipIsp;
    }

    public String getIpOrg() {
        return ipOrg;
    }

    public void setIpOrg(String ipOrg) {
        this.ipOrg = ipOrg;
    }

    public int getIpAsnum() {
        return ipAsnum;
    }

    public void setIpAsnum(int ipAsnum) {
        this.ipAsnum = ipAsnum;
    }

    public String getIpUserType() {
        return ipUserType;
    }

    public void setIpUserType(String ipUserType) {
        this.ipUserType = ipUserType;
    }

    public String getIpCountryConfidence() {
        return ipCountryConfidence;
    }

    public void setIpCountryConfidence(String ipCountryConfidence) {
        this.ipCountryConfidence = ipCountryConfidence;
    }

    public String getIpRegionConfidence() {
        return ipRegionConfidence;
    }

    public void setIpRegionConfidence(String ipRegionConfidence) {
        this.ipRegionConfidence = ipRegionConfidence;
    }

    public String getIpCityConfidence() {
        return ipCityConfidence;
    }

    public void setIpCityConfidence(String ipCityConfidence) {
        this.ipCityConfidence = ipCityConfidence;
    }

    public String getIpPostalConfidence() {
        return ipPostalConfidence;
    }

    public void setIpPostalConfidence(String ipPostalConfidence) {
        this.ipPostalConfidence = ipPostalConfidence;
    }

    public String getIpPostalCode() {
        return ipPostalCode;
    }

    public void setIpPostalCode(String ipPostalCode) {
        this.ipPostalCode = ipPostalCode;
    }

    public int getIpAccuracyRadius() {
        return ipAccuracyRadius;
    }

    public void setIpAccuracyRadius(int ipAccuracyRadius) {
        this.ipAccuracyRadius = ipAccuracyRadius;
    }

    public String getIpNetSpeedCell() {
        return ipNetSpeedCell;
    }

    public void setIpNetSpeedCell(String ipNetSpeedCell) {
        this.ipNetSpeedCell = ipNetSpeedCell;
    }

    public int getIpMetroCode() {
        return ipMetroCode;
    }

    public void setIpMetroCode(int ipMetroCode) {
        this.ipMetroCode = ipMetroCode;
    }

    public int getIpAreaCode() {
        return ipAreaCode;
    }

    public void setIpAreaCode(int ipAreaCode) {
        this.ipAreaCode = ipAreaCode;
    }

    public String getIpTimeZone() {
        return ipTimeZone;
    }

    public void setIpTimeZone(String ipTimeZone) {
        this.ipTimeZone = ipTimeZone;
    }

    public String getIpRegionName() {
        return ipRegionName;
    }

    public void setIpRegionName(String ipRegionName) {
        this.ipRegionName = ipRegionName;
    }

    public String getIpDomain() {
        return ipDomain;
    }

    public void setIpDomain(String ipDomain) {
        this.ipDomain = ipDomain;
    }

    public String getIpCountryName() {
        return ipCountryName;
    }

    public void setIpCountryName(String ipCountryName) {
        this.ipCountryName = ipCountryName;
    }

    public String getIpContinentCode() {
        return ipContinentCode;
    }

    public void setIpContinentCode(String ipContinentCode) {
        this.ipContinentCode = ipContinentCode;
    }

    public String getIpCorporateProxy() {
        return ipCorporateProxy;
    }

    public void setIpCorporateProxy(String ipCorporateProxy) {
        this.ipCorporateProxy = ipCorporateProxy;
    }

    public String getAnonymousProxy() {
        return anonymousProxy;
    }

    public void setAnonymousProxy(String anonymousProxy) {
        this.anonymousProxy = anonymousProxy;
    }

    public int getProxyScore() {
        return proxyScore;
    }

    public void setProxyScore(int proxyScore) {
        this.proxyScore = proxyScore;
    }

    public String getIsTransProxy() {
        return isTransProxy;
    }

    public void setIsTransProxy(String isTransProxy) {
        this.isTransProxy = isTransProxy;
    }

    public String getFreeMail() {
        return freeMail;
    }

    public void setFreeMail(String freeMail) {
        this.freeMail = freeMail;
    }

    public String getCarderEmail() {
        return carderEmail;
    }

    public void setCarderEmail(String carderEmail) {
        this.carderEmail = carderEmail;
    }

    public String getHighRiskUsername() {
        return highRiskUsername;
    }

    public void setHighRiskUsername(String highRiskUsername) {
        this.highRiskUsername = highRiskUsername;
    }

    public String getHighRiskPassword() {
        return highRiskPassword;
    }

    public void setHighRiskPassword(String highRiskPassword) {
        this.highRiskPassword = highRiskPassword;
    }

    public String getBinMatch() {
        return binMatch;
    }

    public void setBinMatch(String binMatch) {
        this.binMatch = binMatch;
    }

    public String getBinCountry() {
        return binCountry;
    }

    public void setBinCountry(String binCountry) {
        this.binCountry = binCountry;
    }

    public String getBinNameMatch() {
        return binNameMatch;
    }

    public void setBinNameMatch(String binNameMatch) {
        this.binNameMatch = binNameMatch;
    }

    public String getBinName() {
        return binName;
    }

    public void setBinName(String binName) {
        this.binName = binName;
    }

    public String getBinPhoneMatch() {
        return binPhoneMatch;
    }

    public void setBinPhoneMatch(String binPhoneMatch) {
        this.binPhoneMatch = binPhoneMatch;
    }

    public String getBinPhone() {
        return binPhone;
    }

    public void setBinPhone(String binPhone) {
        this.binPhone = binPhone;
    }

    public String getCustomerPhoneInBillingLocation() {
        return customerPhoneInBillingLocation;
    }

    public void setCustomerPhoneInBillingLocation(String customerPhoneInBillingLocation) {
        this.customerPhoneInBillingLocation = customerPhoneInBillingLocation;
    }

    public String getShipForward() {
        return shipForward;
    }

    public void setShipForward(String shipForward) {
        this.shipForward = shipForward;
    }

    public String getCityPostalMatch() {
        return cityPostalMatch;
    }

    public void setCityPostalMatch(String cityPostalMatch) {
        this.cityPostalMatch = cityPostalMatch;
    }

    public String getShipCityPostalMatch() {
        return shipCityPostalMatch;
    }

    public void setShipCityPostalMatch(String shipCityPostalMatch) {
        this.shipCityPostalMatch = shipCityPostalMatch;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public BigDecimal getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(BigDecimal riskScore) {
        this.riskScore = riskScore;
    }

    public int getQueriesRemaining() {
        return queriesRemaining;
    }

    public void setQueriesRemaining(int queriesRemaining) {
        this.queriesRemaining = queriesRemaining;
    }

    public String getMaxmindId() {
        return maxmindId;
    }

    public void setMaxmindId(String maxmindId) {
        this.maxmindId = maxmindId;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
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
        if (!(object instanceof Oc5qOrderFraud)) {
            return false;
        }
        Oc5qOrderFraud other = (Oc5qOrderFraud) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cooperacionhorizontal.entitycreator.Oc5qOrderFraud[ orderId=" + orderId + " ]";
    }
    
}
