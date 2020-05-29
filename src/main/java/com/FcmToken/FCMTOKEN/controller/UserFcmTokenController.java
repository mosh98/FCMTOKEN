package com.FcmToken.FCMTOKEN.controller;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import com.FcmToken.FCMTOKEN.service.UserFcmTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserFcmTokenController {



    @Autowired
    UserFcmTokenService userFcmTokenService;

    //save the FCM
    @PostMapping(path = "/saveFCM")
    public ResponseEntity<?> saveFCM(@RequestBody UserFcmToken users ) throws Exception {
        return userFcmTokenService.saveFcmForUser(users);
    }


    //get the fcm



}
