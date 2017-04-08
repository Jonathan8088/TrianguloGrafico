/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jonathan
 */
public class PanelPuntos extends JPanel{

     private static final String ACEPTAR = "ACEPTAR";
    
    private JLabel coor1;
    
    private JLabel coor2;

    private JLabel coor3;

    private JLabel coor4;

    private JLabel coor5;

    private JLabel coor6;

    private PanelBotones panelAceptar;

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
    
    public PanelPuntos() {
        setBackground(Color.WHITE);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.GRAY));
        
       setLayout(new GridLayout(3,2));
        coor1 = new JLabel("Coordenada x1: ");
        add(coor1);
        setBackground(Color.WHITE);
        
        JTextField coordenadax1 = new JTextField(80);
        add(coordenadax1);
        setBackground(Color.WHITE);
        
        
        coor2 = new JLabel("Coordenada y1: ");
        add(coor2);
        setBackground(Color.WHITE);
        
        JTextField coordenaday1 = new JTextField(80);
        add(coordenaday1);
        setBackground(Color.WHITE);
        
        coor3 = new JLabel("Coordenada x2: ");
        add(coor3);
        setBackground(Color.WHITE);
        
        JTextField coordenadax2 = new JTextField(80);
        add(coordenadax2);
        setBackground(Color.WHITE);
        
        
        coor4 = new JLabel("Coordenada y2: ");
        add(coor4);
        setBackground(Color.WHITE);
        
        JTextField coordenaday2 = new JTextField(80);
        add(coordenaday2);
        setBackground(Color.WHITE);
        
        coor5 = new JLabel("Coordenada x3: ");
        add(coor5);
        setBackground(Color.WHITE);
        
        JTextField coordenadax3 = new JTextField(80);
        add(coordenadax3);
        setBackground(Color.WHITE);
        
        
        coor6 = new JLabel("Coordenada y3: ");
        add(coor6);
        setBackground(Color.WHITE);
        
        JTextField coordenaday3 = new JTextField(80);
        add(coordenaday3);
        setBackground(Color.WHITE);
        
        
        aceptar = new JButton("ACEPTAR");
        aceptar.setActionCommand(ACEPTAR);
       // aceptar.addActionListener(this);
        add(aceptar);
        setBackground(Color.WHITE);
    }
 
    
    
}
