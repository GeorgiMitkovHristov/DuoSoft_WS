
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExhibitionPriorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitionPriorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExhibitionCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExhibitionCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExhibitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExhibitionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Comment" type="{http://egov.bg/RegiX/PatentDepartment}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitionPriorityType", propOrder = {
    "exhibitionCountryCode",
    "exhibitionCityName",
    "exhibitionName",
    "exhibitionDate",
    "comment"
})
public class ExhibitionPriorityType {

    @XmlElement(name = "ExhibitionCountryCode")
    protected String exhibitionCountryCode;
    @XmlElement(name = "ExhibitionCityName")
    protected String exhibitionCityName;
    @XmlElement(name = "ExhibitionName")
    protected String exhibitionName;
    @XmlElement(name = "ExhibitionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exhibitionDate;
    @XmlElement(name = "Comment")
    protected TextType comment;

    /**
     * Gets the value of the exhibitionCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitionCountryCode() {
        return exhibitionCountryCode;
    }

    /**
     * Sets the value of the exhibitionCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitionCountryCode(String value) {
        this.exhibitionCountryCode = value;
    }

    /**
     * Gets the value of the exhibitionCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitionCityName() {
        return exhibitionCityName;
    }

    /**
     * Sets the value of the exhibitionCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitionCityName(String value) {
        this.exhibitionCityName = value;
    }

    /**
     * Gets the value of the exhibitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitionName() {
        return exhibitionName;
    }

    /**
     * Sets the value of the exhibitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitionName(String value) {
        this.exhibitionName = value;
    }

    /**
     * Gets the value of the exhibitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExhibitionDate() {
        return exhibitionDate;
    }

    /**
     * Sets the value of the exhibitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExhibitionDate(XMLGregorianCalendar value) {
        this.exhibitionDate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setComment(TextType value) {
        this.comment = value;
    }

}
