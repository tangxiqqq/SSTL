
package com.sstl.webservices.ProjectService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Project complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplyVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGetFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GetReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SoftwareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareEnglishName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Developer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SourceIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareTypeIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareTypeOther1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareTypeOther2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareTypeOther3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareTypeOther4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DevelopTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Architecture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchitectureOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientMarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientCPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientMemory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientHardisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientBroswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientOtherSoftware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerMarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerCPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerMemory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerHardisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerMiddleware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerOtherSoftware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnviromentOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestingTypeIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestingTypeOther1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestingTypeOther2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialRequirementsDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialRequirementsOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ConfirmDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyEnglishName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LMPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LMTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LMMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LMEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsUserCount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsUser1Pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsUserCount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsUser2Pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsUserCount3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsUser3Pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsProDescCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsProDescPages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsTechCount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsTech1Pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsTechCount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsTech2Pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsTestReqCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsTestReqPages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsOtherCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocsOtherPages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiskCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiskSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiskOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyUscCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "applyVersion",
    "isGetFree",
    "invoiceState",
    "getReport",
    "id",
    "code",
    "productCode",
    "acceptNumber",
    "customerID",
    "softwareName",
    "softwareShortName",
    "softwareEnglishName",
    "version",
    "clients",
    "developer",
    "expValue",
    "sourceIDs",
    "sourceOther",
    "softwareTypeIDs",
    "softwareTypeOther1",
    "softwareTypeOther2",
    "softwareTypeOther3",
    "softwareTypeOther4",
    "scale",
    "developTool",
    "architecture",
    "architectureOther",
    "clientMarker",
    "clientCPU",
    "clientMemory",
    "clientHardisk",
    "clientOther",
    "clientOP",
    "clientBroswer",
    "clientOtherSoftware",
    "serverMarker",
    "serverCPU",
    "serverMemory",
    "serverHardisk",
    "serverOther",
    "serverOP",
    "serverDB",
    "serverMiddleware",
    "serverOtherSoftware",
    "network",
    "enviromentOther",
    "description",
    "features",
    "testingTypeIDs",
    "testingTypeOther1",
    "testingTypeOther2",
    "specialRequirements",
    "specialRequirementsDT",
    "specialRequirementsOther",
    "applyDT",
    "confirmDT",
    "status",
    "companyCode",
    "companyName",
    "companyEnglishName",
    "address",
    "zipCode",
    "fax",
    "linkMan",
    "lmCode",
    "lmPosition",
    "lmTel",
    "lmMobile",
    "lmEmail",
    "url",
    "chargeMan",
    "cmCode",
    "cmMobile",
    "cmEmail",
    "cmTel",
    "cmPosition",
    "confirmMessage",
    "docsUserCount1",
    "docsUser1Pages",
    "docsUserCount2",
    "docsUser2Pages",
    "docsUserCount3",
    "docsUser3Pages",
    "docsProDescCount",
    "docsProDescPages",
    "docsTechCount1",
    "docsTech1Pages",
    "docsTechCount2",
    "docsTech2Pages",
    "docsTestReqCount",
    "docsTestReqPages",
    "docsOther",
    "docsOtherCount",
    "docsOtherPages",
    "diskCount",
    "diskSpace",
    "diskOther",
    "companyUscCode",
    "softwareCompanyName"
})
public class Project {

