package com.siicanada.article.controller;

import com.siicanada.article.model.ArticleModel;
import com.siicanada.article.service.ArticleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Tag.
 */
@RestController
public class TagController {

  /**
   * Business logic layer.
   */
  @Autowired
  ArticleService articleService;

  /**
   * Get articles by tag descriptions.
   *
   * @param description tag description
   * @return ResponseEntity list of articles.
   */
  @GetMapping(value = "/tags/{description}/articles", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<ArticleModel>> getArticlesByDescription(
      @PathVariable("description") String description) {
    return new ResponseEntity<>(articleService.getArticlesByTagDescription(description),
        HttpStatus.OK);
  }

}
