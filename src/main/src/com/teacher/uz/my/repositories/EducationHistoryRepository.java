package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.EducationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EducationHistoryRepository extends JpaRepository<EducationHistory,Long> {
    public EducationHistory findEducationHistoryByUserId(Long id);
}
