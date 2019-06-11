package com.siicanada.article.repository;

import com.siicanada.article.repository.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Tag Repository.
 */
@Repository
public interface TagRepository extends JpaRepository<TagEntity, Integer> {

  TagEntity getByDescription(String description);
}
