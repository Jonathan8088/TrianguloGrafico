/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

/**
 * Clase que representa un triangulo con sus operaciones
 * @author Johans Gonzalez
 */
public class Triangulo {
    
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Punto punto2;

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Punto punto3;
    
    
    /**
     * Guarda el perimetro del triangulo
     */
    private double perimetro;
/**
 * atributo que almacena el color de las lineas
 */    
    private Colores lineas;
/**
 * atributo que  almacena el color del fondo
 */    
    private Colores fondo;
/**
 * constructor de la clase
 * @param punto1
 * @param punto2
 * @param punto3
 * @param perimetro
 * @param lineas
 * @param fondo 
 */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        
    }//constructor

    

    
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        return true;
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    public double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    
    public double darAltura( )
    {
        double area = darArea( );
        double base = darLado1( );
        double altura = ( area / base ) * 2;
        return altura;
    }
    
    /**
     * Metodo que retorna el tipo de triangulo
     * @return Tipo de triangulo
     */
    public String darTipoTriangulo() {
        return "";
    }

    
    /**
     * Retorna la cordenada x1 y1
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }

    /**
     * Modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /**
     * Retorna la cordenada x2 y2
     * @return 
     */    
    public Punto getPunto2() {
        return punto2;
    }

    /**
     * Modifica la cordenada x2 y2
     * @param punto1 
     */    
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /**
     * Retorna la cordenada x3 y3
     * @return 
     */    
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Modifica la cordenada x3 y3
     * @param punto1 
     */    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
/**
 * retorna el valor del perimetro
 * @return perimetro
 */
    public double getPerimetro() {
        return perimetro;
    }
/**
 * modifica el valor del perimetro
 * @param perimetro 
 */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
/**
 * retorna el valor de las lineas
 * @return lineas
 */
    public Colores getLineas() {
        return lineas;
    }
/**
 * modifica el valor de las lineas
 * @param lineas 
 */
    public void setLineas(Colores lineas) {
        this.lineas = lineas;
    }
/**
 * retirna el valor del color del fondo
 * @return fondo
 */
    public Colores getFondo() {
        return fondo;
    }
/**
 * modifica el valor del color del fondo
 * @param fondo 
 */
    public void setFondo(Colores fondo) {
        this.fondo = fondo;
    }
    
    
        
    
}
