import java.util.*;
import java.io.*;
import java.lang.*;
public class Series {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
       
        for ( int i = 0; i < q; i ++ ) {
              int a = in.nextInt();
              int b = in.nextInt();
              int n = in.nextInt();
              int term = a;
             for ( int j = 0; j < n ; j++) {
                 term += (int)(b*Math.pow(2 , j));
                 System.out.print(term+" ");
             }
             System.out.println();
            }
        in.close();
	}
}

