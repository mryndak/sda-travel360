package pl.sda.travel360.mapper;

import org.springframework.stereotype.Service;
import pl.sda.travel360.domain.User;
import pl.sda.travel360.dto.UserDTO;

@Service
public class UserMapper {
    public UserDTO mapToDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .build();
    }
}
