package io.CollegeManagementSystem.springbootstarter.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "Token")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TokenRegistrationDTO {
    @Id

    private int id;
    private String token;


}
