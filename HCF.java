import java.util.*;
public class HCF {
    public static int findHCF(int a, int b) {
       if(a%b==0){
        return b;

       }
       else{
        return findHCF(b,a%b);
       }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}


