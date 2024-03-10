package theCore.gates;
// Given an integer n, return the largest number that contains exactly n digits.

//For n = 2, the output should be
//solution(n) = 99.

public class Test2 {
    public static void main(String[] args) {


        System.out.println(largestNum(7));

    }

    public static int largestNum(int n) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s1.append(9);
        }
        return Integer.parseInt(s1.toString());
    }
}