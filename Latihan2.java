/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
/**
 *
 * @author User
 */
public class Latihan2 extends JFrame{

    public Latihan2(){
     FlowLayout  flowLayout= new FlowLayout(FlowLayout.CENTER, 5, 10);
        Container container = getContentPane();
        container.setLayout(flowLayout);
        
        container.add(new JButton("Tombol 1"));
        container.add(new JButton("Tombol 2"));
        container.add(new JButton("Tombol 3"));
        container.add(new JButton("Tombol 4"));
        container.add(new JButton("Tombol 5"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan2 jendela = new Latihan2();
        jendela.setTitle("kelas DemoFlowLayout");
        jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jendela.setSize(390, 120);
        jendela.setVisible(true);

    }
    
}
