package Gates;

public class Test6 {
    //Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

    //For n = 10 and firstNumber = 2, the output should be
    //solution(n, firstNumber) = 7.
    public static void main(String[] args) {
        System.out.println(solution(9, 6));
    }

    static int solution(int n, int firstNumber) {
        int result;
        int half = n / 2;

        if (n % 2 == 0 && (firstNumber + half) < n) {
            result = firstNumber + half;
        } else {
            result = (firstNumber + half) - n;
        }
        return result;
    }
}
