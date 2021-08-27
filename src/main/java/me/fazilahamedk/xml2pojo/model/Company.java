package me.fazilahamedk.xml2pojo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Company
{
	private String name;
	private String city;
	private CompanyType type;
	private List<Employee> employees;
}