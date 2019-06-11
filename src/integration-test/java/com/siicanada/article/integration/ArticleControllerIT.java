package com.siicanada.article.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.siicanada.article.ArticleApplication;
import com.siicanada.article.model.ArticleModel;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
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
public class ArticleControllerIT {

  @LocalServerPort
  private int port;

  private TestRestTemplate restTemplate = new TestRestTemplate();

  private HttpHeaders headers = new HttpHeaders();

  @Test
  public void testGetArticles() throws IOException {

    HttpEntity<String> entity = new HttpEntity<>(null, headers);

    ResponseEntity<String> response = restTemplate.exchange(
        createURLWithPort("/article-api/articles"),
        HttpMethod.GET, entity, String.class);
    ObjectMapper objectMapper = new ObjectMapper();

    List<ArticleModel> articleModels = objectMapper.readValue(
        response.getBody(),
        objectMapper.getTypeFactory().constructCollectionType(List.class, ArticleModel.class)
    );

    Assert.assertEquals(200, response.getStatusCodeValue());
    Assert.assertFalse(articleModels.isEmpty());
  }

  @Test
  public void testGetArticleById() throws JSONException {

    HttpEntity<String> entity = new HttpEntity<>(null, headers);

    ResponseEntity<String> response = restTemplate.exchange(
        createURLWithPort("/article-api/articles/1"),
        HttpMethod.GET, entity, String.class);

    Assert.assertEquals(200, response.getStatusCodeValue());
    JSONAssert.assertEquals(
        "{id:1}", response.getBody(), JSONCompareMode.LENIENT);
  }

  @Test
  public void testGetArticleByIdNotFound() {

    HttpEntity<String> entity = new HttpEntity<>(null, headers);

    ResponseEntity<String> response = restTemplate.exchange(
        createURLWithPort("/article-api/articles/9"),
        HttpMethod.GET, entity, String.class);

    Assert.assertEquals(404, response.getStatusCodeValue());

  }

  private String createURLWithPort(String uri) {
    return "http://localhost:" + port + uri;
  }

}
