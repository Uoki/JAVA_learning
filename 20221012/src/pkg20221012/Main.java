/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20221012;




/**
 *
 * @author user
 */


import tw.edu.nkust.pokai.*;
import tw.edu.nkust.pokai.People;
import tw.edu.nkust.pokai.Student;
import tw.edu.nkust.pokai.Teacher;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Student C109156226;
        C109156226 = new Student();
        C109156226.setName("黃柏凱");
        C109156226.setAge(20);
        C109156226.setSid("C109156226");
        
        Teacher 謝文川;
        謝文川 = new Teacher();
        謝文川.setAge(40);
        謝文川.setName("謝文川");
        謝文川.setTid("8064");
        
        Teacher1 孫家冰=new Teacher1("孫家冰",20,"KKK6278964");
        System.out.println(孫家冰.getAge());
    }
    
}
