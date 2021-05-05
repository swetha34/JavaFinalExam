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
public class ComparableCircle extends Circle implements Comparable
{
	public ComparableCircle(double r, double area)
	{
		super(r,area);
	}
        @Override
	public int compareTo(Object o)
	{
		ComparableCircle cc=(ComparableCircle)o;
		if(this.area>cc.area)
			return 1;
		else if(this.area<cc.area)
			return -1;
		else
			return 0;
	}


}
