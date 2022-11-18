/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author TUF GAMING
 */
public class MainMenu {
    JFrame frame;
    JButton login, registrasi, lihatData;
    public MainMenu(){
        frame = new JFrame();
        frame.setSize(800, 500);
        
        
        login = new JButton("login");
        login.setBounds(360, 100, 100, 40);
        frame.add(login);
        login.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuLogin();
            }
            
        });
        
        registrasi = new JButton("registrasi");
        registrasi.setBounds(350, 180, 100, 40);
        frame.add(registrasi);
        registrasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuRegistrasi();
            }
            
        });
        
        lihatData = new JButton("Lihat data");
        lihatData.setBounds(350, 230, 100, 40);
        frame.add(lihatData);
        lihatData.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MenuLihatData();
            }
            
        });
        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
