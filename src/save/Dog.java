/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

import java.io.Serializable;

/**
 *
 * @author oreho
 */
public class Dog implements Serializable{
    
    int age = 0;
    int kg = 0;
    String bread = null;
    String name = null;
    
    public Dog(int a, int k, String b, String n){
        age = a;
        kg = k;
        bread = b;
        name = n;
    }
    
    public void print(){
        System.out.println("Собака - " + name + " возраст - " + age + " вес - "
        + kg + " порода - " + bread);
    }
    
}
