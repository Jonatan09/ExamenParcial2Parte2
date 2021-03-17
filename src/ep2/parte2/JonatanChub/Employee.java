/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2.parte2.JonatanChub;

/**
 *
 * @author Jonatan Chub 
 */
public class Employee {

    String name;
    String lastName;
    int age;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    
    
    
    public String getFullName() {
        return name + " " + lastName;
    }

}

