package me.fazilahamedk.xml2pojo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.LocalDate;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes
({
    @JsonSubTypes.Type(name = "Regular", value = RegularEmployee.class),
    @JsonSubTypes.Type(name = "Intern", value = Intern.class)
})
public interface Employee
{ }