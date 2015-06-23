
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignCurrentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DesignCurrentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Filed"/>
 *     &lt;enumeration value="Withdrawn"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DesignCurrentStatusCodeType")
@XmlEnum
public enum DesignCurrentStatusCodeType {

    @XmlEnumValue("Filed")
    FILED("Filed"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined");
    private final String value;

    DesignCurrentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DesignCurrentStatusCodeType fromValue(String v) {
        for (DesignCurrentStatusCodeType c: DesignCurrentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
