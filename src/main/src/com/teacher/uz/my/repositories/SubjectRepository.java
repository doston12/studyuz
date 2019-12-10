package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
