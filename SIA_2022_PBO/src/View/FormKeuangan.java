/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ju
 */
public class FormKeuangan { // FR-005
    //ini untuk konfirmasi pembayaran mahasiswa aja
    JFrame frame;
    JLabel header, labelNim, labelUang;
    JTextField inputNim, inputUang;
    public FormKeuangan(){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        header = new JLabel("Form Keuangan");
        header.setBounds(280, 50, 400, 50);
        header.setFont(new Font( "Dialog", 1, 24));
        frame.add(header);
        
        labelNim = new JLabel("NIM Mahasiswa          : ");
        labelNim.setBounds(190, 190, 200, 80);
        labelNim.setFont(new Font( "Dialog", 1, 16));
        frame.add(labelNim);
        
        inputNim = new JTextField();
        inputNim.setBounds(400, 215, 200, 40);
        frame.add(inputNim);
        
        labelUang = new JLabel("Jumlah Pembayaran : ");
        labelUang.setBounds(190, 250, 200, 80);
        labelUang.setFont(new Font( "Dialog", 1, 16));
        frame.add(labelUang);
        
        inputUang = new JTextField();
        inputUang.setBounds(400, 275, 200, 40);
        frame.add(inputUang);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FormKeuangan();
    }
}
