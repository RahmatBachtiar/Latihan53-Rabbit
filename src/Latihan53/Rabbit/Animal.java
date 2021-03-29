/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan53.Rabbit;

/**
 *
 * @author 
 * NAMA     : Rahmat Bachtiar
 * KELAS    : FS112B-PBO
 * NIK      : 2022431598
 * Deskripsi Program	: Program ini berisi program untuk
 * membuat output rabbit bukan vegetarian, memakan rumput, memilii 4 kaki dan
 * berwarna gray
 */
public class  Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal (boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
        
    }
        
    
        public boolean isVegetarian(){
            return vegetarian;
        }
        public String getEats(){
            return eats;
        }
        public int getNoOfLegs(){
            return noOfLegs;
        }

    
}
