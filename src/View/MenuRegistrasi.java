/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.Controller.insertNew;
import Model.CategoryUser;
import Model.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author TUF GAMING
 */
public class MenuRegistrasi {

    JFrame frame;
    JButton bfoto, registrasi, back;
    JTextField email, nama;
    JPasswordField pass;
    JFileChooser foto;
    File pathfoto;
    JComboBox namaKategori;
    JRadioButton cewe, cowo;
    ButtonGroup bg;
    String gender;
    public MenuRegistrasi() {
        frame = new JFrame();
        frame.setSize(800, 500);

        nama = new JTextField("nama");
        nama.setBounds(350, 50, 100, 40);
        frame.add(nama);

        email = new JTextField("email");
        email.setBounds(350, 90, 100, 40);
        frame.add(email);

        pass = new JPasswordField("Pass");
        pass.setBounds(350, 140, 100, 40);
        frame.add(pass);

        cowo = new JRadioButton("Laki-laki");
        cewe = new JRadioButton("Perempuan");
        bg = new ButtonGroup();
        bg.add(cowo);
        bg.add(cewe);
        cowo.setBounds(350, 180, 100, 20);
        cewe.setBounds(490, 180, 100, 20);
        frame.add(cowo);
        frame.add(cewe);
        //
        String[] kategori = new String[3];

        ArrayList<CategoryUser> list = new ArrayList();
        list = Controller.Controller.getAllcUsers();
        for (int i = 0; i < list.size(); i++) {
            kategori[i] = list.get(i).getCategoryname();
        }
        namaKategori = new JComboBox(kategori);
        namaKategori.setBounds(350, 230, 150, 40);
        frame.add(namaKategori);

        //button
        back = new JButton("Back");
        back.setBounds(470, 290, 100, 40);
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MainMenu();
            }
        });

        registrasi = new JButton("Registrasi");
        registrasi.setBounds(350, 290, 100, 40);
        frame.add(registrasi);
        registrasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("masok");
                insertNew(new User(nama.getText(), email.getText(), pass.getText(), gender, namaKategori.getSelectedIndex()));
            }

        });

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cowo) {
           gender = "Cowo";
        }
        if (e.getSource() == cewe) {
            gender = "Cewe";
        }
    }
}
