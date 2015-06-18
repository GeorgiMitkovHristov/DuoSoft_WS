
package bg.egov.regix.patentdepartment;

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
    "markImageBinary"
})
public class MarkImageType {

    @XmlElement(name = "MarkImageFileFormat")
    protected String markImageFileFormat;
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
