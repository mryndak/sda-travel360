package pl.sda.travel360.controller.request;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CreateUserRequest {

    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @Size(min = 8, max = 32)
    private String password;

    @Email
    private String email;

    @Pattern(regexp = "(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
    private String phoneNumber;

}