    @XmlElement(name = "ApplyVersion")
    protected String applyVersion;
    @XmlElement(name = "IsGetFree")
    protected String isGetFree;
    @XmlElement(name = "InvoiceState")
    protected String invoiceState;
    @XmlElement(name = "GetReport")
    protected String getReport;
    @XmlElement(name = "ID", required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "AcceptNumber")
    protected String acceptNumber;
    @XmlElement(name = "CustomerID", required = true, type = Integer.class, nillable = true)
    protected Integer customerID;
    @XmlElement(name = "SoftwareName")
    protected String softwareName;
    @XmlElement(name = "SoftwareShortName")
    protected String softwareShortName;
    @XmlElement(name = "SoftwareEnglishName")
    protected String softwareEnglishName;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Clients")
    protected String clients;
    @XmlElement(name = "Developer")
    protected String developer;
    @XmlElement(name = "ExpValue", required = true, type = Double.class, nillable = true)
    protected Double expValue;
    @XmlElement(name = "SourceIDs")
    protected String sourceIDs;
    @XmlElement(name = "SourceOther")
    protected String sourceOther;
    @XmlElement(name = "SoftwareTypeIDs")
    protected String softwareTypeIDs;
    @XmlElement(name = "SoftwareTypeOther1")
    protected String softwareTypeOther1;
    @XmlElement(name = "SoftwareTypeOther2")
    protected String softwareTypeOther2;
    @XmlElement(name = "SoftwareTypeOther3")
    protected String softwareTypeOther3;
    @XmlElement(name = "SoftwareTypeOther4")
    protected String softwareTypeOther4;
    @XmlElement(name = "Scale", required = true, type = Integer.class, nillable = true)
    protected Integer scale;
    @XmlElement(name = "DevelopTool")
    protected String developTool;
    @XmlElement(name = "Architecture")
    protected String architecture;
    @XmlElement(name = "ArchitectureOther")
    protected String architectureOther;
    @XmlElement(name = "ClientMarker")
    protected String clientMarker;
    @XmlElement(name = "ClientCPU")
    protected String clientCPU;
    @XmlElement(name = "ClientMemory")
    protected String clientMemory;
    @XmlElement(name = "ClientHardisk")
    protected String clientHardisk;
    @XmlElement(name = "ClientOther")
    protected String clientOther;
    @XmlElement(name = "ClientOP")
    protected String clientOP;
    @XmlElement(name = "ClientBroswer")
    protected String clientBroswer;
    @XmlElement(name = "ClientOtherSoftware")
    protected String clientOtherSoftware;
    @XmlElement(name = "ServerMarker")
    protected String serverMarker;
    @XmlElement(name = "ServerCPU")
    protected String serverCPU;
    @XmlElement(name = "ServerMemory")
    protected String serverMemory;
    @XmlElement(name = "ServerHardisk")
    protected String serverHardisk;
    @XmlElement(name = "ServerOther")
    protected String serverOther;
    @XmlElement(name = "ServerOP")
    protected String serverOP;
    @XmlElement(name = "ServerDB")
    protected String serverDB;
    @XmlElement(name = "ServerMiddleware")
    protected String serverMiddleware;
    @XmlElement(name = "ServerOtherSoftware")
    protected String serverOtherSoftware;
    @XmlElement(name = "Network")
    protected String network;
    @XmlElement(name = "EnviromentOther")
    protected String enviromentOther;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Features")
    protected String features;
    @XmlElement(name = "TestingTypeIDs")
    protected String testingTypeIDs;
    @XmlElement(name = "TestingTypeOther1")
    protected String testingTypeOther1;
    @XmlElement(name = "TestingTypeOther2")
    protected String testingTypeOther2;
    @XmlElement(name = "SpecialRequirements")
    protected String specialRequirements;
    @XmlElement(name = "SpecialRequirementsDT")
    protected String specialRequirementsDT;
    @XmlElement(name = "SpecialRequirementsOther")
    protected String specialRequirementsOther;
    @XmlElement(name = "ApplyDT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDT;
    @XmlElement(name = "ConfirmDT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmDT;
    @XmlElement(name = "Status", required = true, type = Integer.class, nillable = true)
    protected Integer status;
    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "CompanyEnglishName")
    protected String companyEnglishName;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "LinkMan")
    protected String linkMan;
    @XmlElement(name = "LMCode")
    protected String lmCode;
    @XmlElement(name = "LMPosition")
    protected String lmPosition;
    @XmlElement(name = "LMTel")
    protected String lmTel;
    @XmlElement(name = "LMMobile")
    protected String lmMobile;
    @XmlElement(name = "LMEmail")
    protected String lmEmail;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "ChargeMan")
    protected String chargeMan;
    @XmlElement(name = "CMCode")
    protected String cmCode;
    @XmlElement(name = "CMMobile")
    protected String cmMobile;
    @XmlElement(name = "CMEmail")
    protected String cmEmail;
    @XmlElement(name = "CMTel")
    protected String cmTel;
    @XmlElement(name = "CMPosition")
    protected String cmPosition;
    @XmlElement(name = "ConfirmMessage")
    protected String confirmMessage;
    @XmlElement(name = "DocsUserCount1")
    protected String docsUserCount1;
    @XmlElement(name = "DocsUser1Pages")
    protected String docsUser1Pages;
    @XmlElement(name = "DocsUserCount2")
    protected String docsUserCount2;
    @XmlElement(name = "DocsUser2Pages")
    protected String docsUser2Pages;
    @XmlElement(name = "DocsUserCount3")
    protected String docsUserCount3;
    @XmlElement(name = "DocsUser3Pages")
    protected String docsUser3Pages;
    @XmlElement(name = "DocsProDescCount")
    protected String docsProDescCount;
    @XmlElement(name = "DocsProDescPages")
    protected String docsProDescPages;
    @XmlElement(name = "DocsTechCount1")
    protected String docsTechCount1;
    @XmlElement(name = "DocsTech1Pages")
    protected String docsTech1Pages;
    @XmlElement(name = "DocsTechCount2")
    protected String docsTechCount2;
    @XmlElement(name = "DocsTech2Pages")
    protected String docsTech2Pages;
    @XmlElement(name = "DocsTestReqCount")
    protected String docsTestReqCount;
    @XmlElement(name = "DocsTestReqPages")
    protected String docsTestReqPages;
    @XmlElement(name = "DocsOther")
    protected String docsOther;
    @XmlElement(name = "DocsOtherCount")
    protected String docsOtherCount;
    @XmlElement(name = "DocsOtherPages")
    protected String docsOtherPages;
    @XmlElement(name = "DiskCount")
    protected String diskCount;
    @XmlElement(name = "DiskSpace")
    protected String diskSpace;
    @XmlElement(name = "DiskOther")
    protected String diskOther;
    @XmlElement(name = "CompanyUscCode")
    protected String companyUscCode;
    @XmlElement(name = "SoftwareCompanyName")
    protected String softwareCompanyName;

    /**
     * 获取applyVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyVersion() {
        return applyVersion;
    }

    /**
     * 设置applyVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyVersion(String value) {
        this.applyVersion = value;
    }

    /**
     * 获取isGetFree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGetFree() {
        return isGetFree;
    }

    /**
     * 设置isGetFree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGetFree(String value) {
        this.isGetFree = value;
    }

    /**
     * 获取invoiceState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceState() {
        return invoiceState;
    }

    /**
     * 设置invoiceState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceState(String value) {
        this.invoiceState = value;
    }

    /**
     * 获取getReport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReport() {
        return getReport;
    }

    /**
     * 设置getReport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReport(String value) {
        this.getReport = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
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
     * 获取productCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置productCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * 获取acceptNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptNumber() {
        return acceptNumber;
    }

    /**
     * 设置acceptNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptNumber(String value) {
        this.acceptNumber = value;
    }

    /**
     * 获取customerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerID() {
        return customerID;
    }

    /**
     * 设置customerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerID(Integer value) {
        this.customerID = value;
    }

    /**
     * 获取softwareName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareName() {
        return softwareName;
    }

    /**
     * 设置softwareName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareName(String value) {
        this.softwareName = value;
    }

    /**
     * 获取softwareShortName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareShortName() {
        return softwareShortName;
    }

    /**
     * 设置softwareShortName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareShortName(String value) {
        this.softwareShortName = value;
    }

    /**
     * 获取softwareEnglishName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareEnglishName() {
        return softwareEnglishName;
    }

    /**
     * 设置softwareEnglishName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareEnglishName(String value) {
        this.softwareEnglishName = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取clients属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClients() {
        return clients;
    }

    /**
     * 设置clients属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClients(String value) {
        this.clients = value;
    }

    /**
     * 获取developer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * 设置developer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloper(String value) {
        this.developer = value;
    }

    /**
     * 获取expValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpValue() {
        return expValue;
    }

    /**
     * 设置expValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpValue(Double value) {
        this.expValue = value;
    }

    /**
     * 获取sourceIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIDs() {
        return sourceIDs;
    }

    /**
     * 设置sourceIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIDs(String value) {
        this.sourceIDs = value;
    }

    /**
     * 获取sourceOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOther() {
        return sourceOther;
    }

    /**
     * 设置sourceOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOther(String value) {
        this.sourceOther = value;
    }

    /**
     * 获取softwareTypeIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareTypeIDs() {
        return softwareTypeIDs;
    }

    /**
     * 设置softwareTypeIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareTypeIDs(String value) {
        this.softwareTypeIDs = value;
    }

    /**
     * 获取softwareTypeOther1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareTypeOther1() {
        return softwareTypeOther1;
    }

    /**
     * 设置softwareTypeOther1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareTypeOther1(String value) {
        this.softwareTypeOther1 = value;
    }

    /**
     * 获取softwareTypeOther2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareTypeOther2() {
        return softwareTypeOther2;
    }

    /**
     * 设置softwareTypeOther2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareTypeOther2(String value) {
        this.softwareTypeOther2 = value;
    }

    /**
     * 获取softwareTypeOther3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareTypeOther3() {
        return softwareTypeOther3;
    }

    /**
     * 设置softwareTypeOther3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareTypeOther3(String value) {
        this.softwareTypeOther3 = value;
    }

    /**
     * 获取softwareTypeOther4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareTypeOther4() {
        return softwareTypeOther4;
    }

    /**
     * 设置softwareTypeOther4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareTypeOther4(String value) {
        this.softwareTypeOther4 = value;
    }

    /**
     * 获取scale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * 设置scale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * 获取developTool属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopTool() {
        return developTool;
    }

    /**
     * 设置developTool属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopTool(String value) {
        this.developTool = value;
    }

    /**
     * 获取architecture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * 设置architecture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecture(String value) {
        this.architecture = value;
    }

    /**
     * 获取architectureOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitectureOther() {
        return architectureOther;
    }

    /**
     * 设置architectureOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitectureOther(String value) {
        this.architectureOther = value;
    }

    /**
     * 获取clientMarker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMarker() {
        return clientMarker;
    }

    /**
     * 设置clientMarker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMarker(String value) {
        this.clientMarker = value;
    }

    /**
     * 获取clientCPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCPU() {
        return clientCPU;
    }

    /**
     * 设置clientCPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCPU(String value) {
        this.clientCPU = value;
    }

    /**
     * 获取clientMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMemory() {
        return clientMemory;
    }

    /**
     * 设置clientMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMemory(String value) {
        this.clientMemory = value;
    }

    /**
     * 获取clientHardisk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientHardisk() {
        return clientHardisk;
    }

    /**
     * 设置clientHardisk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientHardisk(String value) {
        this.clientHardisk = value;
    }

    /**
     * 获取clientOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOther() {
        return clientOther;
    }

    /**
     * 设置clientOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOther(String value) {
        this.clientOther = value;
    }

    /**
     * 获取clientOP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOP() {
        return clientOP;
    }

    /**
     * 设置clientOP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOP(String value) {
        this.clientOP = value;
    }

    /**
     * 获取clientBroswer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBroswer() {
        return clientBroswer;
    }

    /**
     * 设置clientBroswer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBroswer(String value) {
        this.clientBroswer = value;
    }

    /**
     * 获取clientOtherSoftware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOtherSoftware() {
        return clientOtherSoftware;
    }

    /**
     * 设置clientOtherSoftware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOtherSoftware(String value) {
        this.clientOtherSoftware = value;
    }

    /**
     * 获取serverMarker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerMarker() {
        return serverMarker;
    }

    /**
     * 设置serverMarker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerMarker(String value) {
        this.serverMarker = value;
    }

    /**
     * 获取serverCPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerCPU() {
        return serverCPU;
    }

    /**
     * 设置serverCPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerCPU(String value) {
        this.serverCPU = value;
    }

    /**
     * 获取serverMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerMemory() {
        return serverMemory;
    }

    /**
     * 设置serverMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerMemory(String value) {
        this.serverMemory = value;
    }

    /**
     * 获取serverHardisk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerHardisk() {
        return serverHardisk;
    }

    /**
     * 设置serverHardisk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerHardisk(String value) {
        this.serverHardisk = value;
    }

    /**
     * 获取serverOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerOther() {
        return serverOther;
    }

    /**
     * 设置serverOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerOther(String value) {
        this.serverOther = value;
    }

    /**
     * 获取serverOP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerOP() {
        return serverOP;
    }

    /**
     * 设置serverOP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerOP(String value) {
        this.serverOP = value;
    }

    /**
     * 获取serverDB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerDB() {
        return serverDB;
    }

    /**
     * 设置serverDB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerDB(String value) {
        this.serverDB = value;
    }

    /**
     * 获取serverMiddleware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerMiddleware() {
        return serverMiddleware;
    }

    /**
     * 设置serverMiddleware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerMiddleware(String value) {
        this.serverMiddleware = value;
    }

    /**
     * 获取serverOtherSoftware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerOtherSoftware() {
        return serverOtherSoftware;
    }

    /**
     * 设置serverOtherSoftware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerOtherSoftware(String value) {
        this.serverOtherSoftware = value;
    }

    /**
     * 获取network属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * 设置network属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * 获取enviromentOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviromentOther() {
        return enviromentOther;
    }

    /**
     * 设置enviromentOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviromentOther(String value) {
        this.enviromentOther = value;
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
     * 获取features属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatures() {
        return features;
    }

    /**
     * 设置features属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatures(String value) {
        this.features = value;
    }

    /**
     * 获取testingTypeIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestingTypeIDs() {
        return testingTypeIDs;
    }

    /**
     * 设置testingTypeIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestingTypeIDs(String value) {
        this.testingTypeIDs = value;
    }

    /**
     * 获取testingTypeOther1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestingTypeOther1() {
        return testingTypeOther1;
    }

    /**
     * 设置testingTypeOther1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestingTypeOther1(String value) {
        this.testingTypeOther1 = value;
    }

    /**
     * 获取testingTypeOther2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestingTypeOther2() {
        return testingTypeOther2;
    }

    /**
     * 设置testingTypeOther2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestingTypeOther2(String value) {
        this.testingTypeOther2 = value;
    }

    /**
     * 获取specialRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirements() {
        return specialRequirements;
    }

    /**
     * 设置specialRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirements(String value) {
        this.specialRequirements = value;
    }

    /**
     * 获取specialRequirementsDT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementsDT() {
        return specialRequirementsDT;
    }

    /**
     * 设置specialRequirementsDT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementsDT(String value) {
        this.specialRequirementsDT = value;
    }

    /**
     * 获取specialRequirementsOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementsOther() {
        return specialRequirementsOther;
    }

    /**
     * 设置specialRequirementsOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementsOther(String value) {
        this.specialRequirementsOther = value;
    }

    /**
     * 获取applyDT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDT() {
        return applyDT;
    }

    /**
     * 设置applyDT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDT(XMLGregorianCalendar value) {
        this.applyDT = value;
    }

    /**
     * 获取confirmDT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmDT() {
        return confirmDT;
    }

    /**
     * 设置confirmDT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmDT(XMLGregorianCalendar value) {
        this.confirmDT = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * 获取companyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置companyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
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
     * 获取companyEnglishName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyEnglishName() {
        return companyEnglishName;
    }

    /**
     * 设置companyEnglishName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyEnglishName(String value) {
        this.companyEnglishName = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取zipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置zipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * 获取linkMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置linkMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMan(String value) {
        this.linkMan = value;
    }

    /**
     * 获取lmCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMCode() {
        return lmCode;
    }

    /**
     * 设置lmCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMCode(String value) {
        this.lmCode = value;
    }

    /**
     * 获取lmPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMPosition() {
        return lmPosition;
    }

    /**
     * 设置lmPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMPosition(String value) {
        this.lmPosition = value;
    }

    /**
     * 获取lmTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMTel() {
        return lmTel;
    }

    /**
     * 设置lmTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMTel(String value) {
        this.lmTel = value;
    }

    /**
     * 获取lmMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMMobile() {
        return lmMobile;
    }

    /**
     * 设置lmMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMMobile(String value) {
        this.lmMobile = value;
    }

    /**
     * 获取lmEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMEmail() {
        return lmEmail;
    }

    /**
     * 设置lmEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMEmail(String value) {
        this.lmEmail = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * 获取chargeMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeMan() {
        return chargeMan;
    }

    /**
     * 设置chargeMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeMan(String value) {
        this.chargeMan = value;
    }

    /**
     * 获取cmCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMCode() {
        return cmCode;
    }

    /**
     * 设置cmCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMCode(String value) {
        this.cmCode = value;
    }

    /**
     * 获取cmMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMobile() {
        return cmMobile;
    }

    /**
     * 设置cmMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMobile(String value) {
        this.cmMobile = value;
    }

    /**
     * 获取cmEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMEmail() {
        return cmEmail;
    }

    /**
     * 设置cmEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMEmail(String value) {
        this.cmEmail = value;
    }

    /**
     * 获取cmTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMTel() {
        return cmTel;
    }

    /**
     * 设置cmTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMTel(String value) {
        this.cmTel = value;
    }

    /**
     * 获取cmPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMPosition() {
        return cmPosition;
    }

    /**
     * 设置cmPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMPosition(String value) {
        this.cmPosition = value;
    }

    /**
     * 获取confirmMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmMessage() {
        return confirmMessage;
    }

    /**
     * 设置confirmMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmMessage(String value) {
        this.confirmMessage = value;
    }

    /**
     * 获取docsUserCount1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsUserCount1() {
        return docsUserCount1;
    }

    /**
     * 设置docsUserCount1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsUserCount1(String value) {
        this.docsUserCount1 = value;
    }

    /**
     * 获取docsUser1Pages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsUser1Pages() {
        return docsUser1Pages;
    }

    /**
     * 设置docsUser1Pages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsUser1Pages(String value) {
        this.docsUser1Pages = value;
    }

    /**
     * 获取docsUserCount2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsUserCount2() {
        return docsUserCount2;
    }

    /**
     * 设置docsUserCount2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsUserCount2(String value) {
        this.docsUserCount2 = value;
    }

    /**
     * 获取docsUser2Pages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsUser2Pages() {
        return docsUser2Pages;
    }

    /**
     * 设置docsUser2Pages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsUser2Pages(String value) {
        this.docsUser2Pages = value;
    }

    /**
     * 获取docsUserCount3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsUserCount3() {
        return docsUserCount3;
    }

    /**
     * 设置docsUserCount3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsUserCount3(String value) {
        this.docsUserCount3 = value;
    }

    /**
     * 获取docsUser3Pages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsUser3Pages() {
        return docsUser3Pages;
    }

    /**
     * 设置docsUser3Pages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsUser3Pages(String value) {
        this.docsUser3Pages = value;
    }

    /**
     * 获取docsProDescCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsProDescCount() {
        return docsProDescCount;
    }

    /**
     * 设置docsProDescCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsProDescCount(String value) {
        this.docsProDescCount = value;
    }

    /**
     * 获取docsProDescPages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsProDescPages() {
        return docsProDescPages;
    }

    /**
     * 设置docsProDescPages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsProDescPages(String value) {
        this.docsProDescPages = value;
    }

    /**
     * 获取docsTechCount1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsTechCount1() {
        return docsTechCount1;
    }

    /**
     * 设置docsTechCount1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsTechCount1(String value) {
        this.docsTechCount1 = value;
    }

    /**
     * 获取docsTech1Pages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsTech1Pages() {
        return docsTech1Pages;
    }

    /**
     * 设置docsTech1Pages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsTech1Pages(String value) {
        this.docsTech1Pages = value;
    }

    /**
     * 获取docsTechCount2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsTechCount2() {
        return docsTechCount2;
    }

    /**
     * 设置docsTechCount2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsTechCount2(String value) {
        this.docsTechCount2 = value;
    }

    /**
     * 获取docsTech2Pages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsTech2Pages() {
        return docsTech2Pages;
    }

    /**
     * 设置docsTech2Pages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsTech2Pages(String value) {
        this.docsTech2Pages = value;
    }

    /**
     * 获取docsTestReqCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsTestReqCount() {
        return docsTestReqCount;
    }

    /**
     * 设置docsTestReqCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsTestReqCount(String value) {
        this.docsTestReqCount = value;
    }

    /**
     * 获取docsTestReqPages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsTestReqPages() {
        return docsTestReqPages;
    }

    /**
     * 设置docsTestReqPages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsTestReqPages(String value) {
        this.docsTestReqPages = value;
    }

    /**
     * 获取docsOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsOther() {
        return docsOther;
    }

    /**
     * 设置docsOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsOther(String value) {
        this.docsOther = value;
    }

    /**
     * 获取docsOtherCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsOtherCount() {
        return docsOtherCount;
    }

    /**
     * 设置docsOtherCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsOtherCount(String value) {
        this.docsOtherCount = value;
    }

    /**
     * 获取docsOtherPages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocsOtherPages() {
        return docsOtherPages;
    }

    /**
     * 设置docsOtherPages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocsOtherPages(String value) {
        this.docsOtherPages = value;
    }

    /**
     * 获取diskCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskCount() {
        return diskCount;
    }

    /**
     * 设置diskCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskCount(String value) {
        this.diskCount = value;
    }

    /**
     * 获取diskSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskSpace() {
        return diskSpace;
    }

    /**
     * 设置diskSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskSpace(String value) {
        this.diskSpace = value;
    }

    /**
     * 获取diskOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskOther() {
        return diskOther;
    }

    /**
     * 设置diskOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskOther(String value) {
        this.diskOther = value;
    }

    /**
     * 获取companyUscCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyUscCode() {
        return companyUscCode;
    }

    /**
     * 设置companyUscCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyUscCode(String value) {
        this.companyUscCode = value;
    }

    /**
     * 获取softwareCompanyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareCompanyName() {
        return softwareCompanyName;
    }

    /**
     * 设置softwareCompanyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareCompanyName(String value) {
        this.softwareCompanyName = value;
    }

}
