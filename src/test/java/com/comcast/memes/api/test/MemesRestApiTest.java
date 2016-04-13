package com.comcast.memes.api.test;

import org.junit.Assert;
import org.junit.Test;

import com.comcast.memes.util.GetRestApiResponse;
import com.jayway.restassured.response.Response;

/***
 * This class is used to test the get Rest api for memes.
 * 
 * This can be improved to read the text file from rest api, which is the more
 * dynamic way.
 * Ex: https://api.imgflip.com/get_memes
 * 
 * @author tejapolapragada
 */
public class MemesRestApiTest {
	GetRestApiResponse restObj = new GetRestApiResponse();
	final String memesApi = "https://api.imgflip.com/get_memes";
			
	@Test
	public void testMemesGetRestApiResponse(){
		Response responseObj = restObj.consumeRestApi(memesApi);		
		Assert.assertNotNull(responseObj);
		
		//Assert the status code is 200 OK.
		responseObj.then().statusCode(200);
		
	}
}
