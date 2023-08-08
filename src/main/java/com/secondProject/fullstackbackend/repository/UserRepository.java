package com.secondProject.fullstackbackend.repository;

import com.secondProject.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {

}
