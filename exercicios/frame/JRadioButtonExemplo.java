package exercicios.frame;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonExemplo extends JFrame {
    
    public JRadioButtonExemplo(){
        JRadioButton radio1 = new JRadioButton("Masculino");
        JRadioButton radio2 = new JRadioButton("Feminino");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        Container pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(2,1));
        pane1.add(radio1);
        pane1.add(radio2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(310,120);
        this.setResizable(false);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JRadioButtonExemplo janela = new JRadioButtonExemplo();
    }
}