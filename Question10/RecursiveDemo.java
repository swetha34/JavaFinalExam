/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class RecursiveDemo {

    public static long fact(int x) {
        if (x == 1 || x == 0) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Question 10 Output : GAHANA SWETHA SANAGALA");
            System.out.println("Enter a Integer value to find Factorial : ");
            int n = sc.nextInt();
            long f = fact(n);
            System.out.println("Factorial of a " + n + " is : " + f);
        }

    }

}
