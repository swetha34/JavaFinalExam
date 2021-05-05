/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

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
        System.out.println("Question 11 Output : GAHANA SWETHA SANAGALA");
        Employee e1 = new Employee(102, "Swetha", 9000);
        Employee e2 = new Employee(112, "Radha", 6000);
        Employee e3 = new Employee(107, "Krishna", 5000);
        System.out.println("First hashcode: "+e1.hashCode());/*internally calling toString() object 
                class toString() display ClassName@hexadecimalformateof Hashcode.*/
        System.out.println("Secound hashCode: "+e2.hashCode());
        System.out.println("Third hashCode: "+e3.hashCode());
        System.out.println("E1 Equals of E2 : " + e1.equals(e2));
        System.out.println("E1 Equals of E3 : " + e1.equals(e3));
        System.out.println("E2 Equals of E3 : " + e2.equals(e3));
        Employee e4 = e1;
        System.out.println("E1 Equals of E4 : " + e1.equals(e4));
    }

}
