/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoSlie1;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;

/**
 *
 * @author DATLOCAC
 */
public class Demo1AWT extends Frame implements ActionListener{
   
    Button btnYellow ,btnRed ;
    Label label = new Label();
    
    public Demo1AWT (String msg){
        setTitle(msg);
        setLayout(new FlowLayout());
        btnYellow = new Button("Yellow");
        btnRed = new Button("Red");
        add(btnYellow);
        add(btnRed);
        add(label);
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if(str.equals("Yellow")){
        label.setText("Ban chon button mau vang");
        this.setBackground(Color.yellow);
        }
        if(str.equals("Red")){
        label.setText("Ban da chon button do");
        this.setBackground(Color.RED);
        }
    }
    public static void main(String[] args) {
        Demo1AWT dm1 = new Demo1AWT("AWT fpoly");
                dm1.setSize(700,200);
               
                dm1.show();
      

                }
}
