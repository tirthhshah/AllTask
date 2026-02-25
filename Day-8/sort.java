import java.util.*;

public class sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter letters: ");
        String input = sc.nextLine();       

        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input!");
            return;
        }

        char[] ch = input.toCharArray();
        Arrays.sort(ch);
                                                  
        System.out.println("Sorted: " + new String(ch));
    }
}          
