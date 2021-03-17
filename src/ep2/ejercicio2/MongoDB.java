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
public class MongoDB implements DatabaseProvider {

    @Override
    public void insert() {
        System.out.println("Registro insertado en MONGO DB");
    }

    @Override
    public void update() {
        System.out.println("Nombre actualizado en MongoDB");
    }

    @Override
    public boolean delete() {
        System.out.println("Elimiado registro de MongoDB");
        return true;
    }

}

class Oracle implements DatabaseProvider {

    @Override
    public void insert() {
        System.out.println("Se inserto nuevo registro en Oracle");
    }

    @Override
    public void update() {
        System.out.println("Se actualizo nuevo registro en Oracle");
    }

    @Override
    public boolean delete() {
        System.out.println("se ha eliminado registro de Oracle");
        return true;
    }
}

interface DatabaseProvider {

    void insert();

    void update();

    boolean delete();

}
