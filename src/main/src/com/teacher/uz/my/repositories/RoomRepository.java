package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shoh Jahon on 18.05.2018.
 */
public interface RoomRepository extends JpaRepository<Rooms,Long> {
}
