import java.util.Scanner;

public class dice {

    static int ways(int dice, int sum){
        if (sum < 0)
            return 0;
            
        if (dice == 0) {
            if (sum == 0)
                return 1;
            else
                return 0;
        }

        int count = 0;

        for (int i = 1; i <= 6; i++) {
            count += ways(dice - 1, sum - i);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dice (1-6): ");
        int dice = sc.nextInt();

        System.out.print("Enter sum: ");
        int sum = sc.nextInt();

        if (dice < 1 || dice > 6) {
            System.out.println("Invalid dice count!");
        } else {
            System.out.println("Combinations: " + ways(dice, sum));
        }
    }
}
