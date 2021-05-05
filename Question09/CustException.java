/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class CustException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                YoungerException ye = new YoungerException(name + " wait "
                        + "some more time to apply this job");
                throw ye;
            } else if (age > 30) {
                throw new OlderException(name + " ur not allowed to apply this job");
            } else {
                System.out.println("Hai " + name + " Ur eligiable to apply this job");
            }
        } catch (YoungerException | OlderException ye) {
            ye.printStackTrace();
        }
    }

}


