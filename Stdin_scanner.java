import java.util.*;

public class Stdin_scanner {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        // Complete this line
//        // Complete this line
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        // Complete this line
//        // Complete this line
//        scan.close();
//    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner scan2 = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}