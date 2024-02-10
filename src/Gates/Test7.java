package Gates;

public class Test7 {
//Using the bike's timer, calculate the current time. Return an answer as the sum of digits
// that the digital timer in the format hh:mm would show.

//For n = 240, the output should be
//solution(n) = 4.

//Since 240 minutes have passed, the current time is 04:00. The digits sum up to 0 + 4 + 0 + 0 = 4,
// which is the answer.

//For n = 808, the output should be
//solution(n) = 14.

//808 minutes mean that it's 13:28 now, so the answer should be 1 + 3 + 2 + 8 = 14.

    public static void main(String[] args) {

        int n =1439;
        int hours = n / 60;

        int minutes = n % 60;

        int r1 = hours / 10 + hours % 10;
        int r2 = minutes / 10 + minutes % 10;
        int result = r1 + r2;
        System.out.println(result);


    }
}
