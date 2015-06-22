
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="FormattedName" type="{http://egov.bg/RegiX/PatentDepartment}FormattedNameType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "formattedName"
})
public class NameType {

    @XmlElement(name = "FormattedName")
    protected FormattedNameType formattedName;

    /**
     * Gets the value of the formattedName property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedNameType }
     *     
     */
    public FormattedNameType getFormattedName() {
        return formattedName;
    }

    /**
     * Sets the value of the formattedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedNameType }
     *     
     */
    public void setFormattedName(FormattedNameType value) {
        this.formattedName = value;
    }

}
