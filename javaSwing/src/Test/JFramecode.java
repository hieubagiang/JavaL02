/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JFramecode extends JFrame implements ActionListener{

    //private JFrame frame;
    JButton okButton, exitButton, cancelButton;
    public JFramecode() {
    createAndShow();
    }

    private void createAndShow() {
        
        okButton = new JButton("Ok");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");
        
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        add(okButton);
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);
        okButton.setMnemonic('o');
        okButton.setToolTipText("Press Ok to verify");
        add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
        
        add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        
        setLayout(new FlowLayout());
        //pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        JFramecode jFramecode = new JFramecode();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if("ok".equals(ae.getActionCommand()))
        {
            JOptionPane.showMessageDialog(this, "Just Press Ok");
        }
        if("exit".equals(ae.getActionCommand()))
        {
            System.exit(0);
        }
        if("cancel".equals(ae.getActionCommand()))
        {
            JOptionPane.showConfirmDialog(this, "Bạn có muốn hủy không?");
        }
        
    }
}

