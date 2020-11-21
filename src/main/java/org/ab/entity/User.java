package org.ab.entity;

import lombok.*;
import org.ab.enums.Gender;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phone;
    private String password;
    private boolean enabled;
    private Gender gender;
    private Role role;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId,
                String firstName, String lastName, String userName, String email, String phone, String password,
                boolean enabled, Gender gender, Role role) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.enabled = enabled;
        this.gender = gender;
        this.role = role;
    }
}
