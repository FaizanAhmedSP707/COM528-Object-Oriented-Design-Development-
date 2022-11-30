/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloworld;
import java.util.Scanner;
/**
 *
 * @author AhmedWK
 */
public class HelloWorld {

    //Environment check
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Start of week 1 activities
        //Storing student details using variables
        String studentName;
        String studentCourse;
        double studentMark;
        String markToDouble;
        Scanner scanInput = new Scanner(System.in);
        
        //Creating a loop to display details of 5 students, one after the other
        for(int i=0; i<5; i++)
        {
            System.out.println("Please enter your name:");
            studentName = scanInput.nextLine();
    
            System.out.println("\nPlease enter your course name:");
            studentCourse = scanInput.nextLine();
        
            System.out.println("\nPlease enter the overall mark you have received: ");
            markToDouble = scanInput.nextLine();
        
            //Parse string data to actual double
            studentMark = Double.parseDouble(markToDouble);
        
            //Checking the student mark that was inputted (exercise 3)
            if(studentMark < 0 || studentMark >100)
            {
                System.out.println("\nThe mark submitted is invalid!");
            }
        
            //Finally print all the entered details:
            System.out.println("\nName: "+studentName+", Course: "+studentCourse+", Mark: "+studentMark+"\n");
        }
    }
}
