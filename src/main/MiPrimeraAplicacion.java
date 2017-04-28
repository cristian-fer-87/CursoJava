/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//Importamos la clase Persona
import java.util.LinkedList;
import java.util.List;
import modelo.Empleado;
import modelo.Mascota;
import modelo.Persona;

/**
 *
 * @author sistemate
 */
public class MiPrimeraAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el objeto unaPersona que es del tipo Persona
        //No tienen modificador de acceso porque estan dentro de un metodo estático.
        Persona unaPersona;
        Persona otraPersona;
        
        //Creamos los objetos mascota.
        Mascota unaMascota = new Mascota();
        Mascota otraMascota = new Mascota();
        
        //Instanciamos el objeto Persona haciendo uso del constructor con parámetros.
        unaPersona = new Persona("Juan", 1.78);
        
        //Instanciamos el objeto Persona haciendo uso del constructor sin parámetros.
        otraPersona = new Persona();
        //Vamos mutando el objeto.
        otraPersona.setNombre("Eduardo");
        otraPersona.setEstatura(1.85);
        
        //Seteamos los nombres de las mascotas
        unaMascota.setNombre("Perro");
        unaMascota.setNombre("Gato");
        
        //Creamos una lista vacía, para ello usamos new LinkedList()
        List<Mascota>mascotas = new LinkedList();
        
        //agregamos a la lista vacía las dos mascontas, con add
        mascotas.add(unaMascota);
        mascotas.add(otraMascota);
        
        //definimos que unaPersona va a ser el padre de otraPersona
        otraPersona.setPadre(unaPersona);
        otraPersona.setMascotas(mascotas);
  
        //System.out.println("Hola soy "+otraPersona.getNombre());
        //System.out.println(otraPersona.soyMasAltoQue(unaPersona));
        //System.out.println(otraPersona.presentacion());
        
        Empleado empleado = new Empleado("Gerente", 2500.00, "Esteban", 1.80);
        //System.out.println("Soy "+empleado.getNombre()+" y gano $"+empleado.getSueldo());
        
        System.out.println(empleado.pruebaExcepcion());
    }
    
}
