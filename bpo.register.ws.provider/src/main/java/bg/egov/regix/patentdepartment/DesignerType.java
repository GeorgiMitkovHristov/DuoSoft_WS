
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DesignerNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DesignerLegalEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignerAddressBook" type="{http://egov.bg/RegiX/PatentDepartment}AddressBookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignerType", propOrder = {
    "designerNationalityCode",
    "designerLegalEntity",
    "designerAddressBook"
})
public class DesignerType {

    @XmlElement(name = "DesignerNationalityCode", required = true)
    protected String designerNationalityCode;
    @XmlElement(name = "DesignerLegalEntity")
    protected String designerLegalEntity;
    @XmlElement(name = "DesignerAddressBook")
    protected AddressBookType designerAddressBook;

    /**
     * Gets the value of the designerNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignerNationalityCode() {
        return designerNationalityCode;
    }

    /**
     * Sets the value of the designerNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignerNationalityCode(String value) {
        this.designerNationalityCode = value;
    }

    /**
     * Gets the value of the designerLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignerLegalEntity() {
        return designerLegalEntity;
    }

    /**
     * Sets the value of the designerLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignerLegalEntity(String value) {
        this.designerLegalEntity = value;
    }

    /**
     * Gets the value of the designerAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType }
     *     
     */
    public AddressBookType getDesignerAddressBook() {
        return designerAddressBook;
    }

    /**
     * Sets the value of the designerAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType }
     *     
     */
    public void setDesignerAddressBook(AddressBookType value) {
        this.designerAddressBook = value;
    }

}
