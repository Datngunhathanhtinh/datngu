/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoSlie1;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DATLOCAC
 */
public class Demo {

    public Demo() {
        init();
    }
    public void init(){
        JFrame fr = new JFrame();
        fr.setSize(500,700);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.getContentPane().setBackground(Color.red);
    }
    public static void main(String[] args) {
        new Demo();
    }
            
}
