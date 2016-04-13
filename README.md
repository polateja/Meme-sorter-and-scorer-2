# Meme-sorter-and-scorer-2
Read in a list of internet memes from a json file on the classpath (you choose the memes!). Create one method which takes the list of memes and sorts them by name. Create a second method which associates a "lulz" score (from 1-10) with each meme and writes the updated values to the same json file.

# The memes.json (in src/main/resources is taken from a sample memes rest api 
 https://api.imgflip.com/get_memes

# Cucumber BDD methodology is used to test the approach
feature file is in src/main/resources/features/memes-sorter-and-scorer.feature

# A sample test for testing the restApi used is also committed ( MemesRestApiTest.java ).

# When the feature file is run, the corresponding MemesSortedAndScorerTest is run and validated.

# Steps to Run:
1) Import the project into Eclipse or any IDE workspace.
2) Make the project to be Maven supportive and build the maven project.
3) Right click on src/main/resources/features/memes-sorter-and-scorer.feature and click non Run as Cucumber feature.
NOTE: Cucumber plugin might be needed.
4) Please see the output of a run, pasted below.

#Output

102 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - Memes Information from File is Memes [listMemes=[MemesObj [id=101470, name=Ancient Aliens, url=http://i.imgflip.com/26am.jpg, width=500, height=437, lulz=2], MemesObj [id=438680, name=Batman Slapping Robin, url=http://i.imgflip.com/9ehk.jpg, width=400, height=387, lulz=5], MemesObj [id=61546, name=Brace Yourselves X is Coming, url=http://i.imgflip.com/1bhm.jpg, width=622, height=477, lulz=1], MemesObj [id=16464531, name=But Thats None Of My Business, url=http://i.imgflip.com/9sw43.jpg, width=600, height=600, lulz=5], MemesObj [id=61539, name=First World Problems, url=http://i.imgflip.com/1bhf.jpg, width=552, height=367, lulz=1], MemesObj [id=61520, name=Futurama Fry, url=http://i.imgflip.com/1bgw.jpg, width=552, height=414, lulz=8], MemesObj [id=5496396, name=Leonardo Dicaprio Cheers, url=http://i.imgflip.com/39t1o.jpg, width=600, height=400, lulz=5], MemesObj [id=61579, name=One Does Not Simply, url=http://i.imgflip.com/1bij.jpg, width=568, height=335, lulz=2], MemesObj [id=61532, name=The Most Interesting Man In The World, url=http://i.imgflip.com/1bh8.jpg, width=550, height=690, lulz=3], MemesObj [id=4087833, name=Waiting Skeleton, url=http://i.imgflip.com/2fm6x.jpg, width=298, height=403, lulz=3], MemesObj [id=347390, name=X, X Everywhere, url=http://i.imgflip.com/7g1q.jpg, width=500, height=381, lulz=7]]]
103 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - Sorting the memes by Name
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - Memes Information Sorted by Name is Memes [listMemes=[MemesObj [id=101470, name=Ancient Aliens, url=http://i.imgflip.com/26am.jpg, width=500, height=437, lulz=2], MemesObj [id=438680, name=Batman Slapping Robin, url=http://i.imgflip.com/9ehk.jpg, width=400, height=387, lulz=5], MemesObj [id=61546, name=Brace Yourselves X is Coming, url=http://i.imgflip.com/1bhm.jpg, width=622, height=477, lulz=1], MemesObj [id=16464531, name=But Thats None Of My Business, url=http://i.imgflip.com/9sw43.jpg, width=600, height=600, lulz=5], MemesObj [id=61539, name=First World Problems, url=http://i.imgflip.com/1bhf.jpg, width=552, height=367, lulz=1], MemesObj [id=61520, name=Futurama Fry, url=http://i.imgflip.com/1bgw.jpg, width=552, height=414, lulz=8], MemesObj [id=5496396, name=Leonardo Dicaprio Cheers, url=http://i.imgflip.com/39t1o.jpg, width=600, height=400, lulz=5], MemesObj [id=61579, name=One Does Not Simply, url=http://i.imgflip.com/1bij.jpg, width=568, height=335, lulz=2], MemesObj [id=61532, name=The Most Interesting Man In The World, url=http://i.imgflip.com/1bh8.jpg, width=550, height=690, lulz=3], MemesObj [id=4087833, name=Waiting Skeleton, url=http://i.imgflip.com/2fm6x.jpg, width=298, height=403, lulz=3], MemesObj [id=347390, name=X, X Everywhere, url=http://i.imgflip.com/7g1q.jpg, width=500, height=381, lulz=7]]]



130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=101470, name=Ancient Aliens, url=http://i.imgflip.com/26am.jpg, width=500, height=437, lulz=8]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=438680, name=Batman Slapping Robin, url=http://i.imgflip.com/9ehk.jpg, width=400, height=387, lulz=1]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=61546, name=Brace Yourselves X is Coming, url=http://i.imgflip.com/1bhm.jpg, width=622, height=477, lulz=4]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=16464531, name=But Thats None Of My Business, url=http://i.imgflip.com/9sw43.jpg, width=600, height=600, lulz=1]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=61539, name=First World Problems, url=http://i.imgflip.com/1bhf.jpg, width=552, height=367, lulz=5]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=61520, name=Futurama Fry, url=http://i.imgflip.com/1bgw.jpg, width=552, height=414, lulz=7]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=5496396, name=Leonardo Dicaprio Cheers, url=http://i.imgflip.com/39t1o.jpg, width=600, height=400, lulz=1]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=61579, name=One Does Not Simply, url=http://i.imgflip.com/1bij.jpg, width=568, height=335, lulz=5]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=61532, name=The Most Interesting Man In The World, url=http://i.imgflip.com/1bh8.jpg, width=550, height=690, lulz=7]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=4087833, name=Waiting Skeleton, url=http://i.imgflip.com/2fm6x.jpg, width=298, height=403, lulz=1]
130 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - memesObj with Lulz is MemesObj [id=347390, name=X, X Everywhere, url=http://i.imgflip.com/7g1q.jpg, width=500, height=381, lulz=5]
154 [main] INFO com.comcast.memes.api.test.MemesSortedAndScorerTest - Completed the Task !!

  Scenario: Execute MemesSortedAndScorerTest                    # /Users/tejapolapragada/git/Meme-sorter-and-scorer-2/src/main/resources/features/memes-sorter-and-scorer.feature:3
    Given Memes json from a text file                           # MemesSortedAndScorerTest.memes_json_from_a_text_file()
    When Memes are read from the file                           # MemesSortedAndScorerTest.memes_are_read_from_the_file()
    And Memes are Sorted by their names                         # MemesSortedAndScorerTest.memes_are_Sorted_by_their_names()
    And Lulz are randoming generated and assigned to Meme names # MemesSortedAndScorerTest.lulz_are_randoming_generated_and_assigned_to_Meme_names()
    And Memes are written back to the Json in the text file     # MemesSortedAndScorerTest.memes_are_written_back_to_the_Json_in_the_text_file()
    Then Memes are Sorted and Scored                            # MemesSortedAndScorerTest.memes_are_Sorted_and_Scored()

1 Scenarios (1 passed)
6 Steps (6 passed)
0m0.219s

