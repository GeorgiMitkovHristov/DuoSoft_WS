
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionHeader" type="{http://egov.bg/RegiX/PatentDepartment}TransactionHeaderType" minOccurs="0"/>
 *         &lt;element name="TradeMarkTransactionBody" type="{http://egov.bg/RegiX/PatentDepartment}TransactionBodyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "transactionHeader",
    "tradeMarkTransactionBody"
})
public class TransactionType {

    @XmlElement(name = "TransactionHeader")
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "TradeMarkTransactionBody")
    protected List<TransactionBodyType> tradeMarkTransactionBody;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeaderType }
     *     
     */
    public TransactionHeaderType getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeaderType }
     *     
     */
    public void setTransactionHeader(TransactionHeaderType value) {
        this.transactionHeader = value;
    }

    /**
     * Gets the value of the tradeMarkTransactionBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeMarkTransactionBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeMarkTransactionBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionBodyType }
     * 
     * 
     */
    public List<TransactionBodyType> getTradeMarkTransactionBody() {
        if (tradeMarkTransactionBody == null) {
            tradeMarkTransactionBody = new ArrayList<TransactionBodyType>();
        }
        return this.tradeMarkTransactionBody;
    }

}
