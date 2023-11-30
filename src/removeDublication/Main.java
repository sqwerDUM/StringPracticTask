package removeDublication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = scanner.nextLine();
        char [] chars = string.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : charSet ){
            stringBuilder.append(character);

        }
        System.out.println(stringBuilder);
    }

}