package theCore.atTheCrossroads;

public class Test9 {
    //You are playing an RPG game. Currently your experience points
    // (XP) total is equal to experience. To reach the next level your XP
    // should be at least at threshold. If you kill the monster in front
    // of you, you will gain more experience points in the amount of the reward.

    //Given values experience, threshold and reward, check if you reach the
    // next level after killing the monster.

    //Example

    //For experience = 10, threshold = 15, and reward = 5, the output should be
    //solution(experience, threshold, reward) = true;
    //For experience = 10, threshold = 15, and reward = 4, the output should be
    //solution(experience, threshold, reward) = false.

    public static void main(String[] args) {
        int experience = 10;
        int threshold = 15;
        int reward = 5;

        int experience2 = 3;
        int threshold2 = 6;
        int reward2 = 4;

        int experience3 = 97;
        int threshold3 = 57;
        int reward3 = 7;

        System.out.println(solution(experience,threshold,reward));
        System.out.println(solution(experience2,threshold2,reward2));
        System.out.println(solution(experience3,threshold3,reward3));
    }

    static boolean solution(int experience, int threshold, int reward) {
        boolean b;
        if (reward >= threshold - experience) {
            b = true;
        } else b = false;
        return b;
    }
}
