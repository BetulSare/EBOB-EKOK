
package ebob.ekok;

import java.util.Scanner;

public class EBOBEKOK {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();
        
 
        int temp=0,temp1=n1,temp2=n2 ;
        while (n2 != 0) {
            temp = n1;
            n1 = n2;
            n2 = temp % n2;
        }        
        int ebob =n1;

        System.out.println("EBOB= "+ebob);
        int ekok=(temp1 * temp2) / ebob;
              
        System.out.println("EKOK= "+ekok);

    }

}
