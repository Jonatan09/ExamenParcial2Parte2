/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2.ejercicio2;

/**
 *
 * @author Jonatan Chub
 */
public class Report {

    DatabaseProvider database;

    public void open() {
        System.out.println("Conexión con el gestor ha sido exitoso");
    }

    public void save() {
        System.out.println("Se han guardado los datos");
    }
}
