//package pl.sda.travel360.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableGlobalMethodSecurity(securedEnabled = true) // włączenie roli
//public class SecurityConfigPart1 extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .mvcMatchers("/v1/country/**").permitAll()
//                .mvcMatchers("/v1/user/**").authenticated()
//                .anyRequest().permitAll()
//            .and()
//                .httpBasic()
//            .and()
//                    .csrf().disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("mateusz")
//                .password("{noop}zaq12wsx") // {noop} - nic nie hashuje hasła, może być np. bcrypt, argon2
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password("{noop}admin123")
//                .roles("ADMIN");
//    }
//}
