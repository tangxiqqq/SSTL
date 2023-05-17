
package com.sstl.webservices.SatisfactionOperate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="LmTeSatisfaction" type="{http://tempuri.org/}LmTeSatisfaction" minOccurs="0"/>
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
    "lmTeSatisfaction"
})
@XmlRootElement(name = "Submit")
public class Submit {

    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "LmTeSatisfaction")
    protected LmTeSatisfaction lmTeSatisfaction;

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
     * 获取lmTeSatisfaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LmTeSatisfaction }
     *     
     */
    public LmTeSatisfaction getLmTeSatisfaction() {
        return lmTeSatisfaction;
    }

    /**
     * 设置lmTeSatisfaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LmTeSatisfaction }
     *     
     */
    public void setLmTeSatisfaction(LmTeSatisfaction value) {
        this.lmTeSatisfaction = value;
    }

}
