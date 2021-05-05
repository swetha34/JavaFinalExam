/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Employee implements Comparable<Employee> {

    public int empId;
    public String empName;
    public float empSalary;

    public Employee(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }


    public String getEmpName() {
        return empName;
    }


    public float getEmpSalary() {
        return empSalary;
    }

    public String toString() {
        return empId + " " + empName + " " + empSalary;
    }

    public int compareTo(Employee o) {
        Employee e = (Employee) o;
        if (this.empId > e.empId) {
            return +1;
        } else if (this.empId < e.empId) {
            return -1;
        } else {
            return 0;
        }
    }

   

}
