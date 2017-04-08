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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class PanelBotones extends JPanel implements ActionListener{
    
    private static final String PUNTOS = "PUNTOS";
    
    private static final String COLOR_LINEA = "COLOR_LINEA";
    
    private static final String COLOR_FONDO = "COLOR_FONDO";
    
    private JButton btnPuntos;
    
    private JButton btnColorLinea;
    
    private JButton btnColorFondo;
    
    private JLabel etiquetaArea;
    
    private JLabel etiquetaPerimetro;
    
    private JLabel etiquetaAltura;
        
    public PanelBotones() {
        
        setLayout(new GridLayout(6, 1));
        setBackground(Color.WHITE);
        
        btnColorLinea = new JButton("Cambiar Lineas");
        btnColorLinea.setActionCommand(COLOR_LINEA);
        btnColorLinea.addActionListener(this);
        add(btnColorLinea);
        
        btnColorFondo = new JButton("Cambiar Fondo");
        btnColorFondo.setActionCommand(COLOR_FONDO);
        btnColorFondo.addActionListener(this);
        add(btnColorFondo);
        
        btnColorFondo = new JButton("Cambiar Puntos");
        btnColorFondo.setActionCommand(PUNTOS);
        btnColorFondo.addActionListener(this);
        add(btnColorFondo);
        
        etiquetaArea = new JLabel("Area: ");
        add(etiquetaArea);
        
        etiquetaPerimetro = new JLabel("Perimetro: ");
        add(etiquetaPerimetro);

        etiquetaAltura = new JLabel("Altura: ");
        add(etiquetaAltura);
        
    }

    public void cambiarInformacion( double perimetro, double area, double altura )
    {
        etiquetaArea.setText( "Área: " + ( area )  );
        etiquetaPerimetro.setText( "Perímetro: " + ( perimetro ) );
        etiquetaAltura.setText( "Altura: " + ( altura )  );
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case COLOR_LINEA:
                DialogoPuntos d= new DialogoPuntos();
            case COLOR_FONDO:
                System.out.print("Imprimio boton color fondo");
                break;        
            case PUNTOS:
                System.out.print("Imprimio boton puntos");
                break;
        }
     
    }
    
}
