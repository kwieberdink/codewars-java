import java.util.Scanner;

public class GetMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = scanner.nextLine();
        System.out.printf("The middle character in the string: %s%n",middle(str));
    }
    public static String middle(String str) {
        int position;
        int length;
        if(str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }


}
