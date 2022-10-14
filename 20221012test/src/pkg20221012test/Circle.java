/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20221012test;

/**
 *
 * @author user
 */
public class Circle {
    private double radius;
    private String color;
    double area;
    Circle()
    {
        this.color="red";
        this.radius=1.0;
    }
    
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius,String color)
    {
        this.color=color;
        this.radius=radius;
    }
    
    public String toString()
    {
        return "sadsad";
    }
    
    public double getArea() {
        return this.radius*this.radius*3.1415926;
    }
    
    
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
