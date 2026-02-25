public class p8 {
    public static void main(String[] args) {
          int n=5;

        for (int i = 0; i <= n; i++) {

            for (int s = 0; s < n - i; s++) 
                {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* " + i + " "); 
            }

            System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* " + i + " ");
            }

            System.out.print("*");
            System.out.println();
        }
    }
}
