/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.mohinhoopMamal;
import java.util.ArrayList;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Testperson {

    public static void main(String[] args) {
        ArrayList<Person> dsPerson = new ArrayList<Person>();
        Person an = new Man();
        an.setFirstName("AN");

        Person hong = new Woman();
        hong.setFirstName("Hằng");
        ((Woman) hong).setWearingMakup(true);

        dsPerson.add(an);
        dsPerson.add(hong);
        for (Person p : dsPerson) {
            if (p instanceof Man) {
                System.out.println(p.getFirstName() + " là  Nam");
            } else if (p instanceof Woman) {
                System.out.println(p.getFirstName() + " là nũ");
            }
        }
    }

}
