/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author Gahana Swetha Sanagal>
 */
public class Square  extends GeometricObject implements Colorable
{
	boolean colorable;
	Square(int s,boolean colorable)
        {
	
        	area=s*s;
		this.colorable=colorable;
	}
        @Override
	public String toString()
	{
		if(colorable)
			howToColor();
		else
			System.out.println("Unable to Color");
		return "Area is : "+area;
	}
	public void howToColor()
	{
		System.out.println("Color all Four Sides");
	}

}


