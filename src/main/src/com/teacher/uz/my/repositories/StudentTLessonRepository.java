package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.StudentTLesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTLessonRepository extends JpaRepository<StudentTLesson,Long> {
}
