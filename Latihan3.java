/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Latihan3 extends JFrame{
    JButton marcia = new JButton("Marcia");
     JButton carol = new JButton("Carol");
    JButton greg = new JButton("Greg");
    JButton jan = new JButton("Jan");
    JButton alice = new JButton("Alice");
    JButton peter = new JButton("Peter");
    JButton cindy = new JButton("Cindy");
    JButton mike = new JButton("Mike");
    JButton bobby = new JButton("Bobby");
    
public Latihan3(){
    super("  Grid Layout Beraksi ");
    setSize(260, 260);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
    GridLayout family = new GridLayout(3, 3, 10, 10);
    pane.setLayout(family);
    pane.add(marcia); 
     pane.add(carol); 
      pane.add(greg); 
       pane.add(jan); 
        pane.add(alice); 
         pane.add(peter); 
          pane.add(cindy);  
          pane.add(bobby); 
          add(pane);
          setVisible(true);
    
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan3 frame = new Latihan3();
    }
    
}
