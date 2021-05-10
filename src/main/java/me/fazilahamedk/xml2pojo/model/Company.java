package me.fazilahamedk.xml2pojo.model;

public class Company
{
	private String name;
	private String city;
	private CompanyType type;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public CompanyType getType()
	{
		return type;
	}

	public void setType(CompanyType type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return String.format("Company {name = %s, city = %s, type = %s}", name, city, type);
	}
}