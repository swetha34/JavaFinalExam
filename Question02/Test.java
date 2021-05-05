/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

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
        System.out.println("Question 2 Output : GAHANA SWETHA SANAGALA");
        GeometricObject g[]=new GeometricObject[5];
		g[0]=new Square(10,true);
		g[1]=new Square(15,false);
		g[2]=new Square(7,true);
		g[3]=new Square(18,true);
		g[4]=new Square(24,true);
		for (GeometricObject g1:g )
		{
			System.out.println(g1);
		}
	}

    }
    

