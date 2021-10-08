package pl.sda.travel360.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDTO {

    private Long id;
    private String login;
    private String password;
    private String fistName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private boolean confirmEmail;
}
