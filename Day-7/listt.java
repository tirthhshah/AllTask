import java.util.*;

public class listt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        String[] input = sc.nextLine().split(" ");
        boolean allOdd = true;

        for (String s : input) {
            if (Integer.parseInt(s) % 2 == 0) {
                allOdd = false;
                break;
            }
        }

        if (allOdd)
            System.out.println("Only odd numbers");
        else
            System.out.println("Contains even numbers");
    }
}
