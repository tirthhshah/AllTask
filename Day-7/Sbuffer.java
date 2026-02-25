public class Sbuffer {
    public static void main(String[] args) {

       
        StringBuffer sb1 = new StringBuffer("Hello World");
        sb1.delete(0, sb1.length());
        System.out.println("After delete(): \"" + sb1 + "\"");

       
        StringBuffer sb2 = new StringBuffer("Java Programming");
        sb2.setLength(0);
        System.out.println("After setLength(0): \"" + sb2 + "\"");

        StringBuffer sb3 = new StringBuffer("Welcome");
        sb3.replace(0, sb3.length(), "");
        System.out.println("After replace(): \"" + sb3 + "\"");
        
       
    }
}
