/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        
        Barrio barrio1 = new Barrio("Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenaria", ciudad3);
        
        Persona persona1 = new Persona("Miguel", "12113", barrio1);
        Persona persona2 = new Persona("Jesus", "12121312", barrio2);
        Persona persona3 = new Persona("Maria", "12121212", barrio3);
   
        
                
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());   
        
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
                
                
    }
}
