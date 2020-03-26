/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoppingbunnies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author revle
 */
public class HoppingBunnies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bunny bunny1 = new Bunny(10);
        Bunny bunny2 = new Bunny(14);
        Bunny bunny3 = new Bunny(20);
        List<Bunny> listOfBunnies = new ArrayList();
        listOfBunnies.add(bunny1);
        listOfBunnies.add(bunny2);
        listOfBunnies.add(bunny3);
        for(int i=0;i<listOfBunnies.size();i++){
            Bunny temp = listOfBunnies.get(i);
            temp.hop();
        }
        
        System.out.println("***Printing hop of Bunnies with Iterator***");
        Iterator<Bunny> iterator = listOfBunnies.iterator();
        while(iterator.hasNext()){
            Bunny tempBunny = iterator.next();
            tempBunny.hop();
        }
        
    }
    
}
