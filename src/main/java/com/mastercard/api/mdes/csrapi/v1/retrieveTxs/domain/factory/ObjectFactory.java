//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.16 at 01:23:07 PM CDT 
//


package com.mastercard.api.mdes.csrapi.v1.retrieveTxs.domain.factory;

import com.mastercard.api.mdes.csrapi.v1.retrieveTxs.domain.TransactionRequest;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionRequest.AuditInfo }
     * 
     */
    public TransactionRequest.AuditInfo createTransactionRequestAuditInfo() {
        return new TransactionRequest.AuditInfo();
    }

    /**
     * Create an instance of {@link TransactionRequest }
     * 
     */
    public TransactionRequest createTransactionRequest() {
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setAuditInfo(createTransactionRequestAuditInfo());
        return transactionRequest;
    }

}
