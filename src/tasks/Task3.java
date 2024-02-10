package tasks;

public class Task3 {
    //Given the string, check if it is a palindrome.
    public static void main(String[] args) {

        System.out.println(isPalindrome("aabaa"));
        System.out.println(isPalindrome("abac"));
        System.out.println(isPalindrome("a"));

    }

    static boolean isPalindrome(String inputString) {
        boolean result;
        StringBuilder s1 = new StringBuilder(inputString);
        String s2 = s1.reverse().toString();
        if (s2.equals(inputString)) {
            result = true;
        } else result = false;
        return result;
    }

}
