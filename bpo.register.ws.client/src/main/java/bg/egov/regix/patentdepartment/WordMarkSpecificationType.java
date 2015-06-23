
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WordMarkSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WordMarkSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkVerbalElementText" type="{http://egov.bg/RegiX/PatentDepartment}TextType" minOccurs="0"/>
 *         &lt;element name="MarkTranslation" type="{http://egov.bg/RegiX/PatentDepartment}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordMarkSpecificationType", propOrder = {
    "markVerbalElementText",
    "markTranslation"
})
public class WordMarkSpecificationType {

    @XmlElement(name = "MarkVerbalElementText")
    protected TextType markVerbalElementText;
    @XmlElement(name = "MarkTranslation")
    protected List<TextType> markTranslation;

    /**
     * Gets the value of the markVerbalElementText property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMarkVerbalElementText() {
        return markVerbalElementText;
    }

    /**
     * Sets the value of the markVerbalElementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMarkVerbalElementText(TextType value) {
        this.markVerbalElementText = value;
    }

    /**
     * Gets the value of the markTranslation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markTranslation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMarkTranslation() {
        if (markTranslation == null) {
            markTranslation = new ArrayList<TextType>();
        }
        return this.markTranslation;
    }

}
