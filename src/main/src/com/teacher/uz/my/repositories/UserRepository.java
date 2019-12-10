package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public User getUserByEmail(String email);
    public List<User> findUsersByRole(String role);
}
