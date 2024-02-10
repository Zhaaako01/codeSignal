package Gates;

public class Test1 {
    // You are given a two-digit integer n. Return the sum of its digits.

    // For n = 29, the output should be
    //solution(n) = 11.


    public static void main(String[] args) {
        System.out.println(getSumOfTwoDigit(13));
    }

    static int getSumOfTwoDigit(int n) {

        int num1 = n / 10;
        int num2 = n % 10;
        return num1 + num2;
    }
}
