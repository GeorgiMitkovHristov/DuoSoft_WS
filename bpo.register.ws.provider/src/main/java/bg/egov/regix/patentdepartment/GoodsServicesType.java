
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassDescriptionDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClassDescription" type="{http://egov.bg/RegiX/PatentDepartment}ClassDescriptionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsServicesType", propOrder = {
    "classDescriptionDetails"
})
public class GoodsServicesType {

    @XmlElement(name = "ClassDescriptionDetails", required = true)
    protected GoodsServicesType.ClassDescriptionDetails classDescriptionDetails;

    /**
     * Gets the value of the classDescriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsServicesType.ClassDescriptionDetails }
     *     
     */
    public GoodsServicesType.ClassDescriptionDetails getClassDescriptionDetails() {
        return classDescriptionDetails;
    }

    /**
     * Sets the value of the classDescriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsServicesType.ClassDescriptionDetails }
     *     
     */
    public void setClassDescriptionDetails(GoodsServicesType.ClassDescriptionDetails value) {
        this.classDescriptionDetails = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClassDescription" type="{http://egov.bg/RegiX/PatentDepartment}ClassDescriptionType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classDescription"
    })
    public static class ClassDescriptionDetails {

        @XmlElement(name = "ClassDescription", required = true)
        protected List<ClassDescriptionType> classDescription;

        /**
         * Gets the value of the classDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassDescriptionType }
         * 
         * 
         */
        public List<ClassDescriptionType> getClassDescription() {
            if (classDescription == null) {
                classDescription = new ArrayList<ClassDescriptionType>();
            }
            return this.classDescription;
        }

    }

}
