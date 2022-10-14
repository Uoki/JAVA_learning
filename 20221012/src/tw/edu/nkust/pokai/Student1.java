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
public class Student1 extends People{
    String sid;
    
    
    public Student1()
    {
        
    }
    
    public Student1 (String name,int age ,String sid)
    {
        super(name,age);
        this.sid=sid;
    }
    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    public void getAge(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
