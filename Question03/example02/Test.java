/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.example02;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 3 Output : GAHANA SWETHA SANAGALA");
        /*Implict type casting*/
        System.out.println("Implicit type casting");
        ElectronicDevices device = new Laptop();
        device.type();
        /*Explicit type casting*/
        System.out.println("Explicit type casting");
        Laptop laptop=(Laptop) device;
        laptop.type();
        
        
    }
    
}
