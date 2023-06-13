package me.jhkwon91.springbootdeveloper.repository;

import me.jhkwon91.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
