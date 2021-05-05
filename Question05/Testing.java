/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 5 Output : GAHANA SWETHA SANAGALA");
        ComparableCircle c1 = new ComparableCircle(14,14.5);
        ComparableCircle c2 = new ComparableCircle(20,16.6);
        
        System.out.println("Area of First Object: "+c1.calcuArea());
        System.out.println("Area of Secound Object: "+c2.calcuArea());
        
        
        if (c1.compareTo(c2) > 0)
        {
            System.out.println("First Object is Bigger then Second Object");
        } else if (c1.compareTo(c2) < 0) 
        {
            System.out.println("Second Object is Bigger then First Object");
        } else 
        {
            System.out.println("Both Object are equal");
        }
    }

}


