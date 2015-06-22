
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassNumber" type="{http://egov.bg/RegiX/PatentDepartment}ClassNumberType" minOccurs="0"/>
 *         &lt;element name="GoodsServicesDescription" type="{http://egov.bg/RegiX/PatentDepartment}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDescriptionType", propOrder = {
    "classNumber",
    "goodsServicesDescription"
})
public class ClassDescriptionType {

    @XmlElement(name = "ClassNumber")
    protected String classNumber;
    @XmlElement(name = "GoodsServicesDescription")
    protected List<TextType> goodsServicesDescription;

    /**
     * Gets the value of the classNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * Sets the value of the classNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassNumber(String value) {
        this.classNumber = value;
    }

    /**
     * Gets the value of the goodsServicesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsServicesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsServicesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getGoodsServicesDescription() {
        if (goodsServicesDescription == null) {
            goodsServicesDescription = new ArrayList<TextType>();
        }
        return this.goodsServicesDescription;
    }

}
