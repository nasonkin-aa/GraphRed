/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shape;

import graphred.shape.BaseShape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author George
 */
public class PolygonShape extends BaseShape{
    Color shapeColor;
 
    Polygon shape;

    public PolygonShape(){
        this.shape = new Polygon();
    }

    @Override
    public void addCoordinate(int x, int y){
        shape.addPoint(x, y);
    }

    @Override
    public void putCanvasCoordinate(int x, int y) {
    }

    @Override
    public void paintShape(Graphics g) {
          
        g.setColor(shapeColor);
        g.drawPolygon(shape);

    }
    @Override
    public void setColor(Color color){
        
        this.shapeColor= color;
        
    }

    @Override
    public Shape getShape() {
        return shape;
    }
   
  
}