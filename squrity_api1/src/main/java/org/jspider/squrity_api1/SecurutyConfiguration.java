package org.jspider.squrity_api1;



import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
//spring 2.7 security
public class SecurutyConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //for Authentication
       User.UserBuilder user=User.withDefaultPasswordEncoder();
       auth.inMemoryAuthentication()
               .withUser((user.username("omkar").password("123").roles("ADMIN")))
               .withUser((user.username("swap").password("456").roles("EMPLOYEE")));
    }

    //for Authorization

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/employee").hasAnyRole("EMPLOYEE","ADMIN")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }
}
