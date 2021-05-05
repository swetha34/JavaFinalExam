/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.example02;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Apartments extends House{
    int height;
    double breath;

    public Apartments(int height, double breath, int rooms, int squarefeet) {
        super(rooms, squarefeet);
        this.height = height;
        this.breath = breath;
    }

    @Override
    public String toString() {
        return "Apartments:" + "\nHeight= " + height + "\nbreath= " 
                + breath +"\nnumber of rooms= "+rooms + "\nSquare feet= "+squarefeet;
    }
    
    
    
    

}
