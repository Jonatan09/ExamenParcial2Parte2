/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2.parte2.JonatanChub;

import ep2.ejercicio2.MongoDB;


/**
 *
 * @author Jonatan Chub
 */
public class Principal {

    public static void main(String[] args) {
        Employee EddieMacz = new Employee("Jonatan", "Chub", 15);
        EddieMacz.getFullName();
        
        EmployeeSalary es = new EmployeeSalary();
        es.printSalaryReport(EddieMacz);
        
       
    }
}
