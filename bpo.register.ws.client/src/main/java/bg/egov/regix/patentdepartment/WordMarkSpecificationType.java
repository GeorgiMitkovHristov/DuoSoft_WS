
package bg.egov.regix.patentdepartment;

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
    "markVerbalElementText"
})
public class WordMarkSpecificationType {

    @XmlElement(name = "MarkVerbalElementText")
    protected TextType markVerbalElementText;

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

}
