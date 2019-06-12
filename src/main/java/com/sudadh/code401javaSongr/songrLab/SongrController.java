package com.sudadh.code401javaSongr.songrLab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


//mark this class as controller for spring to look at it

@RestController


public class SongrController {

    //specify route for this method

    public String capitalize(String toBeCapitalized){
        return toBeCapitalized.toUpperCase();
    }

    public static String reverseWords(String toBeReversed){
        String outputString = "";
        String[] wordsArray = (toBeReversed.split("\\s+"));
        ArrayList<String> reversedWords = new ArrayList<>();
        for(int i = 0; i<wordsArray.length; i++){
            reversedWords.add(wordsArray[wordsArray.length-i-1]);
        }
        outputString = String.join(" ", reversedWords);
        return outputString;
    }

    @GetMapping("/hello")

    public String getHelloWorld(){
        return "Hello world.";
    }


    @GetMapping("/capitalize/{sentence}")

    public String getCapitalizedSentence(@PathVariable String sentence){
        return capitalize(sentence);
    }

    @GetMapping("/reverse/{sentence}")

    public String getReversedSentence(@PathVariable String sentence){
        return reverseWords(sentence);
    }

}
