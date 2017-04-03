/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Johans Gonzalez
 */
public class InrterfazTriangulo extends JFrame{
    
    private PanelImagen panelImagen;
    
    private PanelOpciones panelOpciones;
    
    private PanelBotones panelBotones;
    
    private PanelTriangulo panelTriangulo;
    
    public InrterfazTriangulo() {
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
    
}
