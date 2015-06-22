
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PatentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NationalPatent"/>
 *     &lt;enumeration value="SPCPatent"/>
 *     &lt;enumeration value="NationalUtilityModel"/>
 *     &lt;enumeration value="SPCUtilityModel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PatentKindType")
@XmlEnum
public enum PatentKindType {

    @XmlEnumValue("NationalPatent")
    NATIONAL_PATENT("NationalPatent"),
    @XmlEnumValue("SPCPatent")
    SPC_PATENT("SPCPatent"),
    @XmlEnumValue("NationalUtilityModel")
    NATIONAL_UTILITY_MODEL("NationalUtilityModel"),
    @XmlEnumValue("SPCUtilityModel")
    SPC_UTILITY_MODEL("SPCUtilityModel");
    private final String value;

    PatentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentKindType fromValue(String v) {
        for (PatentKindType c: PatentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
