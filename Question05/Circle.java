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
public class Circle {
   
    public double r,area;

    public Circle(double r, double area) {
        this.r = r;
        this.area = area;
    }

    public double getR() {
        return r;
    }

    public double getArea() {
        return area;
    }
    
    
    public double calcuArea()
    {
        area = Math.round(Math.PI * Math.pow(this.r, 2)*100/100.0);
        return area;
    }
    

}
