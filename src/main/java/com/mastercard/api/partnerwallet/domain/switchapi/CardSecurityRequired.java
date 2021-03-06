
package com.mastercard.api.partnerwallet.domain.switchapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSecurityRequired complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSecurityRequired">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SecureCodeCardSecurityDetails" type="{}SecureCodeCardSecurityDetails" minOccurs="0"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityRequired", propOrder = {
    "active",
    "secureCodeCardSecurityDetails",
    "extensionPoint"
})
public class CardSecurityRequired {

    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "SecureCodeCardSecurityDetails")
    protected SecureCodeCardSecurityDetails secureCodeCardSecurityDetails;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the secureCodeCardSecurityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SecureCodeCardSecurityDetails }
     *     
     */
    public SecureCodeCardSecurityDetails getSecureCodeCardSecurityDetails() {
        return secureCodeCardSecurityDetails;
    }

    /**
     * Sets the value of the secureCodeCardSecurityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureCodeCardSecurityDetails }
     *     
     */
    public void setSecureCodeCardSecurityDetails(SecureCodeCardSecurityDetails value) {
        this.secureCodeCardSecurityDetails = value;
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

}
