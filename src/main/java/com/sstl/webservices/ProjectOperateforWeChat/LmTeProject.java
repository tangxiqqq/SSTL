
package com.sstl.webservices.ProjectOperateforWeChat;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>LmTeProject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LmTeProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_short" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_eng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sub_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mana_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="income_fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="payout_fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vss_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contact_client_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tech_client_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contract_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fk_relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="project_score" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="plan_start_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="plan_end_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="start_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="apply_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="check_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="archive_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dispatch_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="apply_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="check_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="archive_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dispatch_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evaluation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qa_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sign_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="show_test_purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="proj_kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoice_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="invoice_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pay_way" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_name_eng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_Organizationcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportcheck_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportapprove_uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LmTeProject", propOrder = {
    "iid",
    "guid",
    "code",
    "name",
    "nameShort",
    "nameEng",
    "kind",
    "type",
    "subType",
    "source",
    "manaId",
    "fee",
    "incomeFee",
    "payoutFee",
    "vssPath",
    "productId",
    "companyId",
    "contactClientId",
    "techClientId",
    "contractId",
    "fkRelation",
    "purpose",
    "request",
    "property",
    "projectScore",
    "planStartDt",
    "planEndDt",
    "startDt",
    "endDt",
    "applyDt",
    "checkDt",
    "archiveDt",
    "dispatchDt",
    "applyUid",
    "checkUid",
    "archiveUid",
    "dispatchUid",
    "description",
    "fid",
    "state",
    "status",
    "tag1",
    "tag2",
    "tag3",
    "tag4",
    "tag5",
    "tag6",
    "hstate",
    "evaluation",
    "field",
    "qaUid",
    "authority",
    "security",
    "dept",
    "signName",
    "showTestPurpose",
    "keyword",
    "prefee",
    "projKind",
    "invoiceDt",
    "invoiceNum",
    "payWay",
    "companyName",
    "companyNameEng",
    "companyAddress",
    "companyZip",
    "companyUrl",
    "companyFax",
    "companyOrganizationcode",
    "companyPhone",
    "reportcheckUid",
    "reportapproveUid",
    "tag7",
    "tag8",
    "tag9",
    "tag10",
    "tag11",
    "tag12",
    "tag13",
    "tag14",
    "tag15",
    "tag16",
    "tag17",
    "tag18"
})
public class LmTeProject {

