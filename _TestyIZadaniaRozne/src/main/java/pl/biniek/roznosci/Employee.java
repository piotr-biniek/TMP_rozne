/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.roznosci;

import java.io.Serializable;

/**
 *
 * @author piotr
 */
public class Employee implements Comparable<Employee>, Serializable {

    String name;
    int age;
    double salary;
    long mobile;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }
    

    // constructors, getters & setters
//    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);

       

    }
}
