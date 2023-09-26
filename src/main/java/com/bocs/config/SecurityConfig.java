package com.bocs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeHttpRequests((authorize) -> authorize
//                                .requestMatchers("/**").permitAll()
                                .requestMatchers("/").permitAll()
                                .requestMatchers("/index").permitAll()
                                .requestMatchers("/user/login").permitAll()
                                .requestMatchers("/housekeeping/**").hasRole("housekeeping")
                                .requestMatchers("/frontdesk/**").hasRole("frontdesk")
                                .requestMatchers("/room/**").hasRole("admin")
                                .anyRequest().authenticated()
                )
                .httpBasic(withDefaults());

        http.formLogin();
        //.loginPage("/user/login").loginProcessingUrl("/user/login");
        // http.formLogin(withDefaults());
//        http.formLogin().loginPage("/user/login").usernameParameter("username");
//        http.authorizeRequests()
        // @formatter:on
        http.csrf().disable();
        http.logout().logoutSuccessUrl("/index");
//        http.rememberMe().rememberMeParameter("rememberMe");
        return http.build();
    }

    // @formatter:off
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
        //password is 1234 using CLI TOOL spring encodepassword 1234
        UserDetails user = User.builder()
                .username("leon")
                .password("{bcrypt}$2a$10$J0G0VZS7g6JxAtKhO3han.5uO4uMHy8ESye3Ut5KX5ZJocOjaj19y")
                .roles("admin","housekeeping","frontdesk")
                .build();

        UserDetails user2 = User.builder()
                .username("johnson")
                .password("{bcrypt}$2a$10$J0G0VZS7g6JxAtKhO3han.5uO4uMHy8ESye3Ut5KX5ZJocOjaj19y")
                .roles("housekeeping")
                .build();

        return new InMemoryUserDetailsManager(user, user2);
    }
    // @formatter:on

}
