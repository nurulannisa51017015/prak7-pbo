/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author User
 */
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
public class Latihan1 extends JFrame{
    JButton nButton = new JButton("North");
    JButton sButton = new JButton("South");
    JButton eButton = new JButton("East");
    JButton wButton = new JButton("West");
    JButton cButton = new JButton("Center");
    
    public Latihan1(){
        super("Border Layout Beraksi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
     add(nButton, BorderLayout.NORTH);
     add(sButton, BorderLayout.SOUTH);
     add(eButton, BorderLayout.EAST);
     add(wButton, BorderLayout.WEST);
     add(cButton, BorderLayout.CENTER);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan1 frame = new Latihan1();
        frame.setVisible(true);
    }
}
