package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Category;
import com.teacher.uz.my.domains.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill,Long> {
    public List<Skill> findSkillsByCategoryId(Long id);
    public List<Skill> findSkillsByUserId(Long id);
}
