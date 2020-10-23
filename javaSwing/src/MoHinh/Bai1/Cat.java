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
public class Cat extends Animal{

      public static int population=0;
    public Cat(String name) {
        super(name);
        System.out.println("//Constructor from Cat");
        population++;
    }

    public static int getPopulation() {
        return population;
    }

    

    @Override
    public void makeASound() {
        System.out.print("Meow meow ");
    }
    @Override
    public void giveBirth() {
        System.out.println(name +"‘s baby");
    }
    
      @Override
    public void finalize() throws Throwable  {
          
          try {
              population--;
          } finally {
              super.finalize();
          }
          
    }
    
}
