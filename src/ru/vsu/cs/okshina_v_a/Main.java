package ru.vsu.cs.okshina_v_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String text = readText();

        WordProcessing wordProcessing = new WordProcessing();
        String textWithCountedWordLengths = wordProcessing.countNumberOfChar(text);

        printProcessedText(textWithCountedWordLengths);
    }

    private static String readText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        return scanner.nextLine();
    }

    private static void printProcessedText(String changedText) {
        System.out.println(changedText);
    }
}