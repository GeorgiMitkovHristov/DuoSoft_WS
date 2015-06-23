
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="FormattedAddress" type="{http://egov.bg/RegiX/PatentDepartment}FormattedAddressType"/>
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
@XmlType(name = "AddressType", propOrder = {
    "formattedAddress"
})
public class AddressType {

    @XmlElement(name = "FormattedAddress")
    protected FormattedAddressType formattedAddress;

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedAddressType }
     *     
     */
    public FormattedAddressType getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedAddressType }
     *     
     */
    public void setFormattedAddress(FormattedAddressType value) {
        this.formattedAddress = value;
    }

}
