package me.fazilahamedk.xml2pojo;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import me.fazilahamedk.xml2pojo.model.Company;

public class XML2POJOApplication
{
	public static void main(String[] args) throws IOException
	{
		URL xmlFileAsInputStream = XML2POJOApplication.class.getClassLoader().getResource("ProjectObjectModel.xml");

		Company company = new XmlMapper().readValue(xmlFileAsInputStream, Company.class);

		System.out.println(company);
	}
}