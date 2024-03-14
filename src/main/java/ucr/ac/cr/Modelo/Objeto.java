/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Modelo;

/**
 *
 * @author Usuario
 */
public class Objeto {
    
   private int    id; 
   private String nombre;

    //Metodo Constructor - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public Objeto(int newId, String newNombre) {
       this.id = newId;
       this.nombre = newNombre;
    }

    // set y get - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   //metodo toString - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    @Override
    public String toString() {
        return "Objeto" + "id=" + id + ", nombre=" + nombre;
    }
       
}//Fin de la clase
