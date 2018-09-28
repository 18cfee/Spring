package com.example.demo;

import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test public void
    lotto_resource_returns_200_with_expected_id_and_winners() {

        RestAssured.when().get("/hello").then().statusCode(200);

    }

    @Test public void
    failRequest() {

        RestAssured.when().
                                  get("/hello").
                                                       then().
                                                                     statusCode(200);

    }

    @Test
    public void failure()
    {
        assertTrue(true);
    }


}
