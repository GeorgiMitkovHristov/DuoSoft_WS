
package bg.egov.regix.patentdepartment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkCurrentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkCurrentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Application filed"/>
 *     &lt;enumeration value="Filing date accorded"/>
 *     &lt;enumeration value="Classification checked"/>
 *     &lt;enumeration value="Application accepted"/>
 *     &lt;enumeration value="Application published"/>
 *     &lt;enumeration value="Application opposed"/>
 *     &lt;enumeration value="Application refused"/>
 *     &lt;enumeration value="Application deemed withdrawn"/>
 *     &lt;enumeration value="Application withdrawn"/>
 *     &lt;enumeration value="Appeal pending"/>
 *     &lt;enumeration value="Interruption of proceedings"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Registration opposed"/>
 *     &lt;enumeration value="Registration cancellation pending"/>
 *     &lt;enumeration value="Registration cancelled"/>
 *     &lt;enumeration value="Conversion requested"/>
 *     &lt;enumeration value="Registration surrendered"/>
 *     &lt;enumeration value="Revocation proceeding pending"/>
 *     &lt;enumeration value="Invalidity proceeding pending"/>
 *     &lt;enumeration value="Action before Court of Justice pending"/>
 *     &lt;enumeration value="Expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarkCurrentStatusCodeType")
@XmlEnum
public enum MarkCurrentStatusCodeType {

    @XmlEnumValue("Application filed")
    APPLICATION_FILED("Application filed"),
    @XmlEnumValue("Filing date accorded")
    FILING_DATE_ACCORDED("Filing date accorded"),
    @XmlEnumValue("Classification checked")
    CLASSIFICATION_CHECKED("Classification checked"),
    @XmlEnumValue("Application accepted")
    APPLICATION_ACCEPTED("Application accepted"),
    @XmlEnumValue("Application published")
    APPLICATION_PUBLISHED("Application published"),
    @XmlEnumValue("Application opposed")
    APPLICATION_OPPOSED("Application opposed"),
    @XmlEnumValue("Application refused")
    APPLICATION_REFUSED("Application refused"),
    @XmlEnumValue("Application deemed withdrawn")
    APPLICATION_DEEMED_WITHDRAWN("Application deemed withdrawn"),
    @XmlEnumValue("Application withdrawn")
    APPLICATION_WITHDRAWN("Application withdrawn"),
    @XmlEnumValue("Appeal pending")
    APPEAL_PENDING("Appeal pending"),
    @XmlEnumValue("Interruption of proceedings")
    INTERRUPTION_OF_PROCEEDINGS("Interruption of proceedings"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Registration opposed")
    REGISTRATION_OPPOSED("Registration opposed"),
    @XmlEnumValue("Registration cancellation pending")
    REGISTRATION_CANCELLATION_PENDING("Registration cancellation pending"),
    @XmlEnumValue("Registration cancelled")
    REGISTRATION_CANCELLED("Registration cancelled"),
    @XmlEnumValue("Conversion requested")
    CONVERSION_REQUESTED("Conversion requested"),
    @XmlEnumValue("Registration surrendered")
    REGISTRATION_SURRENDERED("Registration surrendered"),
    @XmlEnumValue("Revocation proceeding pending")
    REVOCATION_PROCEEDING_PENDING("Revocation proceeding pending"),
    @XmlEnumValue("Invalidity proceeding pending")
    INVALIDITY_PROCEEDING_PENDING("Invalidity proceeding pending"),
    @XmlEnumValue("Action before Court of Justice pending")
    ACTION_BEFORE_COURT_OF_JUSTICE_PENDING("Action before Court of Justice pending"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    MarkCurrentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkCurrentStatusCodeType fromValue(String v) {
        for (MarkCurrentStatusCodeType c: MarkCurrentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
