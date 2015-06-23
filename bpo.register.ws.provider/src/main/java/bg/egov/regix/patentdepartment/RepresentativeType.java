
package bg.egov.regix.patentdepartment;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepresentativeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepresentativeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RepresentativeIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="RepresentativeNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepresentativeLegalEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepresentativeAddressBook" type="{http://egov.bg/RegiX/PatentDepartment}AddressBookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentativeType", propOrder = {
    "representativeIdentifier",
    "representativeNationalityCode",
    "representativeLegalEntity",
    "representativeAddressBook"
})
public class RepresentativeType {

    @XmlElement(name = "RepresentativeIdentifier", required = true)
    protected BigInteger representativeIdentifier;
    @XmlElement(name = "RepresentativeNationalityCode")
    protected String representativeNationalityCode;
    @XmlElement(name = "RepresentativeLegalEntity")
    protected String representativeLegalEntity;
    @XmlElement(name = "RepresentativeAddressBook")
    protected AddressBookType representativeAddressBook;

    /**
     * Gets the value of the representativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepresentativeIdentifier() {
        return representativeIdentifier;
    }

    /**
     * Sets the value of the representativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepresentativeIdentifier(BigInteger value) {
        this.representativeIdentifier = value;
    }

    /**
     * Gets the value of the representativeNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeNationalityCode() {
        return representativeNationalityCode;
    }

    /**
     * Sets the value of the representativeNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeNationalityCode(String value) {
        this.representativeNationalityCode = value;
    }

    /**
     * Gets the value of the representativeLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeLegalEntity() {
        return representativeLegalEntity;
    }

    /**
     * Sets the value of the representativeLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeLegalEntity(String value) {
        this.representativeLegalEntity = value;
    }

    /**
     * Gets the value of the representativeAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType }
     *     
     */
    public AddressBookType getRepresentativeAddressBook() {
        return representativeAddressBook;
    }

    /**
     * Sets the value of the representativeAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType }
     *     
     */
    public void setRepresentativeAddressBook(AddressBookType value) {
        this.representativeAddressBook = value;
    }

}
