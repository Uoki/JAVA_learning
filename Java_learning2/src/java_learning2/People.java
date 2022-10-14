/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_learning2;

/**
 *
 * @author user
 */
public class People {
    private String name;
    People(String name)
    {
        this.name=name;
    }
    private void talk(People a)
    {
        a.name=a.name+"王八蛋";
    }
}
