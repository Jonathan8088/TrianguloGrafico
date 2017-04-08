/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Johans Gonzalez
 */
public class PanelOpciones extends JPanel implements ActionListener{
 
    private JButton btnOpcion1;
    
    private JButton btnOpcion2;
    
    private JButton btnOpcion3;
    
    private static final String OPCION_1 = "Puntos Cuadrado";
    
    private static final String OPCION_2 = "Puntos Circulo";
    
    private static final String OPCION_3 = "Puntos Triangulo";
    
        
    public PanelOpciones() {    
        
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("OPCIONES"));
        setLayout(new GridLayout(1, 3));
        
        btnOpcion1 = new JButton("Puntos Cuadrado");
        btnOpcion1.setActionCommand(OPCION_1);
        btnOpcion1.addActionListener(this);
        add(btnOpcion1);
        
        btnOpcion2 = new JButton("Puntos Circulo");
        btnOpcion2.setActionCommand(OPCION_2);
        btnOpcion2.addActionListener(this);
        add(btnOpcion2);
        
        btnOpcion3 = new JButton("Puntos Circulo");
        btnOpcion3.setActionCommand(OPCION_3);
        btnOpcion3.addActionListener(this);
        add(btnOpcion3);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case OPCION_1:
                System.out.print("Imprimio boton 1");
                break;
            case OPCION_2:
                System.out.print("Imprimio boton 2");
                break;
        }
    }
    
}
