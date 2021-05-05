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
public class SearchRecursive {

    public static void sort(int a[]) {

        // TODO code application logic here
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
    }

    public static void display(int a[]) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void search(int a[], int lb, int ub, int s) {
        if (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (a[mid] > s) {
                search(a, lb, mid - 1, s);
            } else if (a[mid] < s) {
                search(a, mid + 1, ub, s);
            } else {
                System.out.println("Element is Found");
            }
        } else {
            System.out.println("Element is Not Found");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {33, 22, 55, 66, 77, 43, 54, 38, 84, 23};
        System.out.println("Question 10 Output : GAHANA SWETHA SANAGALA");
        System.out.println("****************************************");
        System.out.println("List of Elements are : ");
        display(a);
        System.out.println("****************************************");
        System.out.println("Sorted List of Elements are : ");
        sort(a);
        display(a);
        System.out.println("****************************************");
        System.out.println("Enter the Element to Search : ");
        int s = sc.nextInt();
        search(a, 0, a.length, s);
    }

}
