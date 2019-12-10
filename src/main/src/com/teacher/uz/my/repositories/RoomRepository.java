package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Rooms,Long> {
}
