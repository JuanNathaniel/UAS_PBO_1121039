/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.Controller.getAllUsers;
import Model.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author TUF GAMING
 */
public class MenuLihatData {
    JFrame frame;
    JTable table;
    JLabel text;
    JButton back;
    public MenuLihatData(){
        frame = new JFrame();
        frame.setSize(800, 500);
        
        String temp="";
        ArrayList<User> listUser = getAllUsers();
        for (int i = 0; i < listUser.size(); i++) {
            temp += listUser.toString()+"\n";
        }
        text = new JLabel(temp);
        text.setBounds(10, 270, 20000, 100);
        frame.add(text);
        
        back = new JButton("Back");
        back.setBounds(470, 240, 100, 40);
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MainMenu();
            }

        });
        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
