/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Exception01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException,
            ArrayIndexOutOfBoundsException {
        // TODO code application logic here
        System.out.println("Question 08 Output : GAHANA SWETHA SANAGALA");
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[]=new int[5];
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();
        try{
            int result = 50/num;
            System.out.println("Answer of result is: " + result);
            array[ind] = result;
            System.out.println("Answer of array is: " + array);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        
    }
    
}
    
    

