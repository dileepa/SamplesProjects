package com.dileepa.domain;

import com.dileepa.validator.Password;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * USER : Dileepa
 * DATE : 5/17/15
 * TIME : 11:53 AM
 */
public class PersonBean
{
    private String username;
    @Password
    private String password;
    @NotEmpty(message = "E-Mail is Mandatory thing.") @Email
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
