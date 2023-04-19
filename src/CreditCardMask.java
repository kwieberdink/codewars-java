import java.util.Arrays;

public class CreditCardMask {

    static String maskify(String str) {
        if(str.length() <= 4){
            return str;
        }
        char[] buf = str.toCharArray();
        Arrays.fill(buf, 0, buf.length - 4, '#');
        return new String(buf);
    }

    public static void main(String[] args) {

        System.out.println(maskify("Banana Time"));

    }

}

