package Gates;
// n children have got m pieces of candy. They want to eat as
// much candy as they can, but each child must eat exactly the
// same amount of candy as any other child. Determine how many
// pieces of candy will be eaten by all the children together.
// Individual pieces of candy cannot be split.

//For n = 3 and m = 10, the output should be
//solution(n, m) = 9.
//
//Each child will eat 3 pieces. So the answer is 9.

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getTotalEatenCandy(3, 10));
    }

    private static int getTotalEatenCandy(int n, int m) {
        int candiesPerChild = m / n;
        int totalCandiesEaten = candiesPerChild * n;
        return totalCandiesEaten;
    }
}
