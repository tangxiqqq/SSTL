
package com.sstl.webservices.ProjectOperateforWeChat;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfLmTeProject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLmTeProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LmTeProject" type="{http://tempuri.org/}LmTeProject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLmTeProject", propOrder = {
    "lmTeProject"
})
public class ArrayOfLmTeProject {

    @XmlElement(name = "LmTeProject", nillable = true)
    protected List<LmTeProject> lmTeProject;

    /**
     * Gets the value of the lmTeProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lmTeProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLmTeProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LmTeProject }
     * 
     * 
     */
    public List<LmTeProject> getLmTeProject() {
        if (lmTeProject == null) {
            lmTeProject = new ArrayList<LmTeProject>();
        }
        return this.lmTeProject;
    }

}
