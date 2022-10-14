/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.nkust.pokai;

/**
 *
 * @author user
 */
public class Teacher1 extends People{
    private String tid;

    
    public Teacher1()
    {
        
    }
    
    public Teacher1 (String name,int age ,String tid)
    {
        super(name,age);
        this.tid=tid;
    }
    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(String tid) {
        this.tid = tid;
    }
}
