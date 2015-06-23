
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PriorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriorityCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PriorityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityType", propOrder = {
    "priorityCountryCode",
    "priorityNumber",
    "priorityDate"
})
public class PriorityType {

    @XmlElement(name = "PriorityCountryCode", required = true)
    protected String priorityCountryCode;
    @XmlElement(name = "PriorityNumber")
    protected String priorityNumber;
    @XmlElement(name = "PriorityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priorityDate;

    /**
     * Gets the value of the priorityCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCountryCode() {
        return priorityCountryCode;
    }

    /**
     * Sets the value of the priorityCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCountryCode(String value) {
        this.priorityCountryCode = value;
    }

    /**
     * Gets the value of the priorityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Sets the value of the priorityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityNumber(String value) {
        this.priorityNumber = value;
    }

    /**
     * Gets the value of the priorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriorityDate() {
        return priorityDate;
    }

    /**
     * Sets the value of the priorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriorityDate(XMLGregorianCalendar value) {
        this.priorityDate = value;
    }

}
