package theCore.gates;

public class Test4 {

    //Given the total number of rows and columns in the theater (nRows and nCols, respectively),
    // and the row and column you're sitting in, return the number of people who sit strictly
    // behind you and in your column or to the left, assuming all seats are occupied.

    //For nCols = 16, nRows = 11, col = 5, and row = 3, the output should be
    //solution(nCols, nRows, col, row) = 96.

    public static void main(String[] args) {
        System.out.println(solution(16,11,5,3));
    }

    private static int solution(int nCols, int nRows, int col, int row) {
        int seatsBehindMe = nRows - row;
        int seatsFromMyLeft = (nCols - col + 1);
        int numberOfPeople = 0;
        for (int i = 0; i < seatsFromMyLeft; i++) {
            for (int j = 0; j < seatsBehindMe; j++) {
                numberOfPeople++;
            }
        }
        return numberOfPeople;
    }
}