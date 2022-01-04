package com.solvd.parsers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class mySaxHandler extends DefaultHandler {

    static DateFormat dateFormat= new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String content;


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content=new String(ch,start,length);
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if("name".equals(qName)){
            System.out.println ("Name:" + content);
        }else if("gender".equals(qName)){
            System.out.println ("Gender:" + content);
        }else if("dateofadmission".equals(qName)){
            System.out.println ("Date of admission:" + content);
            System.out.println(" ");
        }

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if("employee".equals(qName)){
            System.out.println ("Find a Nationality. Nationality: " + attributes.getValue ("Nationality") + ".");
        }

    }
}
