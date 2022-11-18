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
public class FormJadwalMengajar { //FR-007
    JFrame frame;
    JLabel header, labelNik, labekKodeMatkul, labelRuangan, labelTanggal;
    JTextField inputNik, inputKodeMatkul, inputRuangan;
    public FormJadwalMengajar(){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        header = new JLabel("Form Jadwal Ajar");
        header.setBounds(280, 30, 400, 50);
        header.setFont(new Font( "Dialog", 1, 24));
        frame.add(header);
        
        //nikDosen
        labelNik = new JLabel("Nik Dosen        : ");
        labelNik.setBounds(205, 170, 150, 40);
        labelNik.setFont(new Font( "Dialog", 1, 15));
        frame.add(labelNik);
        
        inputNik = new JTextField();
        inputNik.setBounds(370, 170, 200, 40);
        frame.add(inputNik);
        
        //kodematkul
        labekKodeMatkul = new JLabel("Kode Matkul    : ");
        labekKodeMatkul.setBounds(205, 230, 150, 40);
        labekKodeMatkul.setFont(new Font( "Dialog", 1, 15));
        frame.add(labekKodeMatkul);
        
        inputKodeMatkul = new JTextField();
        inputKodeMatkul.setBounds(370, 230, 200, 40);
        frame.add(inputKodeMatkul);
        
        //ruangan
        labelRuangan = new JLabel("Ruangan          : ");
        labelRuangan.setBounds(205, 290, 150, 40);
        labelRuangan.setFont(new Font( "Dialog", 1, 15));
        frame.add(labelRuangan);
        
        inputRuangan = new JTextField();
        inputRuangan.setBounds(370, 290, 200, 40);
        frame.add(inputRuangan);
        
        //tanggal
        labelRuangan = new JLabel("Tanggal            : ");
        labelRuangan.setBounds(205, 350, 150, 40);
        labelRuangan.setFont(new Font( "Dialog", 1, 15));
        frame.add(labelRuangan);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FormJadwalMengajar();
    }
}
