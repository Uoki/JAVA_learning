/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class Point {
    private int x=0;
    private int y=0;
    public Point()
    {
        this.x=0;
        this.y=0;
    }
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public void setX(int x)
    {
        this.x=x;
    }
    public int getX()
    {
        return this.x;
    }
}
