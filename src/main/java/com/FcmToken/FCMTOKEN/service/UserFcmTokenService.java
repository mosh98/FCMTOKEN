package com.FcmToken.FCMTOKEN.service;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import com.FcmToken.FCMTOKEN.repository.UserFcmTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

    public ResponseEntity<?> saveFcmForUser(UserFcmToken userFcmToken){

        return ResponseEntity.ok(userFcmTokenRepo.save(userFcmToken));
    }

    public ResponseEntity<?> updateFcmUser(UserFcmToken userFcmToken){
        if(userFcmTokenRepo.getByUsername(userFcmToken.getUsername()) != null )
        {
            userFcmTokenRepo.deleteByUsername(userFcmToken.getUsername());
        }
      return ResponseEntity.ok(userFcmTokenRepo.save(userFcmToken));
    }


    @Transactional
    public void deleteUser( UserFcmToken userFcmToken ){


            //userFcmTokenRepo.deleteByUsername(userFcmToken.getUsername());
            //userFcmTokenRepo.delete(userFcmToken);
            userFcmTokenRepo.removeByUsername(userFcmToken.getUsername());
            userFcmTokenRepo.removeByUsername(userFcmToken.getUsername());

    }


}
