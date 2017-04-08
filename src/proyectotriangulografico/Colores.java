/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

/**
 *
 * @author Jonathan
 */
public class Colores {
   
    /**
     * catributo que almacena el valor del color rojo
     */
    private int rojo;

    /**
     *atributo que almacena el valor del color verde 
     */
    private int verde;

    /**
     * atributo que almacena el valor del color aazul
     */
    private int azul;

    /**
     * consttructor de la clase
     * @param rojo
     * @param verde
     * @param azul 
     */
    
    
    public Colores(int rojo, int verde, int azul)
    {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }//Colores

    


 
/**
 * retorna el valor del color rojo
 * @return rojo
 */
    public int getRojo() {
        return rojo;
    }
/**
 * modifica el valor del color rojo
 * @param rojo 
 */
    public void setRojo(int rojo) {
        this.rojo = rojo;
    }
/**
 * retorna el valor del color verde
 * @return verde
 */
    public int getVerde() {
        return verde;
    }
/**
 * modifica el valor del color vere
 * @param verde 
 */
    public void setVerde(int verde) {
        this.verde = verde;
    }
/**
 * retorna el valor del color azul
 * @return azul
 */
    public int getAzul() {
        return azul;
    }
/**
 * modifica el valor del color azul
 * @param azul 
 */
    public void setAzul(int azul) {
        this.azul = azul;
    }
    
    
}
