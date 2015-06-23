
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkImageFileFormat" type="{http://egov.bg/RegiX/PatentDepartment}FileFormatType" minOccurs="0"/>
 *         &lt;element name="MarkImageColourClaimedText" type="{http://egov.bg/RegiX/PatentDepartment}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarkImageCategory" type="{http://egov.bg/RegiX/PatentDepartment}MarkImageCategoryType" minOccurs="0"/>
 *         &lt;element name="MarkImageBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkImageType", propOrder = {
    "markImageFileFormat",
    "markImageColourClaimedText",
    "markImageCategory",
    "markImageBinary"
})
public class MarkImageType {

    @XmlElement(name = "MarkImageFileFormat")
    protected String markImageFileFormat;
    @XmlElement(name = "MarkImageColourClaimedText")
    protected List<TextType> markImageColourClaimedText;
    @XmlElement(name = "MarkImageCategory")
    protected MarkImageCategoryType markImageCategory;
    @XmlElement(name = "MarkImageBinary")
    protected byte[] markImageBinary;

    /**
     * Gets the value of the markImageFileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkImageFileFormat() {
        return markImageFileFormat;
    }

    /**
     * Sets the value of the markImageFileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkImageFileFormat(String value) {
        this.markImageFileFormat = value;
    }

    /**
     * Gets the value of the markImageColourClaimedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markImageColourClaimedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkImageColourClaimedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMarkImageColourClaimedText() {
        if (markImageColourClaimedText == null) {
            markImageColourClaimedText = new ArrayList<TextType>();
        }
        return this.markImageColourClaimedText;
    }

    /**
     * Gets the value of the markImageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link MarkImageCategoryType }
     *     
     */
    public MarkImageCategoryType getMarkImageCategory() {
        return markImageCategory;
    }

    /**
     * Sets the value of the markImageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkImageCategoryType }
     *     
     */
    public void setMarkImageCategory(MarkImageCategoryType value) {
        this.markImageCategory = value;
    }

    /**
     * Gets the value of the markImageBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMarkImageBinary() {
        return markImageBinary;
    }

    /**
     * Sets the value of the markImageBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMarkImageBinary(byte[] value) {
        this.markImageBinary = value;
    }

}
