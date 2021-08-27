package me.fazilahamedk.xml2pojo;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import me.fazilahamedk.xml2pojo.model.Company;

public class XML2POJOApplication {
    public static void main(String[] args) throws IOException {
        URL xmlFileAsInputStream = XML2POJOApplication.class.getClassLoader().getResource("Company.xml");

        Company company = new XmlMapper()
                .registerModule(new JavaTimeModule())
                .readValue(xmlFileAsInputStream, Company.class);

        System.out.println(company);
    }
}