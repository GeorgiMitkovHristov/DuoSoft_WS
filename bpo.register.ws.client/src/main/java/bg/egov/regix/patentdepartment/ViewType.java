
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ViewIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ViewFileFormat" type="{http://egov.bg/RegiX/PatentDepartment}FileFormatType" minOccurs="0"/>
 *         &lt;element name="ViewTitle" type="{http://egov.bg/RegiX/PatentDepartment}TextType" minOccurs="0"/>
 *         &lt;element name="ViewBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewType", propOrder = {
    "viewIdentifier",
    "viewFileFormat",
    "viewTitle",
    "viewBinary"
})
public class ViewType {

    @XmlElement(name = "ViewIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String viewIdentifier;
    @XmlElement(name = "ViewFileFormat")
    protected String viewFileFormat;
    @XmlElement(name = "ViewTitle")
    protected TextType viewTitle;
    @XmlElement(name = "ViewBinary")
    protected byte[] viewBinary;

    /**
     * Gets the value of the viewIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewIdentifier() {
        return viewIdentifier;
    }

    /**
     * Sets the value of the viewIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewIdentifier(String value) {
        this.viewIdentifier = value;
    }

    /**
     * Gets the value of the viewFileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewFileFormat() {
        return viewFileFormat;
    }

    /**
     * Sets the value of the viewFileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewFileFormat(String value) {
        this.viewFileFormat = value;
    }

    /**
     * Gets the value of the viewTitle property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getViewTitle() {
        return viewTitle;
    }

    /**
     * Sets the value of the viewTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setViewTitle(TextType value) {
        this.viewTitle = value;
    }

    /**
     * Gets the value of the viewBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getViewBinary() {
        return viewBinary;
    }

    /**
     * Sets the value of the viewBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setViewBinary(byte[] value) {
        this.viewBinary = value;
    }

}
