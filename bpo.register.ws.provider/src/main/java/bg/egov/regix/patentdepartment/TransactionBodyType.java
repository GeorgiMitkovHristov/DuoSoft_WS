
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionErrorDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TransactionError" type="{http://egov.bg/RegiX/PatentDepartment}TransactionErrorType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransactionContentDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TransactionCode" type="{http://egov.bg/RegiX/PatentDepartment}TransactionCodeType"/>
 *                   &lt;element name="TransactionData" type="{http://egov.bg/RegiX/PatentDepartment}TransactionDataType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionBodyType", propOrder = {
    "transactionErrorDetails",
    "transactionContentDetails"
})
public class TransactionBodyType {

    @XmlElement(name = "TransactionErrorDetails")
    protected TransactionBodyType.TransactionErrorDetails transactionErrorDetails;
    @XmlElement(name = "TransactionContentDetails", required = true)
    protected TransactionBodyType.TransactionContentDetails transactionContentDetails;

    /**
     * Gets the value of the transactionErrorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionBodyType.TransactionErrorDetails }
     *     
     */
    public TransactionBodyType.TransactionErrorDetails getTransactionErrorDetails() {
        return transactionErrorDetails;
    }

    /**
     * Sets the value of the transactionErrorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionBodyType.TransactionErrorDetails }
     *     
     */
    public void setTransactionErrorDetails(TransactionBodyType.TransactionErrorDetails value) {
        this.transactionErrorDetails = value;
    }

    /**
     * Gets the value of the transactionContentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionBodyType.TransactionContentDetails }
     *     
     */
    public TransactionBodyType.TransactionContentDetails getTransactionContentDetails() {
        return transactionContentDetails;
    }

    /**
     * Sets the value of the transactionContentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionBodyType.TransactionContentDetails }
     *     
     */
    public void setTransactionContentDetails(TransactionBodyType.TransactionContentDetails value) {
        this.transactionContentDetails = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TransactionCode" type="{http://egov.bg/RegiX/PatentDepartment}TransactionCodeType"/>
     *         &lt;element name="TransactionData" type="{http://egov.bg/RegiX/PatentDepartment}TransactionDataType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transactionIdentifier",
        "transactionCode",
        "transactionData"
    })
    public static class TransactionContentDetails {

        @XmlElement(name = "TransactionIdentifier")
        protected String transactionIdentifier;
        @XmlElement(name = "TransactionCode", required = true)
        protected String transactionCode;
        @XmlElement(name = "TransactionData", required = true)
        protected TransactionDataType transactionData;

        /**
         * Gets the value of the transactionIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionIdentifier() {
            return transactionIdentifier;
        }

        /**
         * Sets the value of the transactionIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionIdentifier(String value) {
            this.transactionIdentifier = value;
        }

        /**
         * Gets the value of the transactionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionCode() {
            return transactionCode;
        }

        /**
         * Sets the value of the transactionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionCode(String value) {
            this.transactionCode = value;
        }

        /**
         * Gets the value of the transactionData property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionDataType }
         *     
         */
        public TransactionDataType getTransactionData() {
            return transactionData;
        }

        /**
         * Sets the value of the transactionData property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionDataType }
         *     
         */
        public void setTransactionData(TransactionDataType value) {
            this.transactionData = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TransactionError" type="{http://egov.bg/RegiX/PatentDepartment}TransactionErrorType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transactionError"
    })
    public static class TransactionErrorDetails {

        @XmlElement(name = "TransactionError", required = true)
        protected List<TransactionErrorType> transactionError;

        /**
         * Gets the value of the transactionError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transactionError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransactionError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransactionErrorType }
         * 
         * 
         */
        public List<TransactionErrorType> getTransactionError() {
            if (transactionError == null) {
                transactionError = new ArrayList<TransactionErrorType>();
            }
            return this.transactionError;
        }

    }

}
