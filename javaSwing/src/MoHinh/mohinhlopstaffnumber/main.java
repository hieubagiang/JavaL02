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
public class main {
    public static void main(String[] args) {
        Staff st=new Staff();
        Employee ty=new Employee("h2653", 200,"Thuận", "Hà NỘi", "00024563");
        st.addnumber(ty);
     
        Excecutive teo=new Excecutive(20, "e345", 0.15, "TIến", "Hà Nội", "024566");
   st.addnumber(teo);
 
    Hourly chuot=new Hourly(23, "H123", 0.1, "hải", "nghe an", "012345");
    st.addnumber(chuot);

    st.payday();
    }
    
}
