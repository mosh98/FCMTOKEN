package com.FcmToken.FCMTOKEN.service;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import com.FcmToken.FCMTOKEN.repository.UserFcmTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserFcmTokenService {


    @Autowired
    UserFcmTokenRepo userFcmTokenRepo;



    public ResponseEntity<?> getFcmByUsername(String username){
        //if the token is expired??
        return ResponseEntity.ok(userFcmTokenRepo.getByUsername(username));
    }

    public ResponseEntity<?> getFcmByEmail(String email){

        //if the token is expired??

        return ResponseEntity.ok(userFcmTokenRepo.getByEmail(email));
    }
///

    public ResponseEntity<?> saveFcmForUser(UserFcmToken userFcmToken){
       /*if(userFcmTokenRepo.existsByUsernameOrEmail(userFcmToken.getEmail()) == true ||userFcmTokenRepo.existsByUsernameOrEmail(userFcmToken.getUsername()) == true){
           userFcmTokenRepo.deleteByUsernameOrEmail(userFcmToken.getUsername());
       }*/
        return ResponseEntity.ok(userFcmTokenRepo.save(userFcmToken));
    }

    public ResponseEntity<?> updateFcmUser(UserFcmToken userFcmToken){
       // if(userFcmTokenRepo.existsByUsernameOrEmail(userFcmToken.getUsername()) != true ){ userFcmTokenRepo.deleteByUsernameOrEmail(userFcmToken.getEmail()); }
      return ResponseEntity.ok(userFcmTokenRepo.save(userFcmToken));
    }

}
