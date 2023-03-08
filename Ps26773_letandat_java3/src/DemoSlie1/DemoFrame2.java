/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoSlie1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author DATLOCAC
 */
public class DemoFrame2 extends WindowAdapter implements   WindowListener{
    JFrame fr; 
    public DemoFrame2() {
        fr = new JFrame("Dat ngu");
        fr.setSize(300,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.addWindowFocusListener(this);
        
    }
    public void windowClose(){
    
    }
    
     public static void main(String[] args) {
        DemoFrame2 dfr = new DemoFrame2 ();
        
    }
}
