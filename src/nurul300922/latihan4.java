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

public class latihan4 {
    
    public static void main( String[] args ){
        
 int angka1 = 0;
 int angka2 = 0;
 int jumlah = 0;
 
 angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-1"));
 angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-2"));
 
 jumlah = angka1 + angka2;
 
 JOptionPane.showMessageDialog(null, "Jumlah = " + jumlah);
 }
}