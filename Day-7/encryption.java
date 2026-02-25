import java.util.*;

public class encryption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String msg = sc.nextLine();

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        String enc = "", dec = "";

        for (char c : msg.toCharArray()) enc += (char)(c + key);
        for (char c : enc.toCharArray()) dec += (char)(c - key);

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
