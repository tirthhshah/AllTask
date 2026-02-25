import java.util.Scanner;

public class Find{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        System.out.println("Enter word position:");
        int number = sc.nextInt();

        String[] words = input.split(" ");

        if (number > 0 && number <= words.length) {
            System.out.println("Output: " + words[number - 1]);
        } else {
            System.out.println("Invalid position");
        }

        sc.close();
    }
}
