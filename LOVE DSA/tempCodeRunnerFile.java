import java.util.*;

public class string {

    static String reverseString(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(str);

        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "LOVE";

        System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));

        // System.out.println(getVowelsCount(str));
        // System.out.println(getLengthOfString(str));
        // printString(str);
    }
}