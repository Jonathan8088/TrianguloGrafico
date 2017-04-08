/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Johans Gonzalez
 */
public class DialogoPuntos extends JDialog implements ActionListener{

    private static final String ACEPTAR = "ACEPTAR";
    
    private JLabel coor1;
    
    private JLabel coor2;

    private JLabel coor3;

    private JLabel coor4;

    private JLabel coor5;

    private JLabel coor6;

    private Triangulo triangulo;

/**
 * atributo que contiene la coordenada x1
 */    
    private JTextField coordenadax1;
/**
 * atributo que contiene la coordenada y1
 */   
    private JTextField coordenaday1;
/**
 * atributo que contiene la coordenada x2
 */    
    private JTextField coordenadax2;
/**
 * atributo que contiene la coordenada y2
 */    
    private JTextField coordenaday2;
/**
 * atributo que contiene la coordenada x3
 */    
    private JTextField coordenadax3;
/**
 * atributo que contiene la coordenada y3
 */    
    private JTextField coordenaday3;
    
    private JButton aceptar;
    
    private InrterfazTriangulo control;
    
    public DialogoPuntos(InrterfazTriangulo control) {
        this.control = control;
        JDialog ventana1 = new JDialog();
        setTitle("RECIBIR COORDENADAS");
        setSize(400, 400);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        add( new JLabel( "Punto" ) );
        add( new JLabel( "Coordenadas X" ) );
        add( new JLabel( "Coordenadas Y" ) );
        
        add( new JLabel( "Primer punto:" ) );
        coordenadax1 = new JTextField( Double.toString( triangulo.getPunto1().getX()) );
        add( coordenadax1 );
        coordenaday1 = new JTextField( Double.toString( triangulo.getPunto1().getY()) );
        add( coordenaday1 );
        
        add( new JLabel( "Segunfo punto:" ) );
        coordenadax2 = new JTextField( Double.toString( triangulo.getPunto2().getX()) );
        add( coordenadax2 );
        coordenaday2 = new JTextField( Double.toString( triangulo.getPunto2().getY()) );
        add( coordenaday2 );
        
        add( new JLabel( "Tercer punto:" ) );
        coordenadax3 = new JTextField( Double.toString( triangulo.getPunto3().getX()) );
        add( coordenadax3 );
        coordenaday3 = new JTextField( Double.toString( triangulo.getPunto3().getY()) );
        add( coordenaday3 );
        
        add( new JLabel( ) );
        add( new JLabel( ) );
        add( new JLabel( ) );
        
         aceptar = new JButton( "Aceptar" );
        aceptar.setActionCommand( ACEPTAR );
        aceptar.addActionListener((ActionListener) this);
        add( aceptar );
        
    }

    DialogoPuntos() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
}

    

    
    
    

