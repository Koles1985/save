/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author oreho
 */
public class HomePers {
    
    Dog tom = new Dog(10, 12, "spaniel", "Tom");
    Dog viki = new Dog(11, 15, "Spaniel", "Viki");
    Dog rem = new Dog(16, 32, "Labrador", "Rem");
    
    public void saveFile(){
        try{
            FileOutputStream fo = new FileOutputStream("My dog.ser");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(tom);
            oo.writeObject(viki);
            oo.writeObject(rem);
            oo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    Dog tom2 = null;
    Dog viki2 = null;
    Dog rem2 = null;
    Object one;
    Object two;
    Object three;
    public void outFile(){
        try{
            FileInputStream fis = new FileInputStream("My dog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            one = ois.readObject();
            two = ois.readObject();
            three = ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        tom2 =(Dog)one;
        viki2 = (Dog)two;
        rem2 = (Dog)three;
    }
}
