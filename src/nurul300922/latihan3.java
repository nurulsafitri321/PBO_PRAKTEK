/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurul300922;

/**
 *
 * @author DELL
 */

import javax.swing.JOptionPane; 

public class latihan3 { 

 public static void main( String[] args ){ 
 String name = ""; 
 name = JOptionPane.showInputDialog("Please enter your name"); 
 
 String msg = "Hello " + name + "!"; 
 
 JOptionPane.showMessageDialog(null, msg); 
 
 }
}