/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorsButton;

import graphred.shape.Queue;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author andr
 */
public class BlueButton extends BaseColorButton {
    public BlueButton(String name){
        super(name);
       
    }
    @Override
    public Color getColor(){
        return Color.BLUE;
    }
       
}
