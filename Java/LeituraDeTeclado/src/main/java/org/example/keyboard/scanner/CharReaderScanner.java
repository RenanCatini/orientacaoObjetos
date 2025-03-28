package org.example.keyboard.scanner;

import java.util.Scanner;

public class CharReaderScanner {
    public static void main(String[] args) {
        /*
        There is no API method to get a character from the Scanner.
        You should get the String using scanner.next() and invoke String.charAt(0)
        method on the returned String. Just to be safe with whitespaces you could
        also first call trim() on the string to remove any whitespaces.
         */
        char input = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a char (q to exit): ");
            input = (char) scanner.next().trim().charAt(0);
            System.out.println(input);

        } while (input != 'q');
    }
}
