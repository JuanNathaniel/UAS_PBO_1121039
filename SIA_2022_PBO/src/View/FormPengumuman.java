/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ju
 */
public class FormPengumuman { //FR - 003
    JFrame frame;
    JLabel header, labelTujuan, labelJudul, labelDeskripsi, labelTanggal;
    JTextField inputJudul, inputDeskripsi;
    JCheckBox cekMahasiswa, cekDosen;
    public FormPengumuman (){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        header = new JLabel("Form Pengumuman");
        header.setBounds(270, 20, 400, 50);
        header.setFont(new Font( "Dialog", 1, 24));
        frame.add(header);
        
        //Bagikan untuk siapa
        labelTujuan = new JLabel("Bagikan untuk siapa :    : ");
        labelTujuan.setBounds(245, 100, 200, 40);
        frame.add(labelTujuan);
        
        cekDosen= new JCheckBox("Dosen");
        cekDosen.setBounds(400, 100, 150, 20);
        cekMahasiswa= new JCheckBox("Mahasiswa");
        cekMahasiswa.setBounds(400, 125, 150, 20);
        frame.add(cekDosen);
        frame.add(cekMahasiswa);
        
        
        
        //Judul
        labelJudul = new JLabel("Judul           : ");
        labelJudul.setBounds(245, 175, 100, 40);
        frame.add(labelJudul);
        
        inputJudul = new JTextField();
        inputJudul.setBounds(335, 175, 250, 40);
        frame.add(inputJudul);
        
        //Deskripsi
        labelDeskripsi = new JLabel("Deskripsi   : ");
        labelDeskripsi.setBounds(245, 225, 100, 40);
        frame.add(labelDeskripsi);
        
        inputDeskripsi = new JTextField();
        inputDeskripsi.setBounds(335, 225, 250, 100);
        frame.add(inputDeskripsi);
                
        //Tanggal
        labelTanggal = new JLabel("Tanggal      :");
        labelTanggal.setBounds(245, 335, 100, 40);
        frame.add(labelTanggal);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FormPengumuman();
    }
}
