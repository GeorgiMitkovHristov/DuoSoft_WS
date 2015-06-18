
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicantNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicantAddressBook" type="{http://egov.bg/RegiX/PatentDepartment}AddressBookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantType", propOrder = {
    "applicantIdentifier",
    "applicantNationalityCode",
    "applicantAddressBook"
})
public class ApplicantType {

    @XmlElement(name = "ApplicantIdentifier")
    protected List<String> applicantIdentifier;
    @XmlElement(name = "ApplicantNationalityCode")
    protected String applicantNationalityCode;
    @XmlElement(name = "ApplicantAddressBook")
    protected AddressBookType applicantAddressBook;

    /**
     * Gets the value of the applicantIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicantIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicantIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicantIdentifier() {
        if (applicantIdentifier == null) {
            applicantIdentifier = new ArrayList<String>();
        }
        return this.applicantIdentifier;
    }

    /**
     * Gets the value of the applicantNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantNationalityCode() {
        return applicantNationalityCode;
    }

    /**
     * Sets the value of the applicantNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantNationalityCode(String value) {
        this.applicantNationalityCode = value;
    }

    /**
     * Gets the value of the applicantAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType }
     *     
     */
    public AddressBookType getApplicantAddressBook() {
        return applicantAddressBook;
    }

    /**
     * Sets the value of the applicantAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType }
     *     
     */
    public void setApplicantAddressBook(AddressBookType value) {
        this.applicantAddressBook = value;
    }

}
