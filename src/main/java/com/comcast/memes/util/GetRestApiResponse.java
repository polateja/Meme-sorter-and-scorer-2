package com.comcast.memes.util;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.get;

public class GetRestApiResponse {

	public Response consumeRestApi(String url) {
		Response restApiResponse = get(url);

		return restApiResponse;

	}

}
