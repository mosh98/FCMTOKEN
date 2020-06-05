package com.FcmToken.FCMTOKEN.service;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import com.FcmToken.FCMTOKEN.repository.UserFcmTokenRepo;
import org.apache.catalina.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserFcmTokenServiceTest {


    @Autowired
     UserFcmTokenService userFcmTokenService;

    @Autowired
    UserFcmTokenRepo userFcmTokenRepo;

    UserFcmToken userFcmToken;

    @BeforeEach
    void setUp() {
        userFcmToken = new UserFcmToken();
        userFcmToken.setEmail("testMall@gmail.com");
        userFcmToken.setUsername("testUsername");
        userFcmToken.setFcmToken("testFCM_TOKEN");
    }

    //create
   /* @Test
    void test_createUser(){

        userFcmTokenService.saveFcmForUser(userFcmToken);

        Optional<?> usrFromRepo = userFcmTokenRepo.getByUsername(userFcmToken.getUsername());

        assertEquals(usrFromRepo.get().toString(), userFcmToken.toString());
    }*/

    //read


    //update

    //delete


}