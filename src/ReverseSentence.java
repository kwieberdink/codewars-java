public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = "Welcome back!";
        String reversed = reverse(sentence);
        System.out.println(reversed);

    }

    public static String reverse (String sentence) {
        if (sentence.isEmpty()){
            return sentence;
        }
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }

}
