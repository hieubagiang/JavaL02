
package MoHinh.mohinhlopstaffnumber;

public class Hourly extends Employee{
    private int hoursWorkly;

    public Hourly(int hoursWorkly, String socialSecurityNumber, double payRate) {
        super(socialSecurityNumber, payRate);
        this.hoursWorkly = hoursWorkly;
    }

    public Hourly(int hoursWorkly, String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(socialSecurityNumber, payRate, name, address, phone);
        this.hoursWorkly = hoursWorkly;
    }
    

    public Hourly(String socialSecurityNumber, double payRate) {
        super(socialSecurityNumber, payRate);
    }

    public int getHoursWorkly() {
        return hoursWorkly;
    }

    public void setHoursWorkly(int hoursWorkly) {
        this.hoursWorkly = hoursWorkly;
    }
    
    public void addHours(int moreHours)
    {
        this.hoursWorkly=moreHours;
    }

    @Override
    public int pay() {
        return super.pay()*50; 
    }

    @Override
    public String toString() {
        return super.toString()+"-"+this.hoursWorkly;
    }
    
}
