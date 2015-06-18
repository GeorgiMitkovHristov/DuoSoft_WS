
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="TradeMarkDetails">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="TradeMark" type="{http://egov.bg/RegiX/PatentDepartment}TradeMarkType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
@XmlType(name = "TransactionDataType", propOrder = {
    "tradeMarkDetails"
})
public class TransactionDataType {

    @XmlElement(name = "TradeMarkDetails")
    protected TransactionDataType.TradeMarkDetails tradeMarkDetails;

    /**
     * Gets the value of the tradeMarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDataType.TradeMarkDetails }
     *     
     */
    public TransactionDataType.TradeMarkDetails getTradeMarkDetails() {
        return tradeMarkDetails;
    }

    /**
     * Sets the value of the tradeMarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDataType.TradeMarkDetails }
     *     
     */
    public void setTradeMarkDetails(TransactionDataType.TradeMarkDetails value) {
        this.tradeMarkDetails = value;
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
     *         &lt;element name="TradeMark" type="{http://egov.bg/RegiX/PatentDepartment}TradeMarkType" maxOccurs="unbounded"/>
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
        "tradeMark"
    })
    public static class TradeMarkDetails {

        @XmlElement(name = "TradeMark", required = true)
        protected List<TradeMarkType> tradeMark;

        /**
         * Gets the value of the tradeMark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tradeMark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTradeMark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TradeMarkType }
         * 
         * 
         */
        public List<TradeMarkType> getTradeMark() {
            if (tradeMark == null) {
                tradeMark = new ArrayList<TradeMarkType>();
            }
            return this.tradeMark;
        }

    }

}
