import java.util.*;

class css{
    public static void main(String args[]){
        int i, j;
        int n =4;
         for(i=1;i<=n;i++){
            //space
            for(j = 1;j <=n-i ;j++){
                System.out.print(" ");
            }
               
                 for(j = i ;j>1; j--){
                   System.out.print("*" );

                 }
                 
                 for(j = 1 ;j<=i; j++){
                   System.out.print("*" );

                 }
               
                System.out.println( );

            }
             for(i=n;i>=1;i--){
            //space
            for(j = 1;j <=n-i ;j++){
                System.out.print(" ");
            }
              
                 for(j = 1 ;j<=2*i-1; j++){
                   System.out.print("*" );

                 }                 
                
               
                System.out.println( );
               }
             
         }

}