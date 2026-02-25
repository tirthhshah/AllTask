public class rspace {
    public static void main(String[] args) {

        String str = "WELCOME TO MV CLOUDS";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' '){   
                result = result + ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After removing spaces: " + result);
    }
}
