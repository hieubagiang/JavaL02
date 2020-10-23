/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.mohinhlopstaffnumber;
/**
 *
 * @author Win 8.1 Version 2
 */
public class Excecutive extends Employee{
    private double bonus;

    public Excecutive(double bonus, String socialSecurityNumber, double payRate) {
        super(socialSecurityNumber, payRate);
        this.bonus = bonus;
    }

    public Excecutive(double bonus, String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(socialSecurityNumber, payRate, name, address, phone);
        this.bonus = bonus;
    }

    public Excecutive(String socialSecurityNumber, double payRate) {
        super(socialSecurityNumber, payRate);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public void awardbonus(double exebones)
    {
        this.bonus=exebones;
        System.out.println("lãnh bonus: "+this.bonus);
        
    }

    @Override
    public int pay() {
    return super.pay()+(int) this.bonus;
    }
   
    
}
