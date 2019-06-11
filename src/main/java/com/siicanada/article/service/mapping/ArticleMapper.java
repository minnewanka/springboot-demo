package com.siicanada.article.service.mapping;

import com.siicanada.article.model.ArticleModel;
import com.siicanada.article.repository.entity.ArticleEntity;
import com.siicanada.article.repository.entity.TagEntity;
import org.mapstruct.Mapper;

/**
 * Mapping between Data Layer and Business Logic Layer.
 */
@Mapper(componentModel = "spring")
public abstract class ArticleMapper {

  /** transform an objet ArticleEntity to an objet ArticleModel.
   * @param entity object ArticleEntity
   * @return ArticleModel
   */
  public abstract ArticleModel entityToModel(ArticleEntity entity);


  /**
   * allow mapping TagEntity objet to a string (description of the entity).
   * @param tag object TagEntity
   * @return tag description
   */
  protected String mapTagToString(TagEntity tag) {
    return tag.getDescription();
  }

}
