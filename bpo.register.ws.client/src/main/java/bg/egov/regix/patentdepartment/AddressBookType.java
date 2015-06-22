
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressBookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressBookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="FormattedNameAddress" type="{http://egov.bg/RegiX/PatentDepartment}FormattedNameAddressType"/>
 *         &lt;/choice>
 *         &lt;element name="ContactInformationDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OtherElectronicAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressBookType", propOrder = {
    "formattedNameAddress",
    "contactInformationDetails",
    "postalAddress"
})
public class AddressBookType {

    @XmlElement(name = "FormattedNameAddress")
    protected FormattedNameAddressType formattedNameAddress;
    @XmlElement(name = "ContactInformationDetails")
    protected AddressBookType.ContactInformationDetails contactInformationDetails;
    @XmlElement(name = "PostalAddress")
    protected String postalAddress;

    /**
     * Gets the value of the formattedNameAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedNameAddressType }
     *     
     */
    public FormattedNameAddressType getFormattedNameAddress() {
        return formattedNameAddress;
    }

    /**
     * Sets the value of the formattedNameAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedNameAddressType }
     *     
     */
    public void setFormattedNameAddress(FormattedNameAddressType value) {
        this.formattedNameAddress = value;
    }

    /**
     * Gets the value of the contactInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType.ContactInformationDetails }
     *     
     */
    public AddressBookType.ContactInformationDetails getContactInformationDetails() {
        return contactInformationDetails;
    }

    /**
     * Sets the value of the contactInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType.ContactInformationDetails }
     *     
     */
    public void setContactInformationDetails(AddressBookType.ContactInformationDetails value) {
        this.contactInformationDetails = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress(String value) {
        this.postalAddress = value;
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
     *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OtherElectronicAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "phone",
        "fax",
        "email",
        "url",
        "otherElectronicAddress"
    })
    public static class ContactInformationDetails {

        @XmlElement(name = "Phone")
        protected List<String> phone;
        @XmlElement(name = "Fax")
        protected List<String> fax;
        @XmlElement(name = "Email")
        protected List<String> email;
        @XmlElement(name = "URL")
        @XmlSchemaType(name = "anyURI")
        protected List<String> url;
        @XmlElement(name = "OtherElectronicAddress")
        protected List<String> otherElectronicAddress;

        /**
         * Gets the value of the phone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPhone() {
            if (phone == null) {
                phone = new ArrayList<String>();
            }
            return this.phone;
        }

        /**
         * Gets the value of the fax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFax() {
            if (fax == null) {
                fax = new ArrayList<String>();
            }
            return this.fax;
        }

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEmail() {
            if (email == null) {
                email = new ArrayList<String>();
            }
            return this.email;
        }

        /**
         * Gets the value of the url property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the url property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getURL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getURL() {
            if (url == null) {
                url = new ArrayList<String>();
            }
            return this.url;
        }

        /**
         * Gets the value of the otherElectronicAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherElectronicAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherElectronicAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOtherElectronicAddress() {
            if (otherElectronicAddress == null) {
                otherElectronicAddress = new ArrayList<String>();
            }
            return this.otherElectronicAddress;
        }

    }

}
