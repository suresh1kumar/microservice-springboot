package com.springboot.registration.app.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("suraj")
                && password.equalsIgnoreCase("suraj@12345");
    }

}