    protected int iid;
    @XmlElement(required = true)
    protected String guid;
    protected String code;
    protected String name;
    @XmlElement(name = "name_short")
    protected String nameShort;
    @XmlElement(name = "name_eng")
    protected String nameEng;
    protected String kind;
    protected String type;
    @XmlElement(name = "sub_type")
    protected String subType;
    protected String source;
    @XmlElement(name = "mana_id")
    protected int manaId;
    @XmlElement(required = true)
    protected BigDecimal fee;
    @XmlElement(name = "income_fee", required = true)
    protected BigDecimal incomeFee;
    @XmlElement(name = "payout_fee", required = true)
    protected BigDecimal payoutFee;
    @XmlElement(name = "vss_path")
    protected String vssPath;
    @XmlElement(name = "product_id")
    protected int productId;
    @XmlElement(name = "company_id")
    protected int companyId;
    @XmlElement(name = "contact_client_id")
    protected int contactClientId;
    @XmlElement(name = "tech_client_id")
    protected int techClientId;
    @XmlElement(name = "contract_id")
    protected int contractId;
    @XmlElement(name = "fk_relation")
    protected String fkRelation;
    protected String purpose;
    protected String request;
    protected String property;
    @XmlElement(name = "project_score", required = true)
    protected BigDecimal projectScore;
    @XmlElement(name = "plan_start_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planStartDt;
    @XmlElement(name = "plan_end_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planEndDt;
    @XmlElement(name = "start_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "end_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "apply_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDt;
    @XmlElement(name = "check_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkDt;
    @XmlElement(name = "archive_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar archiveDt;
    @XmlElement(name = "dispatch_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dispatchDt;
    @XmlElement(name = "apply_uid")
    protected int applyUid;
    @XmlElement(name = "check_uid")
    protected int checkUid;
    @XmlElement(name = "archive_uid")
    protected int archiveUid;
    @XmlElement(name = "dispatch_uid")
    protected int dispatchUid;
    protected String description;
    protected int fid;
    protected String state;
    protected int status;
    protected String tag1;
    protected String tag2;
    protected String tag3;
    protected String tag4;
    protected String tag5;
    protected String tag6;
    protected String hstate;
    protected String evaluation;
    protected String field;
    @XmlElement(name = "qa_uid")
    protected int qaUid;
    protected String authority;
    protected String security;
    protected String dept;
    @XmlElement(name = "sign_name")
    protected String signName;
    @XmlElement(name = "show_test_purpose")
    protected String showTestPurpose;
    protected String keyword;
    @XmlElement(required = true)
    protected BigDecimal prefee;
    @XmlElement(name = "proj_kind")
    protected String projKind;
    @XmlElement(name = "invoice_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDt;
    @XmlElement(name = "invoice_num")
    protected int invoiceNum;
    @XmlElement(name = "pay_way")
    protected String payWay;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "company_name_eng")
    protected String companyNameEng;
    @XmlElement(name = "company_address")
    protected String companyAddress;
    @XmlElement(name = "company_zip")
    protected String companyZip;
    @XmlElement(name = "company_url")
    protected String companyUrl;
    @XmlElement(name = "company_fax")
    protected String companyFax;
    @XmlElement(name = "company_Organizationcode")
    protected String companyOrganizationcode;
    @XmlElement(name = "company_phone")
    protected String companyPhone;
    @XmlElement(name = "reportcheck_uid")
    protected int reportcheckUid;
    @XmlElement(name = "reportapprove_uid")
    protected int reportapproveUid;
    protected String tag7;
    protected String tag8;
    protected String tag9;
    protected String tag10;
    protected String tag11;
    protected String tag12;
    protected String tag13;
    protected String tag14;
    protected String tag15;
    protected String tag16;
    protected String tag17;
    protected String tag18;

    /**
     * 获取iid属性的值。
     * 
     */
    public int getIid() {
        return iid;
    }

    /**
     * 设置iid属性的值。
     * 
     */
    public void setIid(int value) {
        this.iid = value;
    }

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取nameShort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameShort() {
        return nameShort;
    }

    /**
     * 设置nameShort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameShort(String value) {
        this.nameShort = value;
    }

    /**
     * 获取nameEng属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEng() {
        return nameEng;
    }

    /**
     * 设置nameEng属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEng(String value) {
        this.nameEng = value;
    }

    /**
     * 获取kind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置kind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取subType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * 获取manaId属性的值。
     * 
     */
    public int getManaId() {
        return manaId;
    }

    /**
     * 设置manaId属性的值。
     * 
     */
    public void setManaId(int value) {
        this.manaId = value;
    }

    /**
     * 获取fee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置fee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * 获取incomeFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncomeFee() {
        return incomeFee;
    }

    /**
     * 设置incomeFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncomeFee(BigDecimal value) {
        this.incomeFee = value;
    }

    /**
     * 获取payoutFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayoutFee() {
        return payoutFee;
    }

    /**
     * 设置payoutFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayoutFee(BigDecimal value) {
        this.payoutFee = value;
    }

    /**
     * 获取vssPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVssPath() {
        return vssPath;
    }

    /**
     * 设置vssPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVssPath(String value) {
        this.vssPath = value;
    }

    /**
     * 获取productId属性的值。
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * 获取companyId属性的值。
     * 
     */
    public int getCompanyId() {
        return companyId;
    }

    /**
     * 设置companyId属性的值。
     * 
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }

    /**
     * 获取contactClientId属性的值。
     * 
     */
    public int getContactClientId() {
        return contactClientId;
    }

    /**
     * 设置contactClientId属性的值。
     * 
     */
    public void setContactClientId(int value) {
        this.contactClientId = value;
    }

    /**
     * 获取techClientId属性的值。
     * 
     */
    public int getTechClientId() {
        return techClientId;
    }

    /**
     * 设置techClientId属性的值。
     * 
     */
    public void setTechClientId(int value) {
        this.techClientId = value;
    }

    /**
     * 获取contractId属性的值。
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * 设置contractId属性的值。
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * 获取fkRelation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkRelation() {
        return fkRelation;
    }

    /**
     * 设置fkRelation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkRelation(String value) {
        this.fkRelation = value;
    }

    /**
     * 获取purpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 设置purpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * 获取request属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest(String value) {
        this.request = value;
    }

    /**
     * 获取property属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * 获取projectScore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProjectScore() {
        return projectScore;
    }

    /**
     * 设置projectScore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProjectScore(BigDecimal value) {
        this.projectScore = value;
    }

    /**
     * 获取planStartDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanStartDt() {
        return planStartDt;
    }

    /**
     * 设置planStartDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanStartDt(XMLGregorianCalendar value) {
        this.planStartDt = value;
    }

    /**
     * 获取planEndDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanEndDt() {
        return planEndDt;
    }

    /**
     * 设置planEndDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanEndDt(XMLGregorianCalendar value) {
        this.planEndDt = value;
    }

    /**
     * 获取startDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * 设置startDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * 获取endDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * 设置endDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * 获取applyDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDt() {
        return applyDt;
    }

    /**
     * 设置applyDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDt(XMLGregorianCalendar value) {
        this.applyDt = value;
    }

    /**
     * 获取checkDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckDt() {
        return checkDt;
    }

    /**
     * 设置checkDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckDt(XMLGregorianCalendar value) {
        this.checkDt = value;
    }

    /**
     * 获取archiveDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDt() {
        return archiveDt;
    }

    /**
     * 设置archiveDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveDt(XMLGregorianCalendar value) {
        this.archiveDt = value;
    }

    /**
     * 获取dispatchDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDt() {
        return dispatchDt;
    }

    /**
     * 设置dispatchDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDt(XMLGregorianCalendar value) {
        this.dispatchDt = value;
    }

    /**
     * 获取applyUid属性的值。
     * 
     */
    public int getApplyUid() {
        return applyUid;
    }

    /**
     * 设置applyUid属性的值。
     * 
     */
    public void setApplyUid(int value) {
        this.applyUid = value;
    }

    /**
     * 获取checkUid属性的值。
     * 
     */
    public int getCheckUid() {
        return checkUid;
    }

    /**
     * 设置checkUid属性的值。
     * 
     */
    public void setCheckUid(int value) {
        this.checkUid = value;
    }

    /**
     * 获取archiveUid属性的值。
     * 
     */
    public int getArchiveUid() {
        return archiveUid;
    }

    /**
     * 设置archiveUid属性的值。
     * 
     */
    public void setArchiveUid(int value) {
        this.archiveUid = value;
    }

    /**
     * 获取dispatchUid属性的值。
     * 
     */
    public int getDispatchUid() {
        return dispatchUid;
    }

    /**
     * 设置dispatchUid属性的值。
     * 
     */
    public void setDispatchUid(int value) {
        this.dispatchUid = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取fid属性的值。
     * 
     */
    public int getFid() {
        return fid;
    }

    /**
     * 设置fid属性的值。
     * 
     */
    public void setFid(int value) {
        this.fid = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取status属性的值。
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * 获取tag1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag1() {
        return tag1;
    }

    /**
     * 设置tag1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag1(String value) {
        this.tag1 = value;
    }

    /**
     * 获取tag2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag2() {
        return tag2;
    }

    /**
     * 设置tag2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag2(String value) {
        this.tag2 = value;
    }

    /**
     * 获取tag3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag3() {
        return tag3;
    }

    /**
     * 设置tag3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag3(String value) {
        this.tag3 = value;
    }

    /**
     * 获取tag4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag4() {
        return tag4;
    }

    /**
     * 设置tag4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag4(String value) {
        this.tag4 = value;
    }

    /**
     * 获取tag5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag5() {
        return tag5;
    }

    /**
     * 设置tag5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag5(String value) {
        this.tag5 = value;
    }

    /**
     * 获取tag6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag6() {
        return tag6;
    }

    /**
     * 设置tag6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag6(String value) {
        this.tag6 = value;
    }

    /**
     * 获取hstate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstate() {
        return hstate;
    }

    /**
     * 设置hstate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstate(String value) {
        this.hstate = value;
    }

    /**
     * 获取evaluation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * 设置evaluation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluation(String value) {
        this.evaluation = value;
    }

    /**
     * 获取field属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * 设置field属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * 获取qaUid属性的值。
     * 
     */
    public int getQaUid() {
        return qaUid;
    }

    /**
     * 设置qaUid属性的值。
     * 
     */
    public void setQaUid(int value) {
        this.qaUid = value;
    }

    /**
     * 获取authority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * 设置authority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * 获取security属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * 设置security属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * 获取dept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置dept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * 获取signName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignName() {
        return signName;
    }

    /**
     * 设置signName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignName(String value) {
        this.signName = value;
    }

    /**
     * 获取showTestPurpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowTestPurpose() {
        return showTestPurpose;
    }

    /**
     * 设置showTestPurpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowTestPurpose(String value) {
        this.showTestPurpose = value;
    }

    /**
     * 获取keyword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置keyword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * 获取prefee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrefee() {
        return prefee;
    }

    /**
     * 设置prefee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrefee(BigDecimal value) {
        this.prefee = value;
    }

    /**
     * 获取projKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjKind() {
        return projKind;
    }

    /**
     * 设置projKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjKind(String value) {
        this.projKind = value;
    }

    /**
     * 获取invoiceDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDt() {
        return invoiceDt;
    }

    /**
     * 设置invoiceDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDt(XMLGregorianCalendar value) {
        this.invoiceDt = value;
    }

    /**
     * 获取invoiceNum属性的值。
     * 
     */
    public int getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * 设置invoiceNum属性的值。
     * 
     */
    public void setInvoiceNum(int value) {
        this.invoiceNum = value;
    }

    /**
     * 获取payWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * 设置payWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayWay(String value) {
        this.payWay = value;
    }

    /**
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * 获取companyNameEng属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameEng() {
        return companyNameEng;
    }

    /**
     * 设置companyNameEng属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameEng(String value) {
        this.companyNameEng = value;
    }

    /**
     * 获取companyAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置companyAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * 获取companyZip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyZip() {
        return companyZip;
    }

    /**
     * 设置companyZip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyZip(String value) {
        this.companyZip = value;
    }

    /**
     * 获取companyUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyUrl() {
        return companyUrl;
    }

    /**
     * 设置companyUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyUrl(String value) {
        this.companyUrl = value;
    }

    /**
     * 获取companyFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFax() {
        return companyFax;
    }

    /**
     * 设置companyFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFax(String value) {
        this.companyFax = value;
    }

    /**
     * 获取companyOrganizationcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyOrganizationcode() {
        return companyOrganizationcode;
    }

    /**
     * 设置companyOrganizationcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyOrganizationcode(String value) {
        this.companyOrganizationcode = value;
    }

    /**
     * 获取companyPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 设置companyPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * 获取reportcheckUid属性的值。
     * 
     */
    public int getReportcheckUid() {
        return reportcheckUid;
    }

    /**
     * 设置reportcheckUid属性的值。
     * 
     */
    public void setReportcheckUid(int value) {
        this.reportcheckUid = value;
    }

    /**
     * 获取reportapproveUid属性的值。
     * 
     */
    public int getReportapproveUid() {
        return reportapproveUid;
    }

    /**
     * 设置reportapproveUid属性的值。
     * 
     */
    public void setReportapproveUid(int value) {
        this.reportapproveUid = value;
    }

    /**
     * 获取tag7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag7() {
        return tag7;
    }

    /**
     * 设置tag7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag7(String value) {
        this.tag7 = value;
    }

    /**
     * 获取tag8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag8() {
        return tag8;
    }

    /**
     * 设置tag8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag8(String value) {
        this.tag8 = value;
    }

    /**
     * 获取tag9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag9() {
        return tag9;
    }

    /**
     * 设置tag9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag9(String value) {
        this.tag9 = value;
    }

    /**
     * 获取tag10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag10() {
        return tag10;
    }

    /**
     * 设置tag10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag10(String value) {
        this.tag10 = value;
    }

    /**
     * 获取tag11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag11() {
        return tag11;
    }

    /**
     * 设置tag11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag11(String value) {
        this.tag11 = value;
    }

    /**
     * 获取tag12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag12() {
        return tag12;
    }

    /**
     * 设置tag12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag12(String value) {
        this.tag12 = value;
    }

    /**
     * 获取tag13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag13() {
        return tag13;
    }

    /**
     * 设置tag13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag13(String value) {
        this.tag13 = value;
    }

    /**
     * 获取tag14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag14() {
        return tag14;
    }

    /**
     * 设置tag14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag14(String value) {
        this.tag14 = value;
    }

    /**
     * 获取tag15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag15() {
        return tag15;
    }

    /**
     * 设置tag15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag15(String value) {
        this.tag15 = value;
    }

    /**
     * 获取tag16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag16() {
        return tag16;
    }

    /**
     * 设置tag16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag16(String value) {
        this.tag16 = value;
    }

    /**
     * 获取tag17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag17() {
        return tag17;
    }

    /**
     * 设置tag17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag17(String value) {
        this.tag17 = value;
    }

    /**
     * 获取tag18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag18() {
        return tag18;
    }

    /**
     * 设置tag18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag18(String value) {
        this.tag18 = value;
    }

}
