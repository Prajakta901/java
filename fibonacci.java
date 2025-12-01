import java.util.*;
//greatest common factor
 public class fibonacci{
    public static void fbc(int n){
      
      int k = 1;
      int j  =0;
      for(int i=1;i<=n ;i++){
        int gr = j + k;
        System.out.println(gr + "");
        j = k;
        k = gr;
      }
      System.out.println();
    }
public static void main(String args[]){
        Scanner cf = new Scanner(System.in);
     System.out.println("enter the number");
     int n = cf.nextInt();
     System.out.println("the fibonacci series is");
     fbc(n);
}
 }