import java.util.Scanner;
public class Stdin2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String q =scan.nextLine();
        double d = scan.nextDouble();
        q =scan.nextLine();
        q =scan.nextLine();
        

        // Write your code here.

        System.out.println("String: " + q);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
