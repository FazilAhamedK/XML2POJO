package me.fazilahamedk.xml2pojo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Intern implements Employee
{
    @JacksonXmlProperty(isAttribute = true, localName = "type")
    private String employmentType;
    private String name;

    @JsonFormat(pattern = "dd-MMM-yyyy")
    private LocalDate dateOfJoining;

    private InternshipType internshipType;
}