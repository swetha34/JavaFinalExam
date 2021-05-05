/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 12 Output : GAHANA SWETHA SANAGALA");
        ArrayList<Employee> al = new ArrayList<>();
        Employee e1 = new Employee(101, "Jhansi", 5000);
        Employee e2 = new Employee(111, "Rani", 15000);
        Employee e3 = new Employee(121, "Karuna", 8000);
        Employee e4 = new Employee(108, "Krishna", 25000);
        Employee e5 = new Employee(105, "Swetha", 13000);
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        System.out.println("****************************************");
        System.out.println("Original Employees List : ");
        for (Employee e : al) {
            System.out.println(e);
        }
        Collections.sort(al);
        System.out.println("****************************************");
        System.out.println("Sorted Employees List based on "
                + "Default Sorting order : ");
        for (Employee e : al) {
            System.out.println(e);
        }
        Collections.sort(al, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return (e1.empName).compareTo(e2.empName);
            }
        });
        System.out.println("****************************************");
        System.out.println("Sorted Employees List based on EmpName Sorting order : ");
        for (Employee e : al) {
            System.out.println(e);
        }
        Collections.sort(al, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.empSalary > e2.empSalary) {
                    return 1;
                } else if (e1.empSalary < e2.empSalary) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("****************************************");
        System.out.println("Sorted Employees List"
                + " based on Employee Salary Sorting order : ");
        for (Employee e : al) {
            System.out.println(e);
        }
    }

}
