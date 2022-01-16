package ru.vsu.cs.okshina_v_a;

import org.junit.Test;
import org.junit.Assert;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestOfCountNumberOfChar {
    @Test
    public void testStringWithAllNumbers() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testingStringWithAllNumbers.txt"));
        String testingInput = scanner.nextLine();

        String actualResult = WordProcessing.countNumberOfChar(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/answerStringWithAllNumbers.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testStringFromOneWord() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testingStringFromOneWord.txt"));
        String testingInput = scanner.nextLine();

        String actualResult = WordProcessing.countNumberOfChar(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/answerStringFromOneWord.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testDefaultString() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testingDefaultString.txt"));
        String testingInput = scanner.nextLine();

        String actualResult = WordProcessing.countNumberOfChar(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/answerDefaultString.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testLongString() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testingLongString.txt"));
        String testingInput = scanner.nextLine();

        String actualResult = WordProcessing.countNumberOfChar(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/answerLongString.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testStringFromOneChar() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testingStringFromOneChar.txt"));
        String testingInput = scanner.nextLine();

        String actualResult = WordProcessing.countNumberOfChar(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/answerStringFromOneChar.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }
}
