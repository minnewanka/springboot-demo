package com.siicanada.article.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class TagModelTest {

  @Test
  public void whenConvertTagToJson_thenCorrect() throws JsonProcessingException {
    TagModel tagModel = new TagModel();
    tagModel.setId(1);
    tagModel.setDescription("sport");

    String jsonExpected = "{\"description\":\"sport\"}";
    String result = new ObjectMapper().writeValueAsString(tagModel);

    Assert.assertEquals(jsonExpected, result);
  }
}
