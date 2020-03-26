/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoppingbunnies;

/**
 *
 * @author revle
 */
public class Bunny {
    private int bunnyNumber;
    
    public Bunny(int bunnyNumber){
        this.bunnyNumber = bunnyNumber;
    }
    
    public void hop(){
        System.out.println("Hello i m hopping and my number is:"+bunnyNumber);
    }
    
}
