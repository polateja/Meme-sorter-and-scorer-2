package com.comcast.memes.api.test;

import java.util.Random;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comcast.memes.domain.Memes;
import com.comcast.memes.domain.MemesObj;
import com.comcast.memes.util.FileOperations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/***
 * This class is used to call the methods in util classes and accomplish the
 * task.
 * 
 * Cucumber BDD methodology is used for Testing.
 * 
 * @author tejapolapragada
 */
public class MemesSortedAndScorerTest {
	protected static Logger logger = LoggerFactory
			.getLogger(MemesSortedAndScorerTest.class);
	FileOperations readObj = new FileOperations();
	Memes memesResponse = new Memes();
	Random randNumber = new Random();

	@Given("^Memes json from a text file$")
	public void memes_json_from_a_text_file() throws Throwable {
		logger.info("Memes file is present in memes.json in the classpath");
	}

	@When("^Memes are read from the file$")
	public void memes_are_read_from_the_file() throws Throwable {
		memesResponse = readObj.readJsonFromFile();
		logger.info("Memes Information from File is "
				+ memesResponse.toString());
		Assert.assertNotNull(memesResponse);
	}

	@When("^Memes are Sorted by their names$")
	public void memes_are_Sorted_by_their_names() throws Throwable {
		logger.info("Sorting the memes by Name");

		// We can sort using the traditional Comparator sorting or by Java 8
		// lambda sorting (Java 8 !).
		memesResponse.getListMemes().sort(
				(o1, o2) -> o1.getName().compareTo(o2.getName()));

		logger.info("Memes Information Sorted by Name is "
				+ memesResponse.toString());
		Assert.assertNotNull(memesResponse);
	}

	@When("^Lulz are randoming generated and assigned to Meme names$")
	public void lulz_are_randoming_generated_and_assigned_to_Meme_names()
			throws Throwable {

		// Generate a random number between 1-10 and assign it to the each Memes
		// Lulz.
		for (int i = 0; i < memesResponse.getListMemes().size(); i++) {
				memesResponse.getListMemes().get(i).setLulz(randNumber.nextInt(10)+1);
		}
	}

	@When("^Memes are written back to the Json in the text file$")
	public void memes_are_written_back_to_the_Json_in_the_text_file()
			throws Throwable {
		for (MemesObj memesObj : memesResponse.getListMemes()) {
			logger.info("memesObj with Lulz is " + memesObj.toString());
		}

		// Writing back the memes with random lulz to the text file.
		readObj.writeJsonToFile(memesResponse);
	}

	@Then("^Memes are Sorted and Scored$")
	public void memes_are_Sorted_and_Scored() throws Throwable {
		logger.info("Completed the Task !!");
	}

}
