/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul6;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
public class latihanmodul652 {
   
 public static void main(String[]args){
  String angka="";
  angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
  int z = Integer.valueOf(angka).intValue();
  
  String hasil ="";
  if (z>=1&&z<=10){
   hasil += "Valid number";
  }
  else{
   hasil += "Invalid Number";
  }
 JOptionPane.showMessageDialog(null, hasil);
 }
}


