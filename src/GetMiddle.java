// Obtain the middle character of user inputted string
// If string length is even, return the two middle characters
// If string length is odd, return middle character

import java.util.Scanner;

public class GetMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = scanner.nextLine();
        System.out.printf("The middle character in the string: %s%n",middle(str));
    }
    public static String middle(String word) {
        int position;
        int length;
        if(word.length() % 2 == 0) {
            position = word.length() / 2 - 1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }


}
