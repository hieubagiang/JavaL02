/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi14_MVC.models;

/**
 *
 * @author PhamDoanHieu
 */
public class LoginModel {
   private String user;
   private String password;

    @Override
    public String toString() {
        return "LoginModel{" + "user=" + user + ", password=" + password + '}';
    }

   
    public LoginModel(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
   
}
