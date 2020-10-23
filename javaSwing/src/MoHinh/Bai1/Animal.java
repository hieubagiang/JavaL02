/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.Bai1;

/**
 *
 * @author PhamDoanHieu
 */
public abstract class Animal {
    
    public Animal() {
    }

    public Animal(String name) {
        System.out.println("//Constructor from Animal");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    protected String name;
    public abstract void makeASound();
    public void introduce()
    {
        makeASound();
        System.out.println("Tôi là " + name);
    }
    public abstract void giveBirth();
 

}
