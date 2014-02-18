package com.green.modules.rs;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import com.green.modules.cms.entity.Article;
import com.green.modules.cms.service.ArticleService;


@ActiveProfiles("production")
public class AddArticleTest extends AbstractIocTest{
	
	@Autowired
	private ArticleService articleService;
	
	@Test
	public void add(){
		Article article = new Article();
	}
	
}
