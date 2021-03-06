
package com.mastercard.api.partnerwallet.domain.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WalletProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletPartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Countries" type="{}Countries"/>
 *         &lt;element name="Logo" type="{}Logo" minOccurs="0"/>
 *         &lt;element name="DisplayRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferredFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NewFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EncryptedUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *         &lt;element name="WalletProviderUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ApiWallet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WhiteLabelWallet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TermsOfUseUrls" type="{}TermsOfUseUrls"/>
 *         &lt;element name="PrivacyUrls" type="{}PrivacyUrls"/>
 *         &lt;element name="CookieNoticeUrls" type="{}CookieNoticeUrls"/>
 *         &lt;element name="CheckoutUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountMaintenanceUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddCardUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddAddressUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PairingUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogoutUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExpressCheckoutEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InvitationCodeCountries" type="{}InvitationCodeCountries"/>
 *         &lt;element name="PLDPWallet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MLDPWallet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LightboxEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LightboxVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletProvider", propOrder = {
    "id",
    "name",
    "walletPartnerName",
    "countries",
    "logo",
    "displayRank",
    "preferredFlag",
    "newFlag",
    "lastUpdatedDate",
    "lastTransactionDate",
    "encryptedUserId",
    "extensionPoint",
    "walletProviderUrl",
    "apiWallet",
    "whiteLabelWallet",
    "termsOfUseUrls",
    "privacyUrls",
    "cookieNoticeUrls",
    "checkoutUrl",
    "accountMaintenanceUrl",
    "addCardUrl",
    "addAddressUrl",
    "pairingUrl",
    "registrationUrl",
    "logoutUrl",
    "customerServicePhoneNumber",
    "connectEnabled",
    "expressCheckoutEnabled",
    "invitationCodeCountries",
    "pldpWallet",
    "mldpWallet",
    "lightboxEnabled",
    "lightboxVersion"
})
public class WalletProvider {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "WalletPartnerName")
    protected String walletPartnerName;
    @XmlElement(name = "Countries", required = true)
    protected Countries countries;
    @XmlElement(name = "Logo")
    protected Logo logo;
    @XmlElement(name = "DisplayRank")
    protected Long displayRank;
    @XmlElement(name = "PreferredFlag")
    protected boolean preferredFlag;
    @XmlElement(name = "NewFlag")
    protected boolean newFlag;
    @XmlElement(name = "LastUpdatedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdatedDate;
    @XmlElement(name = "LastTransactionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTransactionDate;
    @XmlElement(name = "EncryptedUserId")
    protected String encryptedUserId;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;
    @XmlElement(name = "WalletProviderUrl", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String walletProviderUrl;
    @XmlElement(name = "ApiWallet")
    protected Boolean apiWallet;
    @XmlElement(name = "WhiteLabelWallet")
    protected Boolean whiteLabelWallet;
    @XmlElement(name = "TermsOfUseUrls", required = true)
    protected TermsOfUseUrls termsOfUseUrls;
    @XmlElement(name = "PrivacyUrls", required = true)
    protected PrivacyUrls privacyUrls;
    @XmlElement(name = "CookieNoticeUrls", required = true)
    protected CookieNoticeUrls cookieNoticeUrls;
    @XmlElement(name = "CheckoutUrl", required = true)
    protected String checkoutUrl;
    @XmlElement(name = "AccountMaintenanceUrl", required = true)
    protected String accountMaintenanceUrl;
    @XmlElement(name = "AddCardUrl", required = true)
    protected String addCardUrl;
    @XmlElement(name = "AddAddressUrl", required = true)
    protected String addAddressUrl;
    @XmlElement(name = "PairingUrl", required = true)
    protected String pairingUrl;
    @XmlElement(name = "RegistrationUrl", required = true)
    protected String registrationUrl;
    @XmlElement(name = "LogoutUrl", required = true)
    protected String logoutUrl;
    @XmlElement(name = "CustomerServicePhoneNumber")
    protected String customerServicePhoneNumber;
    @XmlElement(name = "ConnectEnabled")
    protected boolean connectEnabled;
    @XmlElement(name = "ExpressCheckoutEnabled")
    protected boolean expressCheckoutEnabled;
    @XmlElement(name = "InvitationCodeCountries", required = true)
    protected InvitationCodeCountries invitationCodeCountries;
    @XmlElement(name = "PLDPWallet")
    protected Boolean pldpWallet;
    @XmlElement(name = "MLDPWallet")
    protected Boolean mldpWallet;
    @XmlElement(name = "LightboxEnabled")
    protected boolean lightboxEnabled;
    @XmlElement(name = "LightboxVersion")
    protected Long lightboxVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the walletPartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletPartnerName() {
        return walletPartnerName;
    }

    /**
     * Sets the value of the walletPartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletPartnerName(String value) {
        this.walletPartnerName = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link Countries }
     *     
     */
    public Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Countries }
     *     
     */
    public void setCountries(Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link Logo }
     *     
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logo }
     *     
     */
    public void setLogo(Logo value) {
        this.logo = value;
    }

    /**
     * Gets the value of the displayRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisplayRank() {
        return displayRank;
    }

    /**
     * Sets the value of the displayRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisplayRank(Long value) {
        this.displayRank = value;
    }

    /**
     * Gets the value of the preferredFlag property.
     * 
     */
    public boolean isPreferredFlag() {
        return preferredFlag;
    }

    /**
     * Sets the value of the preferredFlag property.
     * 
     */
    public void setPreferredFlag(boolean value) {
        this.preferredFlag = value;
    }

    /**
     * Gets the value of the newFlag property.
     * 
     */
    public boolean isNewFlag() {
        return newFlag;
    }

    /**
     * Sets the value of the newFlag property.
     * 
     */
    public void setNewFlag(boolean value) {
        this.newFlag = value;
    }

    /**
     * Gets the value of the lastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Sets the value of the lastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedDate(XMLGregorianCalendar value) {
        this.lastUpdatedDate = value;
    }

    /**
     * Gets the value of the lastTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTransactionDate() {
        return lastTransactionDate;
    }

    /**
     * Sets the value of the lastTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTransactionDate(XMLGregorianCalendar value) {
        this.lastTransactionDate = value;
    }

    /**
     * Gets the value of the encryptedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedUserId() {
        return encryptedUserId;
    }

    /**
     * Sets the value of the encryptedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedUserId(String value) {
        this.encryptedUserId = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

    /**
     * Gets the value of the walletProviderUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletProviderUrl() {
        return walletProviderUrl;
    }

    /**
     * Sets the value of the walletProviderUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletProviderUrl(String value) {
        this.walletProviderUrl = value;
    }

    /**
     * Gets the value of the apiWallet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApiWallet() {
        return apiWallet;
    }

    /**
     * Sets the value of the apiWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApiWallet(Boolean value) {
        this.apiWallet = value;
    }

    /**
     * Gets the value of the whiteLabelWallet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhiteLabelWallet() {
        return whiteLabelWallet;
    }

    /**
     * Sets the value of the whiteLabelWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhiteLabelWallet(Boolean value) {
        this.whiteLabelWallet = value;
    }

    /**
     * Gets the value of the termsOfUseUrls property.
     * 
     * @return
     *     possible object is
     *     {@link TermsOfUseUrls }
     *     
     */
    public TermsOfUseUrls getTermsOfUseUrls() {
        return termsOfUseUrls;
    }

    /**
     * Sets the value of the termsOfUseUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsOfUseUrls }
     *     
     */
    public void setTermsOfUseUrls(TermsOfUseUrls value) {
        this.termsOfUseUrls = value;
    }

    /**
     * Gets the value of the privacyUrls property.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyUrls }
     *     
     */
    public PrivacyUrls getPrivacyUrls() {
        return privacyUrls;
    }

    /**
     * Sets the value of the privacyUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyUrls }
     *     
     */
    public void setPrivacyUrls(PrivacyUrls value) {
        this.privacyUrls = value;
    }

    /**
     * Gets the value of the cookieNoticeUrls property.
     * 
     * @return
     *     possible object is
     *     {@link CookieNoticeUrls }
     *     
     */
    public CookieNoticeUrls getCookieNoticeUrls() {
        return cookieNoticeUrls;
    }

    /**
     * Sets the value of the cookieNoticeUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookieNoticeUrls }
     *     
     */
    public void setCookieNoticeUrls(CookieNoticeUrls value) {
        this.cookieNoticeUrls = value;
    }

    /**
     * Gets the value of the checkoutUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    /**
     * Sets the value of the checkoutUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutUrl(String value) {
        this.checkoutUrl = value;
    }

    /**
     * Gets the value of the accountMaintenanceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMaintenanceUrl() {
        return accountMaintenanceUrl;
    }

    /**
     * Sets the value of the accountMaintenanceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMaintenanceUrl(String value) {
        this.accountMaintenanceUrl = value;
    }

    /**
     * Gets the value of the addCardUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCardUrl() {
        return addCardUrl;
    }

    /**
     * Sets the value of the addCardUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCardUrl(String value) {
        this.addCardUrl = value;
    }

    /**
     * Gets the value of the addAddressUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddAddressUrl() {
        return addAddressUrl;
    }

    /**
     * Sets the value of the addAddressUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddAddressUrl(String value) {
        this.addAddressUrl = value;
    }

    /**
     * Gets the value of the pairingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairingUrl() {
        return pairingUrl;
    }

    /**
     * Sets the value of the pairingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairingUrl(String value) {
        this.pairingUrl = value;
    }

    /**
     * Gets the value of the registrationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationUrl() {
        return registrationUrl;
    }

    /**
     * Sets the value of the registrationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationUrl(String value) {
        this.registrationUrl = value;
    }

    /**
     * Gets the value of the logoutUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutUrl() {
        return logoutUrl;
    }

    /**
     * Sets the value of the logoutUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutUrl(String value) {
        this.logoutUrl = value;
    }

    /**
     * Gets the value of the customerServicePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * Sets the value of the customerServicePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

    /**
     * Gets the value of the connectEnabled property.
     * 
     */
    public boolean isConnectEnabled() {
        return connectEnabled;
    }

    /**
     * Sets the value of the connectEnabled property.
     * 
     */
    public void setConnectEnabled(boolean value) {
        this.connectEnabled = value;
    }

    /**
     * Gets the value of the expressCheckoutEnabled property.
     * 
     */
    public boolean isExpressCheckoutEnabled() {
        return expressCheckoutEnabled;
    }

    /**
     * Sets the value of the expressCheckoutEnabled property.
     * 
     */
    public void setExpressCheckoutEnabled(boolean value) {
        this.expressCheckoutEnabled = value;
    }

    /**
     * Gets the value of the invitationCodeCountries property.
     * 
     * @return
     *     possible object is
     *     {@link InvitationCodeCountries }
     *     
     */
    public InvitationCodeCountries getInvitationCodeCountries() {
        return invitationCodeCountries;
    }

    /**
     * Sets the value of the invitationCodeCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvitationCodeCountries }
     *     
     */
    public void setInvitationCodeCountries(InvitationCodeCountries value) {
        this.invitationCodeCountries = value;
    }

    /**
     * Gets the value of the pldpWallet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPLDPWallet() {
        return pldpWallet;
    }

    /**
     * Sets the value of the pldpWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPLDPWallet(Boolean value) {
        this.pldpWallet = value;
    }

    /**
     * Gets the value of the mldpWallet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMLDPWallet() {
        return mldpWallet;
    }

    /**
     * Sets the value of the mldpWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMLDPWallet(Boolean value) {
        this.mldpWallet = value;
    }

    /**
     * Gets the value of the lightboxEnabled property.
     * 
     */
    public boolean isLightboxEnabled() {
        return lightboxEnabled;
    }

    /**
     * Sets the value of the lightboxEnabled property.
     * 
     */
    public void setLightboxEnabled(boolean value) {
        this.lightboxEnabled = value;
    }

    /**
     * Gets the value of the lightboxVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLightboxVersion() {
        return lightboxVersion;
    }

    /**
     * Sets the value of the lightboxVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLightboxVersion(Long value) {
        this.lightboxVersion = value;
    }

}
