// Jonathan Sonnek
// 2/27/26
// Random Letter APP

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create random word
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            word.append((char) ('a' + (int) (Math.random() * 26)));
        }
        System.out.printf("Word %2d: %s%n", 1, word.toString());

        for (int i = 1; i < 20; i++) {
            int pos = (int) (Math.random() * 10);
            char newLetter = (char) ('a' + (int) (Math.random() * 26));
            word.setCharAt(pos, newLetter);
            System.out.printf("Word %2d: %s%n", (i + 1), word.toString());
        }
    }
}

