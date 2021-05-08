package io.CollegeManagementSystem.springbootstarter.model;
import lombok.*;
import javax.persistence.Embeddable;

@Embeddable
@Setter
@Getter

public class addressEntity {
private String vill;
private long pincode;
}
