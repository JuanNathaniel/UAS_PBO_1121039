/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ju
 * Tambahin tahun, sama semester
 */
public class FormInputNilai { //FR-011
    

    JFrame frame;
    JLabel header, labelNimMhs, labelKodeMatkul, labelNilai;
    JTextField inputNimMhs, inputKodeMatkul, inputNilai;
    public FormInputNilai() {
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        header = new JLabel("Form Input Nilai Mahasiswa");
        header.setBounds(220, 30, 400, 50);
        header.setFont(new Font( "Dialog", 1, 24));
        frame.add(header);

        //Nim Mahasiswa
        labelNimMhs = new JLabel("NIK Mahasiswa  : ");
        labelNimMhs.setBounds(190, 170, 150, 40);
        labelNimMhs.setFont(new Font( "Dialog", 1, 15));
        frame.add(labelNimMhs);
        
        inputNimMhs = new JTextField();
        inputNimMhs.setBounds(335, 170, 200, 40);
        frame.add(inputNimMhs);
        
        //Kode matkul
        labelKodeMatkul= new JLabel("Kode Matkul      : ");
        labelKodeMatkul.setBounds(190, 230, 150, 40);
        labelKodeMatkul.setFont(new Font( "Dialog", 1, 15));
        frame.add(labelKodeMatkul);
        
        inputKodeMatkul = new JTextField();
        inputKodeMatkul.setBounds(335, 230, 200, 40);
        frame.add(inputKodeMatkul);
        
        //Nilai
        labelNilai = new JLabel("Nilai                    : ");
        labelNilai.setBounds(190, 290, 150, 40);
        labelNilai.setFont(new Font( "Dialog", 1, 15));
        frame.add(labelNilai);
        
        inputNilai = new JTextField();
        inputNilai.setBounds(335, 290, 200, 40);
        frame.add(inputNilai);
        
        
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FormInputNilai();
    }
}
