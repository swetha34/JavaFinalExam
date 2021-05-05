/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Employee {
    int empNo;
	String empName;
	float sal;
	/*creating Employee Constructor with Employee number , 
        Employee name and salary as arguments*/
        /**
         * 
         * @param empNo
         * @param empName
         * @param sal 
         */
	Employee(int empNo,String empName,float sal)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.sal=sal;
	}
	/*
		Equals method is used to compare two Employee object are equal or 
        not based on Employee Number comparasion.
        equals() is Overriden from java.lang.Object class.
        Object class equals() method is used perform reference comparasion
	*/
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		return this.empNo==e.empNo;	//comparing empno
	}
	/*
	 hashCode() method is Overriden from java.lang.Object class. 
        Object class hashCode() generates unique hashCode for each and every Object.
	 Here we are Overriden method to provide empNo as hashcode.
	*/
	public int hashCode()
	{
		int hash = 3;
                hash = 83 * hash + Objects.hashCode(this.empName);
                hash = 83 * hash + Objects.hashCode(this.empNo);
                hash = 83 * hash + Objects.hashCode(this.sal);
                return hash;
	}
}


