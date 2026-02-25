public class p4 {

    public static void printPattern(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                
                if ((i == 0 || i == size / 2 || i == size - 1) &&
                        (j >= size/2 - 1 && j <= size/2 + 1)) {
                    System.out.print("*");
                }
               
                else if ((j == size/2 - 2 || j == size/2 + 2) &&
                        (i > 0 && i < size - 1) && i != size/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");                 
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(9); 
    }
}
