
package com.sstl.webservices.ProjectService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectstatus" type="{http://tempuri.org/}PrjStatus"/>
 *         &lt;element name="Describe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "account",
    "password",
    "projectId",
    "projectCode",
    "projectstatus",
    "describe"
})
@XmlRootElement(name = "ProjectStatusChange")
public class ProjectStatusChange {

    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "ProjectId")
    protected int projectId;
    @XmlElement(name = "ProjectCode")
    protected String projectCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrjStatus projectstatus;
    @XmlElement(name = "Describe")
    protected String describe;

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取projectId属性的值。
     * 
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * 设置projectId属性的值。
     * 
     */
    public void setProjectId(int value) {
        this.projectId = value;
    }

    /**
     * 获取projectCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置projectCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * 获取projectstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrjStatus }
     *     
     */
    public PrjStatus getProjectstatus() {
        return projectstatus;
    }

    /**
     * 设置projectstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrjStatus }
     *     
     */
    public void setProjectstatus(PrjStatus value) {
        this.projectstatus = value;
    }

    /**
     * 获取describe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置describe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe(String value) {
        this.describe = value;
    }

}
