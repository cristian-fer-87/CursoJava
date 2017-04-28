/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
//Se importa para poder usar Listas
import java.util.List;

/**
 *
 * @author sistemate
 */
public class Persona {
    private String nombre;
    private double estatura;
    private CuentaCorriente cuenta;
    private List<Mascota> mascotas;
    private Persona padre;

    /**
     * Este es un Constructor con parámetros para inicializar las variables
     * @param nombre
     * @param estatura
     * @param cuenta 
     */
    public Persona(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }
    
    /**
     * Este es un constructor vacío, es decir el constructor por defecto
     */
    public Persona() {
    }

    //*****Métodos Getters and Setters de cada atributo de la clase******//
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }
    
    public String soyMasAltoQue(Persona p){
        String retorno = "";
        if(this.estatura > p.getEstatura()){
            retorno = "Yo "+this.nombre+" soy mas alto que "+p.getNombre();
        }else{
            retorno = "Yo "+this.nombre+" soy mas bajo que "+p.getNombre();
        }
        return retorno;
    }
    
    public String presentacion(){
        String retorno = "Me llamo "+this.nombre+" tengo "+
                this.mascotas.size()+" mascotas y mi Padre es "+
                this.padre.getNombre();
        return retorno;
    }
    
    public String pruebaExcepcion(){
        String retorno = "";
        try {
            retorno = "el resultado de 20/2 es: "+20/0;//No se puede dividir por cero.
        } catch (Exception e) {
            System.out.println("Hubo un error.");
        } 
        finally{
            System.out.println("Esto se ejecuta siempre");
        }
        return retorno;
    }
}
