/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import javax.swing.JOptionPane;

/**
 *
 * @author shali
 */
public class Reptile extends Animal {
    
    public Reptile() {
}

    private double bloodTemp;
    
    @Override
    public void input() {
     
        super.input();
        String tempInput = JOptionPane.showInputDialog("Enter blood temperature: ");
        bloodTemp = Double.parseDouble(tempInput);
    }

    @Override
    public void output() {
        super.output();
        JOptionPane.showMessageDialog(null, "Blood Temperature: " + bloodTemp);
    }
}
