package com.teacher.uz.my.repositories;

import com.teacher.uz.my.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Long> {
    public List<Article> findArticleBySubjectId(Long id);
}
