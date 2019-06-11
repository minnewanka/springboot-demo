package com.siicanada.article.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for tag not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class TagNotFoundException extends RuntimeException {

  /** Constructor.
   *
   * @param message exception message.
   */
  public TagNotFoundException(String message) {
    super(message);
  }
}
