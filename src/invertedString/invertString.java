package invertedString;

import java.util.Scanner;

public class invertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово : ");
        String string = scanner.nextLine();

        String result = reverseString(string);
        System.out.println(result);


    }

    public static String reverseString (String string) {
        return new StringBuilder(string).reverse().toString();
    }

}
