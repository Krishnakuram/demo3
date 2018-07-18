//package com.example.demo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.session.HttpSessionEventPublisher;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    public SecurityConfig() {
//        super();
//    }
//
//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                .withUser("user1").password("user1Pass").roles("USER")
//                .and()
//                .withUser("admin1").password("admin1Pass").roles("ADMIN");
//
//    }
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/anonymous*").anonymous()
//                .antMatchers("/login*").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login.html")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/home")
//                .and()
//                .logout().deleteCookies("JSESSIONID")
//                .and()
//                .sessionManagement()
//                .sessionFixation().migrateSession()
//                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .invalidSessionUrl("/invalidSession.html")
//                .maximumSessions(2)
//                .expiredUrl("/sessionExpired.html");
//    }
//    @Bean
//    public HttpSessionEventPublisher httpSessionEventPublisher() {
//        return new HttpSessionEventPublisher();
//    }
//}