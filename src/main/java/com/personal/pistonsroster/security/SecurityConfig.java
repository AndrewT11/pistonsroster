package com.personal.pistonsroster.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    // add support for JDBC

    @Bean
    public UserDetailsManager userDetailsManager(DataSource datasource) {

        // If using username/authority tables by default:
        // return new JdbcUserDetailsManager(dataSource);

        // custom tables method
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(datasource);

        // define query to retrieve a user by username
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select user_id, pw, active from members where user_id=?"
        );

        // define query to retrieve the authorities/roles by username
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "select user_id, role from roles where user_id=?"
        );

        return jdbcUserDetailsManager;
    }

    // .hasAnyRole(comma delimited roles)
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET,"/players").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET,"/players/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST,"/players").hasRole("MANAGER")
                        // Will need to change wildcard for PUT depending on if using starter-data-rest or not
                        .requestMatchers(HttpMethod.PUT,"/players/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE,"/players/**").hasRole("ADMIN")
        );
        // use HTTP basic authentication
        http.httpBasic(Customizer.withDefaults());

        // disable Cross Site Request Forgery (CSRF)
        // is general, not required for stateless REST APIs that use POST, PUT, DELETE, and/or PATCH
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
