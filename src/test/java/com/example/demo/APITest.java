package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.Header;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APITest
{
	@Before
	public void setup()
	{
		RestAssured.baseURI = "http://localhost:8080";
	}

	@Test
	public void test1()
	{
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/hello");

		System.out.println("Response Body is =>  " + response.asString());

		assertEquals(response.asString(),"waz up");

	}
}
