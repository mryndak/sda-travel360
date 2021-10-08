package pl.sda.travel360.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.travel360.dto.UserDTO;
import pl.sda.travel360.exception.UserAlreadyExistException;
import pl.sda.travel360.mapper.UserMapper;
import pl.sda.travel360.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public void addUser(UserDTO userDTO) {

        var passwordHash = passwordEncoder.encode(userDTO.getPassword());


        var isUserExist = userRepository.existsByLoginOrEmail(userDTO.getLogin(), userDTO.getEmail());
        if(isUserExist) {
            throw new UserAlreadyExistException();
        }
        //



    }

    public Optional<UserDTO> getUser(Long userId) {
        return userRepository.findById(userId)
                .map(userMapper::mapToDTO);
    }

    public boolean checkExistUser(String login, String email) {
        return userRepository.existsByLoginOrEmail(login, email);
    }

    public List<UserDTO> findAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapToDTO)
                .collect(Collectors.toList());
    }
}
