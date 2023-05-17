package com.sstl.util;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SSTLUtils {

    public XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gc;
    }

    /**
     * XMLGregorianCalendar 转Date
     *
     * @param cal
     * @return
     */
    public Date convertToDate(XMLGregorianCalendar cal) {
        GregorianCalendar ca = null;
        if (cal != null && cal.toGregorianCalendar() != null) {
            ca = cal.toGregorianCalendar();
            return ca.getTime();
        }
        return null;
    }
}
