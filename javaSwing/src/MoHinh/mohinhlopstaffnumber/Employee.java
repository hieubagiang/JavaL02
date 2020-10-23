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
public class Employee extends StaffNumber{
    protected String socialSecurityNumber;
    protected double payRate;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public Employee(String socialSecurityNumber, double payRate) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    public Employee(String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString()+"- "+this.socialSecurityNumber+"-"+ this.payRate; 
        
    }

    @Override
    public int pay() {
   return 500;
    }
    
    
}
