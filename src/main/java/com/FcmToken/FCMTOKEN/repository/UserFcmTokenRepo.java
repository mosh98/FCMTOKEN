package com.FcmToken.FCMTOKEN.repository;

import com.FcmToken.FCMTOKEN.model.UserFcmToken;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserFcmTokenRepo extends JpaRepository<UserFcmToken, Integer> {

    Optional<?> getByEmail(String email);
    Optional<?> getByUsername(String username);

    Optional<?> deleteByUsername(String ss);
   // void deleteByUsername(String username);
    Optional<?> removeByUsername(String username);






}
