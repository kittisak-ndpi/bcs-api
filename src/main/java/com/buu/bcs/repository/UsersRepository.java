package com.buu.bcs.repository;

import com.buu.bcs.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, String> {

    Optional<UsersEntity> findByUsernameAndPassword(String username, String password);

    @Query("SELECT userEN FROM UsersEntity userEN " +
            "WHERE userEN.username = :username " +
            "AND userEN.password = :password")
    Optional<UsersEntity> login(String username, String password);



}
