package com.siicanada.article.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de test de la classe {@link ArticleModel}
 */
public class ArticleModelTest {

  @Test
  public void whenConvertArticleToJsonThenCorrect() throws JsonProcessingException {
    ArticleModel articleModel = new ArticleModel();
    articleModel.setId(1);
    articleModel.setTitle("Bienvenue");
    articleModel.setIntro("Ceci est une intro");

    String jsonExpected = "{\"id\":1,\"title\":\"Bienvenue\",\"intro\":\"Ceci est une intro\",\"text\":null,\"picture\":null,\"picture_description\":null,\"tags\":null}";
    String result = new ObjectMapper().writeValueAsString(articleModel);

    Assert.assertEquals(jsonExpected, result);
  }
}
