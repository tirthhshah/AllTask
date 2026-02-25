public class p5 {
    public static void main(String[] args) {

        int rows = 5;
        int baseStars = 5;  
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            if (i == rows) {
                for (int j = 1; j <= baseStars; j++) {
                    System.out.print("* ");
                }
            } else {
                
                for (int k = 1; k <= 2*i - 1; k++) {
                    if (k == 1 || k == 2*i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
