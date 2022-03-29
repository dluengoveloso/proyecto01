package cl.delv.inicial.proyecto01.other;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Telephone001 complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * <complexType name="Telephone001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="phoneSecuence" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="phoneTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="phoneCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="phoneArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="phoneContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="promotionalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="promotionalDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="modificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="phoneSinceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="PhoneSecuenceOld" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="phoneNumberOld" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FlgLogSesionInsert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FlgLogSesionModif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telephone001", propOrder = {"phoneSecuence", "phoneType", "phoneTypeDesc", "phoneCountry", "phoneArea", "phoneNumber", "phoneContact", "promotionalCode", "promotionalDesc", "statusCode", "statusDesc", "contactCode", "contactDesc", "modificationCode", "phoneSinceDate", "phoneSecuenceOld", "phoneNumberOld", "flgLogSesionInsert", "flgLogSesionModif"})
public class Telephone001 {
    /**
     * The Phone secuence.
     */
    @XmlElement(required = true)
    protected BigDecimal phoneSecuence;
    /**
     * The Phone type.
     */
    @XmlElement(required = true)
    protected String phoneType;
    /**
     * The Phone type desc.
     */
    @XmlElement(required = true)
    protected String phoneTypeDesc;
    /**
     * The Phone country.
     */
    @XmlElement(required = true)
    protected String phoneCountry;
    /**
     * The Phone area.
     */
    @XmlElement(required = true)
    protected String phoneArea;
    /**
     * The Phone number.
     */
    @XmlElement(required = true)
    protected String phoneNumber;
    /**
     * The Phone contact.
     */
    @XmlElement(required = true)
    protected String phoneContact;
    /**
     * The Promotional code.
     */
    @XmlElement(required = true)
    protected String promotionalCode;
    /**
     * The Promotional desc.
     */
    @XmlElement(required = true)
    protected String promotionalDesc;
    /**
     * The Status code.
     */
    @XmlElement(required = true)
    protected String statusCode;
    /**
     * The Status desc.
     */
    @XmlElement(required = true)
    protected String statusDesc;
    /**
     * The Contact code.
     */
    @XmlElement(required = true)
    protected String contactCode;
    /**
     * The Contact desc.
     */
    @XmlElement(required = true)
    protected String contactDesc;
    /**
     * The Modification code.
     */
    @XmlElement(required = true)
    protected String modificationCode;
    /**
     * The Phone since date.
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar phoneSinceDate;
    /**
     * The Phone secuence old.
     */
    @XmlElement(name = "PhoneSecuenceOld", required = true)
    protected BigDecimal phoneSecuenceOld;
    /**
     * The Phone number old.
     */
    @XmlElement(required = true)
    protected String phoneNumberOld;
    @XmlElement(name = "FlgLogSesionInsert", required = true)
    private String flgLogSesionInsert;
    @XmlElement(name = "FlgLogSesionModif", required = true)
    private String flgLogSesionModif;

    /**
     * Obtiene el valor de la propiedad phoneSecuence.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getPhoneSecuence() {
        return phoneSecuence;
    }

    /**
     * Define el valor de la propiedad phoneSecuence.
     *
     * @param value allowed object is              {@link BigDecimal }
     */
    public void setPhoneSecuence(BigDecimal value) {
        this.phoneSecuence = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneType.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Define el valor de la propiedad phoneType.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneTypeDesc.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneTypeDesc() {
        return phoneTypeDesc;
    }

    /**
     * Define el valor de la propiedad phoneTypeDesc.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneTypeDesc(String value) {
        this.phoneTypeDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneCountry.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneCountry() {
        return phoneCountry;
    }

    /**
     * Define el valor de la propiedad phoneCountry.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneCountry(String value) {
        this.phoneCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneArea.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Define el valor de la propiedad phoneArea.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneArea(String value) {
        this.phoneArea = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneContact.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneContact() {
        return phoneContact;
    }

    /**
     * Define el valor de la propiedad phoneContact.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneContact(String value) {
        this.phoneContact = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionalCode.
     *
     * @return possible object is {@link String }
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Define el valor de la propiedad promotionalCode.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionalDesc.
     *
     * @return possible object is {@link String }
     */
    public String getPromotionalDesc() {
        return promotionalDesc;
    }

    /**
     * Define el valor de la propiedad promotionalDesc.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPromotionalDesc(String value) {
        this.promotionalDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     *
     * @return possible object is {@link String }
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     *
     * @param value allowed object is              {@link String }
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     *
     * @return possible object is {@link String }
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     *
     * @param value allowed object is              {@link String }
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad contactCode.
     *
     * @return possible object is {@link String }
     */
    public String getContactCode() {
        return contactCode;
    }

    /**
     * Define el valor de la propiedad contactCode.
     *
     * @param value allowed object is              {@link String }
     */
    public void setContactCode(String value) {
        this.contactCode = value;
    }

    /**
     * Obtiene el valor de la propiedad contactDesc.
     *
     * @return possible object is {@link String }
     */
    public String getContactDesc() {
        return contactDesc;
    }

    /**
     * Define el valor de la propiedad contactDesc.
     *
     * @param value allowed object is              {@link String }
     */
    public void setContactDesc(String value) {
        this.contactDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad modificationCode.
     *
     * @return possible object is {@link String }
     */
    public String getModificationCode() {
        return modificationCode;
    }

    /**
     * Define el valor de la propiedad modificationCode.
     *
     * @param value allowed object is              {@link String }
     */
    public void setModificationCode(String value) {
        this.modificationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneSinceDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPhoneSinceDate() {
        return phoneSinceDate;
    }

    /**
     * Define el valor de la propiedad phoneSinceDate.
     *
     * @param value allowed object is              {@link XMLGregorianCalendar }
     */
    public void setPhoneSinceDate(XMLGregorianCalendar value) {
        this.phoneSinceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneSecuenceOld.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getPhoneSecuenceOld() {
        return phoneSecuenceOld;
    }

    /**
     * Define el valor de la propiedad phoneSecuenceOld.
     *
     * @param value allowed object is              {@link BigDecimal }
     */
    public void setPhoneSecuenceOld(BigDecimal value) {
        this.phoneSecuenceOld = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumberOld.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneNumberOld() {
        return phoneNumberOld;
    }

    /**
     * Define el valor de la propiedad phoneNumberOld.
     *
     * @param value allowed object is              {@link String }
     */
    public void setPhoneNumberOld(String value) {
        this.phoneNumberOld = value;
    }

    /**
     * Obtiene el valor de la propiedad flgLogSesionInsert.
     *
     * @return possible object is {@link String }
     */
    public String getFlgLogSesionInsert() {
        return flgLogSesionInsert;
    }

    /**
     * Define el valor de la propiedad flgLogSesionInsert.
     *
     * @param value allowed object is              {@link String }
     */
    public void setFlgLogSesionInsert(String value) {
        this.flgLogSesionInsert = value;
    }

    /**
     * Obtiene el valor de la propiedad flgLogSesionModif.
     *
     * @return possible object is {@link String }
     */
    public String getFlgLogSesionModif() {
        return flgLogSesionModif;
    }

    /**
     * Define el valor de la propiedad flgLogSesionModif.
     *
     * @param value allowed object is              {@link String }
     */
    public void setFlgLogSesionModif(String value) {
        this.flgLogSesionModif = value;
    }
}

