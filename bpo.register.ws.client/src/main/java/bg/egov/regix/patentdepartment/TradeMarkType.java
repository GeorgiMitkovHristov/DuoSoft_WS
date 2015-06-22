
package bg.egov.regix.patentdepartment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TradeMarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeMarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ApplicantSideCaseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MarkCurrentStatusCode" type="{http://egov.bg/RegiX/PatentDepartment}MarkCurrentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="MarkCurrentStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="KindMark" type="{http://egov.bg/RegiX/PatentDepartment}KindMarkType" minOccurs="0"/>
 *         &lt;element name="MarkFeature" type="{http://egov.bg/RegiX/PatentDepartment}MarkFeatureType"/>
 *         &lt;element name="MarkDescriptionDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarkDescription" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarkDisclaimerDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarkDisclaimer" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WordMarkSpecification" type="{http://egov.bg/RegiX/PatentDepartment}WordMarkSpecificationType" minOccurs="0"/>
 *         &lt;element name="MarkImageDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarkImage" type="{http://egov.bg/RegiX/PatentDepartment}MarkImageType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GoodsServicesDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GoodsServices" type="{http://egov.bg/RegiX/PatentDepartment}GoodsServicesType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriorityDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Priority" type="{http://egov.bg/RegiX/PatentDepartment}PriorityType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExhibitionPriorityDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExhibitionPriority" type="{http://egov.bg/RegiX/PatentDepartment}ExhibitionPriorityType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PublicationDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Publication" type="{http://egov.bg/RegiX/PatentDepartment}PublicationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicantDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Applicant" type="{http://egov.bg/RegiX/PatentDepartment}ApplicantType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RepresentativeDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Representative" type="{http://egov.bg/RegiX/PatentDepartment}RepresentativeType"/>
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
@XmlType(name = "TradeMarkType", propOrder = {
    "registrationOfficeCode",
    "applicationNumber",
    "applicationDate",
    "registrationNumber",
    "registrationDate",
    "applicantSideCaseKey",
    "applicationLanguageCode",
    "expiryDate",
    "markCurrentStatusCode",
    "markCurrentStatusDate",
    "kindMark",
    "markFeature",
    "markDescriptionDetails",
    "markDisclaimerDetails",
    "comment",
    "wordMarkSpecification",
    "markImageDetails",
    "goodsServicesDetails",
    "priorityDetails",
    "exhibitionPriorityDetails",
    "publicationDetails",
    "applicantDetails",
    "representativeDetails"
})
public class TradeMarkType {

    @XmlElement(name = "RegistrationOfficeCode")
    protected String registrationOfficeCode;
    @XmlElement(name = "ApplicationNumber", required = true)
    protected String applicationNumber;
    @XmlElement(name = "ApplicationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "ApplicantSideCaseKey")
    protected String applicantSideCaseKey;
    @XmlElement(name = "ApplicationLanguageCode")
    protected String applicationLanguageCode;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "MarkCurrentStatusCode")
    protected MarkCurrentStatusCodeType markCurrentStatusCode;
    @XmlElement(name = "MarkCurrentStatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar markCurrentStatusDate;
    @XmlElement(name = "KindMark")
    protected String kindMark;
    @XmlElement(name = "MarkFeature", required = true)
    protected String markFeature;
    @XmlElement(name = "MarkDescriptionDetails")
    protected TradeMarkType.MarkDescriptionDetails markDescriptionDetails;
    @XmlElement(name = "MarkDisclaimerDetails")
    protected TradeMarkType.MarkDisclaimerDetails markDisclaimerDetails;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "WordMarkSpecification")
    protected WordMarkSpecificationType wordMarkSpecification;
    @XmlElement(name = "MarkImageDetails")
    protected TradeMarkType.MarkImageDetails markImageDetails;
    @XmlElement(name = "GoodsServicesDetails", required = true)
    protected TradeMarkType.GoodsServicesDetails goodsServicesDetails;
    @XmlElement(name = "PriorityDetails")
    protected TradeMarkType.PriorityDetails priorityDetails;
    @XmlElement(name = "ExhibitionPriorityDetails")
    protected TradeMarkType.ExhibitionPriorityDetails exhibitionPriorityDetails;
    @XmlElement(name = "PublicationDetails")
    protected TradeMarkType.PublicationDetails publicationDetails;
    @XmlElement(name = "ApplicantDetails", required = true)
    protected TradeMarkType.ApplicantDetails applicantDetails;
    @XmlElement(name = "RepresentativeDetails")
    protected TradeMarkType.RepresentativeDetails representativeDetails;

    /**
     * Gets the value of the registrationOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationOfficeCode() {
        return registrationOfficeCode;
    }

    /**
     * Sets the value of the registrationOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationOfficeCode(String value) {
        this.registrationOfficeCode = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the applicantSideCaseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantSideCaseKey() {
        return applicantSideCaseKey;
    }

    /**
     * Sets the value of the applicantSideCaseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantSideCaseKey(String value) {
        this.applicantSideCaseKey = value;
    }

    /**
     * Gets the value of the applicationLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationLanguageCode() {
        return applicationLanguageCode;
    }

    /**
     * Sets the value of the applicationLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationLanguageCode(String value) {
        this.applicationLanguageCode = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the markCurrentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link MarkCurrentStatusCodeType }
     *     
     */
    public MarkCurrentStatusCodeType getMarkCurrentStatusCode() {
        return markCurrentStatusCode;
    }

    /**
     * Sets the value of the markCurrentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCurrentStatusCodeType }
     *     
     */
    public void setMarkCurrentStatusCode(MarkCurrentStatusCodeType value) {
        this.markCurrentStatusCode = value;
    }

    /**
     * Gets the value of the markCurrentStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarkCurrentStatusDate() {
        return markCurrentStatusDate;
    }

    /**
     * Sets the value of the markCurrentStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarkCurrentStatusDate(XMLGregorianCalendar value) {
        this.markCurrentStatusDate = value;
    }

    /**
     * Gets the value of the kindMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindMark() {
        return kindMark;
    }

    /**
     * Sets the value of the kindMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindMark(String value) {
        this.kindMark = value;
    }

    /**
     * Gets the value of the markFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkFeature() {
        return markFeature;
    }

    /**
     * Sets the value of the markFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkFeature(String value) {
        this.markFeature = value;
    }

    /**
     * Gets the value of the markDescriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.MarkDescriptionDetails }
     *     
     */
    public TradeMarkType.MarkDescriptionDetails getMarkDescriptionDetails() {
        return markDescriptionDetails;
    }

    /**
     * Sets the value of the markDescriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.MarkDescriptionDetails }
     *     
     */
    public void setMarkDescriptionDetails(TradeMarkType.MarkDescriptionDetails value) {
        this.markDescriptionDetails = value;
    }

    /**
     * Gets the value of the markDisclaimerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.MarkDisclaimerDetails }
     *     
     */
    public TradeMarkType.MarkDisclaimerDetails getMarkDisclaimerDetails() {
        return markDisclaimerDetails;
    }

    /**
     * Sets the value of the markDisclaimerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.MarkDisclaimerDetails }
     *     
     */
    public void setMarkDisclaimerDetails(TradeMarkType.MarkDisclaimerDetails value) {
        this.markDisclaimerDetails = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the wordMarkSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link WordMarkSpecificationType }
     *     
     */
    public WordMarkSpecificationType getWordMarkSpecification() {
        return wordMarkSpecification;
    }

    /**
     * Sets the value of the wordMarkSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordMarkSpecificationType }
     *     
     */
    public void setWordMarkSpecification(WordMarkSpecificationType value) {
        this.wordMarkSpecification = value;
    }

    /**
     * Gets the value of the markImageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.MarkImageDetails }
     *     
     */
    public TradeMarkType.MarkImageDetails getMarkImageDetails() {
        return markImageDetails;
    }

    /**
     * Sets the value of the markImageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.MarkImageDetails }
     *     
     */
    public void setMarkImageDetails(TradeMarkType.MarkImageDetails value) {
        this.markImageDetails = value;
    }

    /**
     * Gets the value of the goodsServicesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.GoodsServicesDetails }
     *     
     */
    public TradeMarkType.GoodsServicesDetails getGoodsServicesDetails() {
        return goodsServicesDetails;
    }

    /**
     * Sets the value of the goodsServicesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.GoodsServicesDetails }
     *     
     */
    public void setGoodsServicesDetails(TradeMarkType.GoodsServicesDetails value) {
        this.goodsServicesDetails = value;
    }

    /**
     * Gets the value of the priorityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.PriorityDetails }
     *     
     */
    public TradeMarkType.PriorityDetails getPriorityDetails() {
        return priorityDetails;
    }

    /**
     * Sets the value of the priorityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.PriorityDetails }
     *     
     */
    public void setPriorityDetails(TradeMarkType.PriorityDetails value) {
        this.priorityDetails = value;
    }

    /**
     * Gets the value of the exhibitionPriorityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.ExhibitionPriorityDetails }
     *     
     */
    public TradeMarkType.ExhibitionPriorityDetails getExhibitionPriorityDetails() {
        return exhibitionPriorityDetails;
    }

    /**
     * Sets the value of the exhibitionPriorityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.ExhibitionPriorityDetails }
     *     
     */
    public void setExhibitionPriorityDetails(TradeMarkType.ExhibitionPriorityDetails value) {
        this.exhibitionPriorityDetails = value;
    }

    /**
     * Gets the value of the publicationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.PublicationDetails }
     *     
     */
    public TradeMarkType.PublicationDetails getPublicationDetails() {
        return publicationDetails;
    }

    /**
     * Sets the value of the publicationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.PublicationDetails }
     *     
     */
    public void setPublicationDetails(TradeMarkType.PublicationDetails value) {
        this.publicationDetails = value;
    }

    /**
     * Gets the value of the applicantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.ApplicantDetails }
     *     
     */
    public TradeMarkType.ApplicantDetails getApplicantDetails() {
        return applicantDetails;
    }

    /**
     * Sets the value of the applicantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.ApplicantDetails }
     *     
     */
    public void setApplicantDetails(TradeMarkType.ApplicantDetails value) {
        this.applicantDetails = value;
    }

    /**
     * Gets the value of the representativeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarkType.RepresentativeDetails }
     *     
     */
    public TradeMarkType.RepresentativeDetails getRepresentativeDetails() {
        return representativeDetails;
    }

    /**
     * Sets the value of the representativeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarkType.RepresentativeDetails }
     *     
     */
    public void setRepresentativeDetails(TradeMarkType.RepresentativeDetails value) {
        this.representativeDetails = value;
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
     *         &lt;element name="Applicant" type="{http://egov.bg/RegiX/PatentDepartment}ApplicantType"/>
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
        "applicant"
    })
    public static class ApplicantDetails {

        @XmlElement(name = "Applicant", required = true)
        protected ApplicantType applicant;

        /**
         * Gets the value of the applicant property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicantType }
         *     
         */
        public ApplicantType getApplicant() {
            return applicant;
        }

        /**
         * Sets the value of the applicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicantType }
         *     
         */
        public void setApplicant(ApplicantType value) {
            this.applicant = value;
        }

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
     *         &lt;element name="ExhibitionPriority" type="{http://egov.bg/RegiX/PatentDepartment}ExhibitionPriorityType" maxOccurs="unbounded"/>
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
        "exhibitionPriority"
    })
    public static class ExhibitionPriorityDetails {

        @XmlElement(name = "ExhibitionPriority", required = true)
        protected List<ExhibitionPriorityType> exhibitionPriority;

        /**
         * Gets the value of the exhibitionPriority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exhibitionPriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExhibitionPriority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExhibitionPriorityType }
         * 
         * 
         */
        public List<ExhibitionPriorityType> getExhibitionPriority() {
            if (exhibitionPriority == null) {
                exhibitionPriority = new ArrayList<ExhibitionPriorityType>();
            }
            return this.exhibitionPriority;
        }

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
     *         &lt;element name="GoodsServices" type="{http://egov.bg/RegiX/PatentDepartment}GoodsServicesType"/>
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
        "goodsServices"
    })
    public static class GoodsServicesDetails {

        @XmlElement(name = "GoodsServices", required = true)
        protected GoodsServicesType goodsServices;

        /**
         * Gets the value of the goodsServices property.
         * 
         * @return
         *     possible object is
         *     {@link GoodsServicesType }
         *     
         */
        public GoodsServicesType getGoodsServices() {
            return goodsServices;
        }

        /**
         * Sets the value of the goodsServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link GoodsServicesType }
         *     
         */
        public void setGoodsServices(GoodsServicesType value) {
            this.goodsServices = value;
        }

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
     *         &lt;element name="MarkDescription" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/>
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
        "markDescription"
    })
    public static class MarkDescriptionDetails {

        @XmlElement(name = "MarkDescription", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> markDescription;

        /**
         * Gets the value of the markDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the markDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarkDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMarkDescription() {
            if (markDescription == null) {
                markDescription = new ArrayList<String>();
            }
            return this.markDescription;
        }

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
     *         &lt;element name="MarkDisclaimer" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/>
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
        "markDisclaimer"
    })
    public static class MarkDisclaimerDetails {

        @XmlElement(name = "MarkDisclaimer", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> markDisclaimer;

        /**
         * Gets the value of the markDisclaimer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the markDisclaimer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarkDisclaimer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMarkDisclaimer() {
            if (markDisclaimer == null) {
                markDisclaimer = new ArrayList<String>();
            }
            return this.markDisclaimer;
        }

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
     *         &lt;element name="MarkImage" type="{http://egov.bg/RegiX/PatentDepartment}MarkImageType"/>
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
        "markImage"
    })
    public static class MarkImageDetails {

        @XmlElement(name = "MarkImage", required = true)
        protected MarkImageType markImage;

        /**
         * Gets the value of the markImage property.
         * 
         * @return
         *     possible object is
         *     {@link MarkImageType }
         *     
         */
        public MarkImageType getMarkImage() {
            return markImage;
        }

        /**
         * Sets the value of the markImage property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarkImageType }
         *     
         */
        public void setMarkImage(MarkImageType value) {
            this.markImage = value;
        }

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
     *         &lt;element name="Priority" type="{http://egov.bg/RegiX/PatentDepartment}PriorityType" maxOccurs="unbounded"/>
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
        "priority"
    })
    public static class PriorityDetails {

        @XmlElement(name = "Priority", required = true)
        protected List<PriorityType> priority;

        /**
         * Gets the value of the priority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriorityType }
         * 
         * 
         */
        public List<PriorityType> getPriority() {
            if (priority == null) {
                priority = new ArrayList<PriorityType>();
            }
            return this.priority;
        }

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
     *         &lt;element name="Publication" type="{http://egov.bg/RegiX/PatentDepartment}PublicationType" maxOccurs="unbounded"/>
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
        "publication"
    })
    public static class PublicationDetails {

        @XmlElement(name = "Publication", required = true)
        protected List<PublicationType> publication;

        /**
         * Gets the value of the publication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PublicationType }
         * 
         * 
         */
        public List<PublicationType> getPublication() {
            if (publication == null) {
                publication = new ArrayList<PublicationType>();
            }
            return this.publication;
        }

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
     *         &lt;element name="Representative" type="{http://egov.bg/RegiX/PatentDepartment}RepresentativeType"/>
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
        "representative"
    })
    public static class RepresentativeDetails {

        @XmlElement(name = "Representative", required = true)
        protected RepresentativeType representative;

        /**
         * Gets the value of the representative property.
         * 
         * @return
         *     possible object is
         *     {@link RepresentativeType }
         *     
         */
        public RepresentativeType getRepresentative() {
            return representative;
        }

        /**
         * Sets the value of the representative property.
         * 
         * @param value
         *     allowed object is
         *     {@link RepresentativeType }
         *     
         */
        public void setRepresentative(RepresentativeType value) {
            this.representative = value;
        }

    }

}
