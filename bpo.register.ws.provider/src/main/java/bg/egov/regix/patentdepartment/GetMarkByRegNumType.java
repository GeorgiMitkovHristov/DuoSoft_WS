
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMarkByRegNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMarkByRegNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMarkByRegNumType", propOrder = {
    "regnum"
})
public class GetMarkByRegNumType {

    protected int regnum;

    /**
     * Gets the value of the regnum property.
     * 
     */
    public int getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     */
    public void setRegnum(int value) {
        this.regnum = value;
    }

}
