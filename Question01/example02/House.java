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
public abstract class House {
    public int rooms;
    public int squarefeet;

    public House(int rooms, int squarefeet) {
        this.rooms = rooms;
        this.squarefeet = squarefeet;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquarefeet() {
        return squarefeet;
    }
  
}
