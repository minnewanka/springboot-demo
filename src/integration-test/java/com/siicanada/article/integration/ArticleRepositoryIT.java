package com.siicanada.article.integration;

import com.siicanada.article.repository.ArticleRepository;
import com.siicanada.article.repository.entity.ArticleEntity;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ArticleRepositoryIT {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private ArticleRepository articleRepository;

  @Test
  public void whenArticleExistThenReturnTrue() {
    final boolean articleFound = articleRepository.existsById(1);
    Assert.assertTrue(articleFound);
  }

  @Test
  public void whenDeleteArticleThenArticleNotExistAnymore() {

    List<ArticleEntity> articleEntityList = articleRepository.findAll();
    final int sizeArticleEntityListBefore = articleEntityList.size();

    ArticleEntity articleEntity = articleEntityList.get(0);
    articleRepository.delete(articleEntity);

    final int sizeArticleEntityListActual = articleRepository.findAll().size();

    int sizeArticleEntityListExpected = sizeArticleEntityListBefore - 1;
    Assert.assertEquals(sizeArticleEntityListExpected, sizeArticleEntityListActual);

    final boolean articleExist = articleRepository.existsById(articleEntity.getId());
    Assert.assertFalse(articleExist);
  }

  @Test
  public void whenSaveArticleThenArticleAdded() {

    final int sizeArticleListBefore = articleRepository.findAll().size();

    ArticleEntity articleEntity = new ArticleEntity();
    articleEntity.setTitle("Canada");
    articleEntity.setIntro("Welcome to Canada");
    articleEntity.setPicture("Picture");
    articleEntity.setPictureDescription("Drapeau du Canada");
    articleEntity.setText("Voici le Canada");

    entityManager.merge(articleEntity);
    entityManager.flush();

    final int sizeArticleListAfter = articleRepository.findAll().size();
    final int sizeArticleListExpected = sizeArticleListBefore + 1;

    Assert.assertEquals(sizeArticleListExpected, sizeArticleListAfter);

  }

  @Test
  public void getArticleById() {
    ArticleEntity articleFound = articleRepository.findById(1).get();
    Assert.assertEquals(1, articleFound.getId(), 0.0);
  }

}
