import java.util.Scanner;


public class Decimal {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Output: " + reversed);

        sc.close();
    }
}
