package com.sudadh.code401javaSongr.songrLab;

import org.junit.Test;

import static org.junit.Assert.*;

public class SongrControllerTest {
    @Test
    public void testCapitalizeAllLowerCase() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.capitalize("this better get upperacsed");
        assertEquals("String output should be capitalized.", expectedOutput, "THIS BETTER GET UPPERCASED");
    }

    @Test
    public void testCapitalizeMixedLetters() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.capitalize("this Better gEt uPPerCased");
        assertEquals("String output should be capitalized.", expectedOutput, "THIS BETTER GET UPPERCASED");
    }

    @Test
    public void testCapitalizeCapitalLetters() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.capitalize("This BETTER GET UPPERCASED");
        assertEquals("String output should be capitalized.", expectedOutput, "THIS BETTER GET UPPERCASED");
    }

    @Test
    public void testCapitalizeNOLetters() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.capitalize("");
        assertEquals("Output should be empty string.", expectedOutput, "");
    }

    @Test
    public void testReverse() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.getReversedSentence("You are awesome");
        assertEquals("String output should be reversed.", expectedOutput, "awesome are You");
    }

    @Test
    public void testReverseSameWords() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.getReversedSentence("you you you you");
        assertEquals("String output should be same.", expectedOutput, "you you you you");
    }

    @Test
    public void testReverseNoWords() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.getReversedSentence("");
        assertEquals("Output should be empty string.", expectedOutput, "");
    }

    @Test
    public void testReverseWordsWithRepeatingWords() {
        SongrController classUnderTest = new SongrController();
        String expectedOutput = classUnderTest.getReversedSentence("hello there there is a hello there");
        assertEquals("Output should be reversed.", expectedOutput, "there hello a is there there hello");
    }

}