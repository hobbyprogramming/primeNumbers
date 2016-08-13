package org.corrado.main;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Gui extends JFrame{
    private JPanel northPanel;
    private JPanel centerPanel;
    private JPanel southPanel;
    
    private JLabel intro;
    private JTextField nTxt;
    private JButton checkBtn;
    private JLabel resultLbl;
    private JLabel by;
    
    
    private long n;
    private String result;
    
    
    public Gui(){
        northPanel=new JPanel();
        centerPanel =new JPanel();
        southPanel=new JPanel();
        intro=new JLabel("This application can determine wether a number is prime or not.");
        by = new JLabel("Developed by Corrado Canepari and Gianmarco Morbelli");
        nTxt=new JTextField("Insert Number");
        nTxt.setSize(new Dimension(300, 10));
        checkBtn=new JButton("Check");
        resultLbl=new JLabel("Risutato");

        
        checkBtn.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                try{
                    n=Long.parseLong(nTxt.getText());
                    if(check(n))
                        result="The number is prime";
                    else
                        result="The number is not prime";
                    resultLbl.setText(result);
                    
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, "The Value you inserted is not a number");
                }
            }
        }
        );
        northPanel.add(intro, BorderLayout.NORTH);
        northPanel.add(by, BorderLayout.SOUTH);
        centerPanel.add(nTxt);
        centerPanel.add(checkBtn);
        southPanel.add(resultLbl, BorderLayout.NORTH);
        
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }
    public boolean check(long n){
        
        int divisori=0;
        for(int i=2;i<(n/2)+1;i++){
            if(n%i==0)
                divisori ++;
        }
        if(divisori>0)
            return true;
        else
            return false;
        
    }
}