/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primes.Util;
import java.util.Scanner;
import Main.Interface;
import javax.swing.JTextField;
/**
 *
 * @author corrado
 */
public class Util 
{
    

/**
 *
 * @author Corrado Canepari
 * @author Gianmarco Morbelli
 * The following application can determine wether a number is prime or not
 */
/**
 * 
     * @param string
 * @return x: Value you want to check
 */
public static int getX(JTextField yTxt)
{
   
   String xTxt=yTxt.getText();
   int x = Integer.valueOf(xTxt);
   //TODO find method to parse from string to int in JLabel
   return x;
}
/**
 * 
 * @param x, the number you want to check
 * @param i, the minimum nuber x is going to be devided by, or the start of the cycle
 * @param divisori, the number of i's by which the x is divisible
 * @return divisori: the number of i's by which the number is divisible
 */
public static int getDivisori(int x, int i, int divisori)
{
    for(i=2; i<=(x/2); i++)
    {
        if (x%i==0)
        {
            divisori++;
        }
        else{}
    }
    return divisori;
}
/**
 * 
 * @param divisori, number of parameters by which x is divisible
 * @return isPrime, boolean which indicates wether a number is prime or not
 */
public static Boolean isPrime(int divisori)
{
    boolean b=(divisori<=0?true:false);
    return b;
    
}
    
    }

