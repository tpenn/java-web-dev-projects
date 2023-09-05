package org.launchcode;
import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int num : integerArray) {
            System.out.println(num);
        }
        System.out.println("Odd only:");
        for (int num : integerArray) {
            if ((num % 2) != 0) System.out.println(num);
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("\\W");
        System.out.println(Arrays.toString(words));
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        System.out.println("sumEven = " + sumEven(intList));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word length: ");
        int numChars = input.nextInt();
        System.out.println("Words with exactly " + numChars + " letters:");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        for (String word : wordList) {
            if (word.length() == numChars) System.out.println(word);
        }
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) sum += num;
        }

        return sum;
    }
}
