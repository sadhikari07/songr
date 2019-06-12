# songr

## Overview
Set up a basic webapp that will be useful for the next 5 labs.

## Setup
Use the Spring Initializr to create a new application with artifact songr with Web (and optionally Devtools) dependency. 
Download the zip file and extract the directory it contains. Add the course gitignore file into that directory.
Run git init, git add ., and git commit -m "initial commit from Spring init". 
Create a new GitHub repo, and push your initial commit to your master branch there.

## Feature Tasks
As you work on these feature tasks, remember to consider your basic application setup. 
What classes should you create? 
How should they be related?

Ensure that you can run the Spring app.

Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data come back.

Create a route that turns words into UPPER CASE. 
For instance, I should be able to visit /capitalize/hello and get back the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get the response THIS IS KINDA CAPITALIZED.

Write a unit test for the capitalization functionality of that route.

Create a route that reverses the order of the words in a query parameter. 
For example, if I visit /reverse?sentence=Hello world, it should return world Hello.

Write a unit test for the word reversing functionality of the above route.

## Testing
Ensure you have tested the interesting functionality of your application.

## Tests:
The following tests were performed for the functionality of the app:

### For capitalization functionality

testCapitalizeAllLowerCas: Tests if the method can capitalize string with all lowercase letters.

testCapitalizeMixedLetters: Tests if the method can capitalize string with some lowercase and some uppercase letters.

testCapitalizeCapitalLetters: Tests if the method can capitalize string with all uppercase letters.

testCapitalizeNOLetters: Tests for the output of empty string passed in.

testReverse: Tests if method can reverse a string passed in.

testReverseSameWords: Tests if method can handle input with all same words

testReverseNoWords: Tests for the output of empty string passed in.

testReverseWordsWithRepeatingWords: Tests if method can handle input with some words repeated.

## Instructions on running the app: 

The app can be run from web browser. 
On the web browser type localhost:8080/(parameters)
(parameters can be: 

/hello for getting "hello world" returned

/capitalize/{sentence} where sentence is the string you wish to be capitalized, and you'll get capitalized sentence in return.

/reverse/{sentence} where sentence is the string you wish to be reversed, and you'll get reversed sentence in return.


[Link to SongrController.java](https://github.com/sadhikari07/songr/blob/master/src/main/java/com/sudadh/code401javaSongr/songrLab/SongrController.java)

[Link to SongrControllerTest.java]()
