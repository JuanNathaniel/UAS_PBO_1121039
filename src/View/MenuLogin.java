/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.User;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static Controller.Controller.*;
/**
 *
 * @author TUF GAMING
 */
public class MenuLogin {

    JFrame frame;
    JLabel limage, llogin;
    JTextField email, pass;
    JLabel lemail, lpass, image;
    JButton login, back;

    public MenuLogin() {
        frame = new JFrame();
        frame.setSize(800, 500);

        llogin = new JLabel("Ju Cooper ");
        llogin.setBounds(200, 20, 400, 60);
        llogin.setFont(new Font("serif", Font.PLAIN, 55));
        frame.add(llogin);

        limage = new JLabel(new ImageIcon("d://people.png"));
        limage.setBounds(20, 20, 150, 150);
        frame.add(limage);

        lemail = new JLabel("email : ");
        lemail.setBounds(270, 150, 100, 40);
        frame.add(lemail);

        email = new JTextField();
        email.setBounds(370, 150, 100, 40);
        frame.add(email);

        lpass = new JLabel("lpass");
        lpass.setBounds(270, 190, 100, 40);
        frame.add(lpass);

        pass = new JTextField();
        pass.setBounds(370, 190, 100, 40);
        frame.add(pass);

        //button
        login = new JButton("Login");
        login.setBounds(350, 240, 100, 40);
        frame.add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                User user = getUser(email.getText(), pass.getText());
                user.toString();
                if (user.getUsername()!= null) {
                    frame.dispose();
                    new MenuLihatData();
                }
            }
        });

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
