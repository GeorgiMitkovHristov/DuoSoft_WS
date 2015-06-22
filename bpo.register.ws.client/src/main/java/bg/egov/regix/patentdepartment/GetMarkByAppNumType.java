
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMarkByAppNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMarkByAppNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMarkByAppNumType", propOrder = {
    "appnum"
})
public class GetMarkByAppNumType {

    @XmlElement(required = true)
    protected String appnum;

    /**
     * Gets the value of the appnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppnum() {
        return appnum;
    }

    /**
     * Sets the value of the appnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppnum(String value) {
        this.appnum = value;
    }

}
