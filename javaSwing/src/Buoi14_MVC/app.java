/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi14_MVC;

import Buoi14_MVC.Controllers.LoginController;
import Buoi14_MVC.views.LoginView;

/**
 *
 * @author PhamDoanHieu
 */
public class app {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController loginController = new LoginController(view);
    }
}
