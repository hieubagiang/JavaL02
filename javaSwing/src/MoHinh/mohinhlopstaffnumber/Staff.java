/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.mohinhlopstaffnumber;

import java.util.ArrayList;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Staff {
//private ArrayList<StaffNumber> stafflist=new ArrayList<StaffNumber>();
   private ArrayList<StaffNumber> stafflist=new ArrayList<>();

    public Staff() {
    }

      public Staff(ArrayList<StaffNumber> stafflist) {
        this.stafflist = stafflist;
    }

    public ArrayList<StaffNumber> getStafflist() {
        return stafflist;
    }

    public void setStafflist(ArrayList<StaffNumber> stafflist) {
        this.stafflist = stafflist;
    }
   public void addnumber(StaffNumber sm)
   {
       stafflist.add(sm);
   }
public void payday()
{
    for (StaffNumber staffNumber : stafflist) {
        System.out.println(staffNumber);
        
    }
  
}

    

}
  

    

