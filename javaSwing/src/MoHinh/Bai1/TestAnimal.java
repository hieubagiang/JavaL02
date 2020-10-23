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
public class TestAnimal {
    public static void main(String[] args) {
        Animal cow = new Cow("Lộc");        
        cow.introduce();
        Animal cat = new Cat("Hoan");
        cat.introduce();
        Dog dog = new Dog("Tuấn Anh");
        Animal dog2 = new Dog("Tuấn Anh");

        dog.introduce();
        
        System.out.println("Population of Cow is " + Cow.getPopulation());
        System.out.println("Population of Cat is " + Cat.getPopulation());
        System.out.println("Population of Dog is " + Dog.getPopulation());
        dog.giveBirth();
        dog=null;
        dog2=null;
        System.gc();
        System.out.println("Population of Dog is " + Dog.getPopulation());
    
    }
}
