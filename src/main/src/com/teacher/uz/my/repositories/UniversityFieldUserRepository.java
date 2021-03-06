package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.UniversityField;
import com.teacher.uz.my.domains.UniversityFieldUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityFieldUserRepository extends JpaRepository<UniversityFieldUser,Long> {
    public UniversityFieldUser findUniversityFieldUserByUserId(Long id);
}
