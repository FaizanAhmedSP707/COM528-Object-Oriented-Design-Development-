/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author AhmedWK
 */
public class Student {
    private String stId;
    private String name;
    private String course;
    private double mark;
    
    public Student(String idIn, String nameIn, String courseIn, double markIn)
    {
        this.stId = idIn;
        this.name = nameIn;
        this.course = courseIn;
        this.mark = markIn;
    }
    
    public void printDetails()
    {
        System.out.println("Name: " + this.name + ", Course: " + this.course + ", Mark: " + this.mark);
    }
}
