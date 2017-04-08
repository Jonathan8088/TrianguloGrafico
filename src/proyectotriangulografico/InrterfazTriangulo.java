/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author Johans Gonzalez
 */
public class InrterfazTriangulo extends JFrame{
    
    private Triangulo triangulo;
    
    private DialogoPuntos dialogoPuntos;
    
    private PanelImagen panelImagen;
    
    private PanelOpciones panelOpciones;
    
    private PanelBotones panelBotones;
    
    private PanelTriangulo panelTriangulo;
    
    
    public InrterfazTriangulo() {
        
       
    
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(0, 0);
        Punto punto3 = new Punto(0, 0);
        triangulo = new Triangulo(punto1, punto2, punto3);
     
        Colores colorRelleno = new Colores( 0, 0, 170);
       

        
        setTitle("PROGRAMA TRIANGULO");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());        
        
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(  );
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones(  );
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    public void cambiarPuntos( )
    {
        dialogoPuntos = new DialogoPuntos( this );
        dialogoPuntos.setVisible( true );
        setEnabled( false );
    }
    
    public void cambiarColorFondo( )
    {
        Color colorActual = new Color( triangulo.getFondo().getRojo(), triangulo.getFondo().getVerde(), triangulo.getFondo().getAzul());
        Color nuevoColor = JColorChooser.showDialog( this, "Color Fondo", colorActual );
        if( nuevoColor != null )
        {
            //Cambia los valores
            triangulo.getFondo().setRojo(nuevoColor.getRed( ) );
            triangulo.getFondo( ).setVerde(nuevoColor.getGreen( ) );
            triangulo.getFondo( ).setAzul(nuevoColor.getBlue( ) );
        }
        repintar( );
    }
    
    public void repintar( )
    {
        panelTriangulo.repaint( );
        panelBotones.cambiarInformacion( triangulo.getPerimetro(), triangulo.darArea(),triangulo.darAltura());
    }
}
