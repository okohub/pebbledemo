package com.okohub.pebbledemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PebbledemoApplicationTests {

  @Autowired
  TestRestTemplate restTemplate;

  @Test
  public void changeParentScopeVariable() {
    String body = this.restTemplate.getForObject("/", String.class);
    //body should be "tankinfantrytank"
    //but macro changes global variable, so it will be "tankinfantryinfantry"
    assertThat(body).isEqualTo("tankinfantryinfantry");
  }
}
