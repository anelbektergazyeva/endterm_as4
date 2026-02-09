package com.example.Class.Enrollment.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String course;
}
