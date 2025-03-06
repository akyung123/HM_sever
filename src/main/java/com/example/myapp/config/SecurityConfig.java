package com.example.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/users/signup", "/users/login").permitAll()  // 회원가입, 로그인은 인증 없이 접근 가능
                .anyRequest().authenticated()  // 나머지 요청은 인증 필요
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll();
    }
}

