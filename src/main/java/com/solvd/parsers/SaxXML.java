package com.solvd.parsers;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class SaxXML {
    public static void main(String[] args) {


        File xmlFile=new File("C:\\Users\\alegr\\IdeaProjects\\Diego Alegre\\BuildingCompany\\src\\main\\resources\\my.xml");
        SAXParserFactory  factory=SAXParserFactory.newInstance();
        try {
            SAXParser parser=factory.newSAXParser();
            parser.parse(xmlFile, new mySaxHandler());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
