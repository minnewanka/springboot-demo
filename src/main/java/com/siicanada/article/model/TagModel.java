package com.siicanada.article.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Model of a subject tag.
 */
@Data
public class TagModel {

  /**
   * id.
   */
  @JsonIgnore
  private Integer id;
  /**
   * description.
   */
  @JsonProperty("description")
  private String description;
}
