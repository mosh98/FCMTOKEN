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
    @GetMapping(path = "/getFcmByMail", params = "email")
    public ResponseEntity<?> getFCM_ByEmail(@RequestParam String email){
        return userFcmTokenService.getFcmByEmail(email);
    }

    @GetMapping(path = "/getFcmByUsername", params = "username")
    public ResponseEntity<?> getFCM_ByUsername(@RequestParam String username){

        return userFcmTokenService.getFcmByUsername(username);
    }


    //DeleteBy username
    @PostMapping(path = "/deleteByUsername")
    public ResponseEntity<?> deleteByUsername (@RequestBody UserFcmToken userFcmToken){
        return userFcmTokenService.deleteUser(userFcmToken);
    }


    //Update
    @PostMapping(path = "/updateUser")
    public ResponseEntity<?> updateFCM(@RequestBody UserFcmToken users )  {
        return userFcmTokenService.updateFcmUser(users);
    }


}
