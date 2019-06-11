package com.siicanada.article.repository.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import lombok.Data;

/**
 * Entity representation of a newspaper article.
 */
@Data
@Entity
@Table(name = "article")
public class ArticleEntity {

  /**
   * id.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  /**
   * title.
   */
  @Column(name = "title")
  private String title;
  /**
   * introduction.
   */
  @Column(name = "intro")
  private String intro;
  /**
   * text.
   */
  @Column(name = "text")
  private String text;
  /**
   * picture.
   */
  @Column(name = "picture")
  private String picture;
  /**
   * picture description.
   */
  @Column(name = "picture_description")
  private String pictureDescription;
  /**
   * List of subjets tags.
   */
  @ManyToMany(fetch = FetchType.LAZY, cascade = {
      CascadeType.PERSIST, CascadeType.MERGE
  })
  @JoinTable(name = "article_tag",
      joinColumns = {@JoinColumn(name = "article_id")},
      inverseJoinColumns = {@JoinColumn(name = "tag_id")})
  @OrderColumn(name = "description")
  private Set<TagEntity> tags = new HashSet<>();

}
