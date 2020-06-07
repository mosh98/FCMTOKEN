package com.FcmToken.FCMTOKEN.service;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import com.FcmToken.FCMTOKEN.repository.UserFcmTokenRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class UserFcmTokenServiceTest {


    @Autowired
    UserFcmTokenService userFcmTokenService;

    @Autowired
    UserFcmTokenRepo userFcmTokenRepo;

    UserFcmToken fcmTokenObject = new UserFcmToken();

    @BeforeEach
    void setUp() {
        fcmTokenObject.setEmail("testMall@gmail.com");
        fcmTokenObject.setUsername("testUsername");
        fcmTokenObject.setFcmToken("testFCM_TOKEN");
    }

    //create
    @Test
    void test_createUser(){
        userFcmTokenService.saveFcmForUser(fcmTokenObject);
        Optional<?> usrFromRepo = userFcmTokenRepo.getByUsername(fcmTokenObject.getUsername());
       assertEquals(usrFromRepo.get().toString(), fcmTokenObject.toString());
    }

    //read
    @Test
    void test_readUser(){
        ResponseEntity<?> response = userFcmTokenService.getFcmByUsername(fcmTokenObject.getUsername());
        System.out.println(response.getBody());

        String s = fcmTokenObject.getUsername();
        assertEquals(true, response.toString().contains(s));
    }

    //update

    //delete
    @Test
    void test_deleteUserFcm(){

         userFcmTokenService.deleteUser(fcmTokenObject);

       assertEquals(true , userFcmTokenService.getFcmByUsername(fcmTokenObject.getUsername()).toString().contains("empty"));
    }

}