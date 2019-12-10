package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
