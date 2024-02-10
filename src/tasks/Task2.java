package tasks;

//Given a year, return the century it is in. The first century spans from the year
// 1 up to and including the year 100, the second - from the year 101 up to and
// including the year 200, etc.


public class Task2 {
    public static void main(String[] args) {
        System.out.println(getCentury(1905));

    }

    static int getCentury(int year) {

        int yearsInCentury = 100;
        int century;
        if (year % yearsInCentury == 0) {
            century = year / yearsInCentury;
        } else century = year / yearsInCentury + 1;
        return century;
    }
}
