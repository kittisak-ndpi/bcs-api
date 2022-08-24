package com.buu.bcs.repository;

import com.buu.bcs.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, String> {

    Optional<UsersEntity> findByUsernameAndPassword(String username, String password);
}
