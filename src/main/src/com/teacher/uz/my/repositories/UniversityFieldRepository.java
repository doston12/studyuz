package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.University;
import com.teacher.uz.my.domains.UniversityField;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityFieldRepository extends JpaRepository<UniversityField, Long> {
    public List<University> getUniversityFieldsByUniversity(University university);
}
