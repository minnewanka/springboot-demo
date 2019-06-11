package com.siicanada.article.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.siicanada.article.ArticleApplication;
import com.siicanada.article.model.ArticleModel;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArticleApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TagControllerIT {

  @LocalServerPort
  private int port;

  private TestRestTemplate restTemplate = new TestRestTemplate();

  private HttpHeaders headers = new HttpHeaders();

  @Test
  public void testGetArticlesByTagDescription() throws IOException {

    HttpEntity<String> entity = new HttpEntity<>(null, headers);

    ResponseEntity<String> response = restTemplate.exchange(
        createURLWithPort("/article-api/tags/{description}/articles"),
        HttpMethod.GET, entity, String.class, "science");
    ObjectMapper objectMapper = new ObjectMapper();

    List<ArticleModel> articleModels = objectMapper.readValue(
        response.getBody(),
        objectMapper.getTypeFactory().constructCollectionType(List.class, ArticleModel.class)
    );

    Assert.assertEquals(200, response.getStatusCodeValue());
    Assert.assertFalse(articleModels.isEmpty());
  }

  @Test
  public void testGetArticlesByTagDescriptionNotFound() {

    HttpEntity<String> entity = new HttpEntity<>(null, headers);

    ResponseEntity<String> response = restTemplate.exchange(
        createURLWithPort("/article-api/tags/{description}/articles"),
        HttpMethod.GET, entity, String.class, "TV");

    Assert.assertEquals(404, response.getStatusCodeValue());

  }

  private String createURLWithPort(String uri) {
    return "http://localhost:" + port + uri;
  }

}
