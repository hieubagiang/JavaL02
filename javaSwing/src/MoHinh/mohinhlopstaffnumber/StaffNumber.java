
package MoHinh.mohinhlopstaffnumber;

public abstract class StaffNumber {
    protected  String name;
    protected  String address;
    protected  String phone;

    public StaffNumber() {
    }

    public StaffNumber(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Tên: "+ this.getName()+", địa chỉ: "+this.getAddress()+", số điện thoại: "+this.getPhone();
    }
    public abstract int pay();
    
    
}
