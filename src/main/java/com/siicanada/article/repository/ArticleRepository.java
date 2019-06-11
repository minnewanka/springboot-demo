package com.siicanada.article.repository;

import com.siicanada.article.repository.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Article Repositoru.
 */
@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {

}
