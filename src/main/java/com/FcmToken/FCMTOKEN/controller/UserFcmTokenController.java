package com.FcmToken.FCMTOKEN.controller;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import com.FcmToken.FCMTOKEN.service.UserFcmTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserFcmTokenController {



    @Autowired
    UserFcmTokenService userFcmTokenService;

    //save the FCM
    @PostMapping(path = "/saveFcm")
    public ResponseEntity<?> saveFCM(@RequestBody UserFcmToken users )  {
        return userFcmTokenService.saveFcmForUser(users);
    }


    //get the fcm
    @GetMapping(path = "/getFcmByMail")
    public ResponseEntity<?> getFCM_ByEmail(String email){
        return userFcmTokenService.getFcmByEmail(email);
    }



}
