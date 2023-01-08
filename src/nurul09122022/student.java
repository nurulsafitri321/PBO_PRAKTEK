/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurul09122022;

/**
 *
 * @author DELL
 */
public class student extends person{
    public student(){
        super("Ali","Padang");
        System.out.println("                ");
    }
    
  public String getName(){
  System.out.println("Student: getName");
  return name; 
  }
    
    public static void main(String[] args){
    student Student = new student();
    System.out.println(Student.getName());
    System.out.println(Student.getAddress());
    }
}
