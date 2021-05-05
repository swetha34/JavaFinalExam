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
public class Ques10 {

    int sum = 0, j = 0;
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Question 10 Output : GAHANA SWETHA SANAGALA");
        System.out.print("Enter the no. of elements : ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the elements: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Ques10 obj = new Ques10();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum:"+x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }
    }
}
 
