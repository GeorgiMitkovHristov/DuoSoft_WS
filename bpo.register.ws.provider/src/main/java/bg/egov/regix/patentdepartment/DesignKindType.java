
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DesignKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Drawing"/>
 *     &lt;enumeration value="Model"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DesignKindType")
@XmlEnum
public enum DesignKindType {

    @XmlEnumValue("Drawing")
    DRAWING("Drawing"),
    @XmlEnumValue("Model")
    MODEL("Model");
    private final String value;

    DesignKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DesignKindType fromValue(String v) {
        for (DesignKindType c: DesignKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
