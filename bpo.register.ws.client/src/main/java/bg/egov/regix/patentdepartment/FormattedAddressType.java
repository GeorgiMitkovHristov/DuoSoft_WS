
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormattedAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLine" type="{http://egov.bg/RegiX/PatentDepartment}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressMailCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPostOfficeBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedAddressType", propOrder = {
    "addressLine",
    "addressMailCode",
    "addressPostOfficeBox",
    "addressRoom",
    "addressFloor",
    "addressBuilding",
    "addressStreet",
    "addressCity",
    "addressCounty",
    "addressState",
    "addressPostcode",
    "formattedAddressCountryCode"
})
public class FormattedAddressType {

    @XmlElement(name = "AddressLine")
    protected List<TextType> addressLine;
    @XmlElement(name = "AddressMailCode")
    protected String addressMailCode;
    @XmlElement(name = "AddressPostOfficeBox")
    protected String addressPostOfficeBox;
    @XmlElement(name = "AddressRoom")
    protected String addressRoom;
    @XmlElement(name = "AddressFloor")
    protected String addressFloor;
    @XmlElement(name = "AddressBuilding")
    protected String addressBuilding;
    @XmlElement(name = "AddressStreet")
    protected String addressStreet;
    @XmlElement(name = "AddressCity")
    protected String addressCity;
    @XmlElement(name = "AddressCounty")
    protected String addressCounty;
    @XmlElement(name = "AddressState")
    protected String addressState;
    @XmlElement(name = "AddressPostcode")
    protected String addressPostcode;
    @XmlElement(name = "FormattedAddressCountryCode")
    protected String formattedAddressCountryCode;

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<TextType>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the addressMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressMailCode() {
        return addressMailCode;
    }

    /**
     * Sets the value of the addressMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressMailCode(String value) {
        this.addressMailCode = value;
    }

    /**
     * Gets the value of the addressPostOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPostOfficeBox() {
        return addressPostOfficeBox;
    }

    /**
     * Sets the value of the addressPostOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPostOfficeBox(String value) {
        this.addressPostOfficeBox = value;
    }

    /**
     * Gets the value of the addressRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRoom() {
        return addressRoom;
    }

    /**
     * Sets the value of the addressRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRoom(String value) {
        this.addressRoom = value;
    }

    /**
     * Gets the value of the addressFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFloor() {
        return addressFloor;
    }

    /**
     * Sets the value of the addressFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFloor(String value) {
        this.addressFloor = value;
    }

    /**
     * Gets the value of the addressBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressBuilding() {
        return addressBuilding;
    }

    /**
     * Sets the value of the addressBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressBuilding(String value) {
        this.addressBuilding = value;
    }

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet(String value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCity(String value) {
        this.addressCity = value;
    }

    /**
     * Gets the value of the addressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCounty() {
        return addressCounty;
    }

    /**
     * Sets the value of the addressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCounty(String value) {
        this.addressCounty = value;
    }

    /**
     * Gets the value of the addressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Sets the value of the addressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressState(String value) {
        this.addressState = value;
    }

    /**
     * Gets the value of the addressPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Sets the value of the addressPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPostcode(String value) {
        this.addressPostcode = value;
    }

    /**
     * Gets the value of the formattedAddressCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddressCountryCode() {
        return formattedAddressCountryCode;
    }

    /**
     * Sets the value of the formattedAddressCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddressCountryCode(String value) {
        this.formattedAddressCountryCode = value;
    }

}
