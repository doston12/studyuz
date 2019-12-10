package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Long> {
}
