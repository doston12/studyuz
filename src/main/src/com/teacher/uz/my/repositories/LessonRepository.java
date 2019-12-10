package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson,Long>{
}
