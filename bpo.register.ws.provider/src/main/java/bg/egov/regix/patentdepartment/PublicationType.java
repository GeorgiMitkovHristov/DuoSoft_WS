
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PublicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PublicationSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationSubsection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationType", propOrder = {
    "publicationIdentifier",
    "publicationSection",
    "publicationSubsection",
    "publicationDate"
})
public class PublicationType {

    @XmlElement(name = "PublicationIdentifier", required = true)
    protected String publicationIdentifier;
    @XmlElement(name = "PublicationSection")
    protected String publicationSection;
    @XmlElement(name = "PublicationSubsection")
    protected String publicationSubsection;
    @XmlElement(name = "PublicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;

    /**
     * Gets the value of the publicationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationIdentifier() {
        return publicationIdentifier;
    }

    /**
     * Sets the value of the publicationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationIdentifier(String value) {
        this.publicationIdentifier = value;
    }

    /**
     * Gets the value of the publicationSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationSection() {
        return publicationSection;
    }

    /**
     * Sets the value of the publicationSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationSection(String value) {
        this.publicationSection = value;
    }

    /**
     * Gets the value of the publicationSubsection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationSubsection() {
        return publicationSubsection;
    }

    /**
     * Sets the value of the publicationSubsection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationSubsection(String value) {
        this.publicationSubsection = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

}
