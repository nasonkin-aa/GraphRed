/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.util.ArrayList;

/**
 *
 * @author andr
 */
public class PolyLineShape extends BaseShape {
    PolyLine shape; 
    Color shapeColor;

    public PolyLineShape(){
       this.shape = new PolyLine();
     
}
    
    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public void addCoordinate(int x, int y) {
       this.shape.addCoordinate(x,y);
    }

    @Override
    public void putCanvasCoordinate(int x, int y) {
        this.shape.putCanvasCoordinate(x,y);
    }

    @Override
    public void paintShape(Graphics g) {
       g.setColor(shapeColor);
       g.drawPolyline(shape.getX(),shape.getY(),shape.getSize());
       
    }

    @Override
    public void setColor(Color color) {
        this.shapeColor = color;
       
    }
    
}
