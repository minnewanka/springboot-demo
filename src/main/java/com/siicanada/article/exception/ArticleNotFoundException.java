package com.siicanada.article.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for article not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ArticleNotFoundException extends RuntimeException {

  /** Constructor.
   *
   * @param message exception message.
   */
  public ArticleNotFoundException(String message) {
    super(message);
  }

}
