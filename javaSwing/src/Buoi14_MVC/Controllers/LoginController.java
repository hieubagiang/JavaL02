/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi14_MVC.Controllers;

import Buoi14_MVC.models.LoginModel;
import Buoi14_MVC.views.LoginView;

/**
 *
 * @author PhamDoanHieu
 */
public class LoginController {
    LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
        view.getBtnLogin().addActionListener(al->btnLoginPerformed());
    }
    
    public void btnLoginPerformed()
    {
        LoginModel model = view.getModel();
        if(model.getUser().equals("admin") && model.getPassword().equals("123"))
        {
            System.out.println("đăng nhập thành công");
        }
        else
        {
            System.out.println("đăng nhập thất bại");
        }
    }
}
