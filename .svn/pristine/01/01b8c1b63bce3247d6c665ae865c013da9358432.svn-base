
package com.sstl.webservices.ProjectService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PrjStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PrjStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABANDON"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="SUBMITED"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="CLOSE"/>
 *     &lt;enumeration value="CONFIRMED_TWO"/>
 *     &lt;enumeration value="ST_PROJ_CREATE"/>
 *     &lt;enumeration value="ST_PROJ_CHECK"/>
 *     &lt;enumeration value="ST_PROJ_ARRANGEMENT"/>
 *     &lt;enumeration value="ST_PROJ_OUTLINE"/>
 *     &lt;enumeration value="ST_PROJ_OUTLINECHECK"/>
 *     &lt;enumeration value="ST_PROJ_EXECUTE"/>
 *     &lt;enumeration value="ST_PROJ_REPORT"/>
 *     &lt;enumeration value="ST_PROJ_REPORTCHECK"/>
 *     &lt;enumeration value="ST_PROJ_REPORTAPP"/>
 *     &lt;enumeration value="ST_PROJ_REPORTPRINT"/>
 *     &lt;enumeration value="ST_PROJ_REPORTRELEASE"/>
 *     &lt;enumeration value="ST_PROJ_ARCHIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrjStatus")
@XmlEnum
public enum PrjStatus {

    ABANDON,
    NEW,
    SUBMITED,
    CONFIRMED,
    CLOSE,
    CONFIRMED_TWO,
    ST_PROJ_CREATE,
    ST_PROJ_CHECK,
    ST_PROJ_ARRANGEMENT,
    ST_PROJ_OUTLINE,
    ST_PROJ_OUTLINECHECK,
    ST_PROJ_EXECUTE,
    ST_PROJ_REPORT,
    ST_PROJ_REPORTCHECK,
    ST_PROJ_REPORTAPP,
    ST_PROJ_REPORTPRINT,
    ST_PROJ_REPORTRELEASE,
    ST_PROJ_ARCHIVE;

    public String value() {
        return name();
    }

    public static PrjStatus fromValue(String v) {
        return valueOf(v);
    }

}
