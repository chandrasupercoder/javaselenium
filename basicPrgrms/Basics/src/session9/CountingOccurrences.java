package session9;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] count = new int[256];

        // Count each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch]++;
        }

        // Display character counts (skip characters with zero count)
        System.out.println("Character occurrences:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("'" + (char)i + "': " + count[i]);
            }
        }

    }

}
