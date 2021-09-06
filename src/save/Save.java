/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

/**
 *
 * @author oreho
 */
public class Save {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomePers hp = new HomePers();
        hp.rem.print();
        hp.tom.print();
        hp.viki.print();
        
        hp.saveFile();
        hp.outFile();
        
        hp.tom2.print();
        hp.viki2.print();
        hp.rem2.print();
    }
    
}
