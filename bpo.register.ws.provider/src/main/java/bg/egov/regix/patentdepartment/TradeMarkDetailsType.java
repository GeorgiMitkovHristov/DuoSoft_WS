
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeMarkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeMarkDetailsType">
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
@XmlType(name = "TradeMarkDetailsType", propOrder = {
    "tradeMark"
})
public class TradeMarkDetailsType {

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
