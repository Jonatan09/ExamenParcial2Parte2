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
public class Principal {

    public static void main(String[] args) {
        Report conexion = new Report();

        conexion.database = new Oracle();
        conexion.open();
        conexion.database.insert();
        conexion.database.update();
        conexion.database.delete();
        conexion.save();

    }
}
