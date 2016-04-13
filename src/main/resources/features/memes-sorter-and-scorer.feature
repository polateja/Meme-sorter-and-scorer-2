Feature: Testing the CSV Memes-Sorted-and-Scorer-2-problem

Scenario: Execute MemesSortedAndScorerTest
Given Memes json from a text file
When Memes are read from the file
And Memes are Sorted by their names
And Lulz are randoming generated and assigned to Meme names
And Memes are written back to the Json in the text file
Then Memes are Sorted and Scored 