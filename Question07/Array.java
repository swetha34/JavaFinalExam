/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numb[] = new int[100];
        for (int i =0;i< numb.length; i++)
        {
            numb[i] = (int) (Math.random()*100);
        }
        System.out.println("Question 07 Output : GAHANA SWETHA SANAGALA");
        System.out.println("Enter an index of array :");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        try
        {
            System.out.println("Interger at " + index + " is "+ numb[index]);
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        
    }
    
}
