package org.umit.jpm07;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        // Split the string into words
        String[] words = string.split(" ");

        // Count the number of words
        int wordCount = words.length;

        // Print the number of words
        System.out.println("The number of words in the string is: " + wordCount);
    }
}