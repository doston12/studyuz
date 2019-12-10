package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.TRoomLesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TRoomLessonRepository extends JpaRepository<TRoomLesson,Long> {
    public List<TRoomLesson> findTRoomLessonsByUserId(Long id);
}
