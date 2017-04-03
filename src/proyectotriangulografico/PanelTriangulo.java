/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class PanelTriangulo extends JPanel{
    
   
    public PanelTriangulo () {
        setBackground(Color.GRAY);
        Dimension d = getSize();
        System.out.print(d.getHeight() + " " + d.getWidth());       
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
                        
        Polygon polygon = new Polygon();
        polygon.addPoint(getHeight() / 2 + 1, getWidth() / 2 + 1);
        polygon.addPoint(30, 0);
        polygon.addPoint(30, 30);
        
        g.setColor(Color.red);
        g.drawPolygon(polygon);
        
    }
    
}
