package com.siicanada.article.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Model of a newspaper article.
 */
@Data
public class ArticleModel {

  /**
   * id.
   */
  @JsonProperty("id")
  private Integer id;
  /**
   * title.
   */
  @JsonProperty("title")
  private String title; /**
   * introduction.
   */

  @JsonProperty("intro")
  private String intro;
  /**
   * text.
   */
  @JsonProperty("text")
  private String text;
  /**
   * picture.
   */
  @JsonProperty("picture")
  private String picture;
  /**
   * picture description.
   */
  @JsonProperty("picture_description")
  private String pictureDescription;
  /**
   * List of subjets tags.
   */
  @JsonProperty("tags")
  private String[] tags;

}
