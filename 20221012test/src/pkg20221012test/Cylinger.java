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
public class Cylinger extends Circle{
    private double height;
    Cylinger()
    {
        
    }
    Cylinger(double height)
    {
        this.height=height;
    }
    Cylinger(double height,double radius)
    {
        super(radius);
        
    }
    Cylinger(double height,double radius,String color)
    {
        
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
