
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventorNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InventorLegalEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventorAddressBook" type="{http://egov.bg/RegiX/PatentDepartment}AddressBookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventorType", propOrder = {
    "inventorNationalityCode",
    "inventorLegalEntity",
    "inventorAddressBook"
})
public class InventorType {

    @XmlElement(name = "InventorNationalityCode", required = true)
    protected String inventorNationalityCode;
    @XmlElement(name = "InventorLegalEntity")
    protected String inventorLegalEntity;
    @XmlElement(name = "InventorAddressBook")
    protected AddressBookType inventorAddressBook;

    /**
     * Gets the value of the inventorNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventorNationalityCode() {
        return inventorNationalityCode;
    }

    /**
     * Sets the value of the inventorNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventorNationalityCode(String value) {
        this.inventorNationalityCode = value;
    }

    /**
     * Gets the value of the inventorLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventorLegalEntity() {
        return inventorLegalEntity;
    }

    /**
     * Sets the value of the inventorLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventorLegalEntity(String value) {
        this.inventorLegalEntity = value;
    }

    /**
     * Gets the value of the inventorAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType }
     *     
     */
    public AddressBookType getInventorAddressBook() {
        return inventorAddressBook;
    }

    /**
     * Sets the value of the inventorAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType }
     *     
     */
    public void setInventorAddressBook(AddressBookType value) {
        this.inventorAddressBook = value;
    }

}
