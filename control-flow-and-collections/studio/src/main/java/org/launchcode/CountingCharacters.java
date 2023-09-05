package org.launchcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a phrase: ");
//        String phrase = input.nextLine();
        Path fileName = Path.of("./control-flow-and-collections/studio/src/main/java/org/launchcode/phrase.txt");
        System.out.println("Filename: " + fileName.toAbsolutePath());
        String phrase = Files.readString(fileName);
        System.out.println("Phrase  : " + phrase);

        HashMap<Character, Integer> charCount = getLetterCount(phrase);
        printLetterCount(charCount);
    }

    public static HashMap<Character, Integer> getLetterCount(String phrase) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char letter : phrase.toLowerCase().toCharArray()) {
            if (Character.isLetter(letter)) {
                letterCount.compute(letter, (key, value) -> value == null ? 1 : value + 1);
            }
        }

        return letterCount;
    }

    public static void printLetterCount(HashMap<Character, Integer> letterCount) {
        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
