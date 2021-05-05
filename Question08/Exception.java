/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 08 Output : GAHANA SWETHA SANAGALA");
        try{
            Scanner sc = new Scanner(new File("input.txt"));
        }
        catch(FileNotFoundException exception){
            System.out.println("File not found "+exception);
        }
    }
    
}
