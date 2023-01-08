/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurul28102022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class latihan3_1 {
    public static void main(String [] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
                int[] ages = new int [10];
                int max = -999;
                try{
                  for (int i = 0; i < ages.length; i++)
                  {
                      System.out.print("Masukkan angka" +(i+1)+"=");
                      ages[i] = Integer.parseInt(dataIn.readLine());
                     
                  }
                }catch(Exception e){
                }
                
                System.out.print("Nilai array ages :");
                for (int i = 0; i < ages.length; i++){
                    if(ages[i]>max)
                    {
                        max = ages[i];
                    }
                }
                System.out.println(max);
    }
}
