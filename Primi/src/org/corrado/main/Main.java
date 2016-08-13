package org.corrado.main;

import javax.swing.JFrame;

public class Main {

    
    public static void main(String[] args) {
        Gui gui=new Gui();
        gui.pack();
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

}
