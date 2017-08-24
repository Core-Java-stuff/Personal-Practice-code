package com.sjgm.question;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class UtilDateConvertor {
	private static XMLGregorianCalendar getXMLGregorianCalendar() {
		XMLGregorianCalendar xmlDate = null;
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());

		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xmlDate;
	}

	public static void main(String[] args) throws ParseException {

		XMLGregorianCalendar xmlDate = getXMLGregorianCalendar();
		Date date = xmlDate.toGregorianCalendar().getTime();
		DateFormat  formatter = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate  = formatter.format(date);
		Date d=formatter.parse(formattedDate);
		System.out.println("DB :"+new java.sql.Date(d.getTime()));
		System.out.println("java.util.date :- " + formattedDate);
		
	}
	


}
