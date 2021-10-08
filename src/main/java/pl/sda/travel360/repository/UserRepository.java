package pl.sda.travel360.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.travel360.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByLoginOrEmail(String login, String email);

    Optional<User> findByLogin(String login);
}
