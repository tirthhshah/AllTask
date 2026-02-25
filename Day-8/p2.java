public class p2 {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++){
            for(int j=0;j<=6;j++){
                if((j==3&&i>=0)||(i==3&&j>=0)||
                (j==0&&i<=2)||(i==0&&j>=4)||(i==6&&j<=2)||(j==6&&i>=4)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}