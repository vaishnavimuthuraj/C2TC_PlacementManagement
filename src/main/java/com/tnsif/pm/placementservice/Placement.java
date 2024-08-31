package com.tnsif.pm.placementservice;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Placement
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;

//Column(name="companyName")
private String companyName;
//Column(name="JobTitle")
private String jobTitle;
//Column(name="PlacementDate")
private LocalDate placementDate;
//Column(name="StudentId")
private Long studentId;


public Placement()
{


}
public Placement(Long id, String companyName, String jobTitle, LocalDate placementDate, Long studentId)
{
this.id = id;
this.companyName = companyName;
this.jobTitle = jobTitle;
this.placementDate = placementDate;
this.studentId = studentId;
}

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getCompanyName() {
return companyName;
}

public void setCompanyName(String companyName) {
this.companyName = companyName;
}

public String getJobTitle() {
return jobTitle;
}

public void setJobTitle(String jobTitle) {
this.jobTitle = jobTitle;
}

public LocalDate getPlacementDate() {
return placementDate;
}

public void setPlacementDate(LocalDate placementDate) {
this.placementDate = placementDate;
}

public Long getStudentId() {
return studentId;
}

public void setStudentId(Long studentId) {
this.studentId = studentId;
}



}