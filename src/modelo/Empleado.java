/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sistemate
 */
public class Empleado extends Persona{
    private String puesto;
    private double sueldo;

    public Empleado(String puesto, double sueldo, String nombre, double estatura) {
        //con super llamamos al constructor de Persona. Ya que un empleado no solo
        //tendrá los atributos de puesto y saldo si no que también tendrá estatura
        // y nombre
        super(nombre, estatura);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
