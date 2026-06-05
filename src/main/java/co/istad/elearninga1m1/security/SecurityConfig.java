package co.istad.elearninga1m1.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authorization.AuthoritiesAuthorizationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.http.HttpMethod.GET;

@Configurable
public class SecurityConfig {
    @Bean
    public SecurityFilterChain apiSecurity(HttpSecurity http){
        http.oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));
        http.authorizeHttpRequests(endPoint -> endPoint
                .requestMatchers("/v3/api-docs/**",
                        "/swagger-ui/**",
                        "swagger-ui.html").permitAll()
                .requestMatchers(HttpMethod.GET,"/api/v1/category/**").permitAll()
                .anyRequest().authenticated());
        http.sessionManagement(state -> state
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.csrf(AbstractHttpConfigurer::disable);
        http.formLogin(AbstractHttpConfigurer::disable);

        return http.build();

    }
}
