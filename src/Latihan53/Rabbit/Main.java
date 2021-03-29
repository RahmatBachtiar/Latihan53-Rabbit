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
public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "
                +rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "
                +rabbit.getNoOfLegs()+" legs.");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());

    
    }
    
}
