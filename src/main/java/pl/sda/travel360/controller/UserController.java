package pl.sda.travel360.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.sda.travel360.controller.request.CreateUserRequest;
import pl.sda.travel360.controller.response.GetUserDetails;
import pl.sda.travel360.dto.UserDTO;
import pl.sda.travel360.service.UserService;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public void createUser(@Valid @RequestBody CreateUserRequest request) {
        log.info("Create user for request: {}", request);
        userService.addUser(null); // userDTO

    }

    @GetMapping
    @RolesAllowed("ADMIN")
    public ResponseEntity<List<UserDTO>> getUsers() {
        var users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetUserDetails> getUserDetails(@PathVariable Long id) {
        var user = userService.getUser(id);
        return user.map(userDTO -> ResponseEntity.ok(new GetUserDetails(userDTO)))
                .orElseGet(() -> ResponseEntity.unprocessableEntity().build());
    }
}
