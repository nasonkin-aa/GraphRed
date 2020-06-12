/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;

/**
 *
 * @author andr
 */
public abstract class BaseShape {
    public abstract void addCoordinate(int x, int y);
    public abstract void putCanvasCoordinate(int x,int y);
    public abstract void paintShape(Graphics g);
    public abstract void setColor(Color color);
    public abstract Shape getShape();

    

    }
        
    
    

