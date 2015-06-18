
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SenderDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestProducer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="RequestProducerDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;/choice>
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
@XmlType(name = "TransactionHeaderType", propOrder = {
    "senderDetails"
})
public class TransactionHeaderType {

    @XmlElement(name = "SenderDetails")
    protected TransactionHeaderType.SenderDetails senderDetails;

    /**
     * Gets the value of the senderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeaderType.SenderDetails }
     *     
     */
    public TransactionHeaderType.SenderDetails getSenderDetails() {
        return senderDetails;
    }

    /**
     * Sets the value of the senderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeaderType.SenderDetails }
     *     
     */
    public void setSenderDetails(TransactionHeaderType.SenderDetails value) {
        this.senderDetails = value;
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
     *         &lt;element name="RequestProducer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="RequestProducerDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;/choice>
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
        "requestProducer",
        "requestProducerDateTime"
    })
    public static class SenderDetails {

        @XmlElement(name = "RequestProducer")
        protected String requestProducer;
        @XmlElement(name = "RequestProducerDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar requestProducerDateTime;

        /**
         * Gets the value of the requestProducer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestProducer() {
            return requestProducer;
        }

        /**
         * Sets the value of the requestProducer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestProducer(String value) {
            this.requestProducer = value;
        }

        /**
         * Gets the value of the requestProducerDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRequestProducerDateTime() {
            return requestProducerDateTime;
        }

        /**
         * Sets the value of the requestProducerDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRequestProducerDateTime(XMLGregorianCalendar value) {
            this.requestProducerDateTime = value;
        }

    }

}
