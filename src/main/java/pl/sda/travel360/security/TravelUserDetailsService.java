package pl.sda.travel360.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.sda.travel360.repository.UserRepository;

@RequiredArgsConstructor
public class TravelUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByLogin(username)
                .map(TravelUserDetails::new)         // niezgadza sie typ user <-> userdetails, dorobienie klasy
                .orElseThrow(() -> new UsernameNotFoundException(username));


    }
}
