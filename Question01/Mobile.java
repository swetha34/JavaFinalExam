/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Mobile implements Electronicdevices ,ManufactureYear{
    public static final String mobileModel="One plus";
    public static final String mobilecost="43000";
    public static final int mobilemanufactureYear=2000;
    
    public void type(){
    System.out.println("Mobile model is: "+mobileModel);
    }
    public void cost(){
        System.out.println("Mobile cost: "+mobilecost);
    }
    public void manufacture()
    {
        System.out.println("Mobile manufacture Year: "+mobilemanufactureYear);
    }
}
