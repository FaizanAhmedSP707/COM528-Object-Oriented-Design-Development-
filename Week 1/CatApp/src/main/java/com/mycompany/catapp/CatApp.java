/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.catapp;

/**
 *
 * @author AhmedWK
 */
public class CatApp {

    public static void main(String[] args) {
        Cat clyde = new Cat("Clyde", 2, 5);
        Cat binnie = new Cat("Binnie", 5, 4);
        
        clyde.display();
        binnie.display();
        
        clyde.walk();
        binnie.walk();
        
        clyde.display();
        binnie.display();
        
        clyde.walk();
        clyde.display();
        
        //Extension of code to perform task 7
        Cat flathead = new Cat("Flathead", 7, 10);
        Cat cupra = new Cat("Cupra", 2, 7);
        
        System.out.print("\n\n\n");
        
        flathead.display();
        flathead.eat();
        flathead.eat();
        flathead.display();
        
        System.out.println("\n");
        
        cupra.display();
        cupra.walk();
        cupra.walk();
        cupra.walk();
        cupra.walk();
        cupra.display();
    }
}
