package org.ab.model;

import lombok.*;
import org.ab.enums.Gender;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String passwordConfirm;
    private Gender gender;
    private String role;
}
