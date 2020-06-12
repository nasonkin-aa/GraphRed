
package graphred;

import ColorsButton.BlueButton;
import graphred.instruments.CircleButton;
import graphred.instruments.LineButton;
import graphred.instruments.PolygonButton;
import graphred.instruments.RectangleButton;
import graphred.shape.PolyLine;
import graphred.shape.Queue;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GraphRed extends javax.swing.JFrame{
    
    JLabel jl;
    JFrame fr;
    MyCanvas jp;
    Queue q= new Queue();
    
    public GraphRed(){
       super("noviy graph red");
        this.setSize(800,800);
        fr= this;
        this.setVisible(true);
        this.setLayout(null);
        jl=new JLabel("Hello");
        jl.setVisible(true);
        jl.setBounds(30,30,100,20);
        jp = new MyCanvas(800,800,q);
        jp.setVisible(true);
        jp.setBounds(30,50,800,800);
        JTextField jt = new JTextField("dddd");
        jt.setVisible(true);
        jt.setBounds(130, 30,100,20);
        
        JButton kvad = new RectangleButton("Прямогольник");
        kvad.setBounds(430,30,200,20);
        kvad.setVisible(true);
        kvad.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(kvad instanceof RectangleButton)q.addShape(((RectangleButton)kvad).getShape());
                        
                    }
                }
            
        );
        
        JButton cir = new CircleButton("Элипс");
        cir.setBounds(630,30,200,20);
        cir.setVisible(true);
        cir.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(cir instanceof CircleButton)q.addShape(((CircleButton)cir).getShape());
                        
                    }
                }
            
        );
        
        JButton pol = new PolygonButton("Полигон");
        pol.setBounds(830,30,200,20);
        pol.setVisible(true);
        pol.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(pol instanceof PolygonButton)q.addShape(((PolygonButton)pol).getShape());
                        
                    }
                }
            
        );
        JButton siniy = new BlueButton("синий");
        siniy .setBounds(830,60,200,20);
        siniy .setVisible(true);
        siniy .addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                       q.getLastShape().setColor(Color.blue);
                       q.setCvetColor(Color.blue);
                        
                    }
                }
            
        );
        
        
        
        JButton jb = new LineButton("line");
        jb.setVisible(true);
        jb.setBounds(230, 30,200,20);
        jb.addActionListener ( 
        new ActionListener()
        {
             @Override
             public void actionPerformed(ActionEvent e){
                 if (jb instanceof LineButton) q.addShape(((LineButton)jb).getShape());
                 jl.setText("new Line"+q.getSize()+"generated");
                 fr.repaint();
             }
        });
        this.add(siniy);
        this.add(pol);
        this.add(cir);
        this.add(kvad);
        this.add(jp);
        this.add(jl);
        this.add(jb);
        this.add(jp);
        this.repaint();
        
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
    }
    public static void main(String[] args){
        GraphRed app =new GraphRed();
        app.setAlwaysOnTop(true);
        app.setEnabled(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
        
}
     
    
    
    

    
    

