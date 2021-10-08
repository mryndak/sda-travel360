package pl.sda.travel360.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.travel360.dto.UserDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserDetails {

    private UserDTO user;

}
