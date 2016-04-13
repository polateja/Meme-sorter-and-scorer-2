package com.comcast.memes.util;

import java.io.File;
import java.io.IOException;

import com.comcast.memes.domain.Memes;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileOperations {
	public void writeJsonToFile(Memes memes)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Write to the json file.
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(
					new File(
							"/Users/tejapolapragada/git/Meme-sorter-and-scorer-2/src/main/resources/memes.json"),
					memes);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Memes readJsonFromFile() throws JsonParseException,
			JsonMappingException, IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		ObjectMapper mapper = new ObjectMapper();

		Memes memes = new Memes();

		File file = new File(classLoader.getResource("memes.json")
				.getFile());

		memes = mapper.readValue(file, Memes.class);
		return memes;
	}
}
