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
public class Animal {
    
    private int IDtag;
    private String  Species;

    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }
   
     public void input() {
        IDtag = Integer.parseInt(JOptionPane.showInputDialog("Enter ID tag of animal: "));
        Species = JOptionPane.showInputDialog("Enter species: ");
    }

    public void output() {
        JOptionPane.showMessageDialog(null, "ID tag: " + IDtag + "\nSpecies: " + Species);
    }

    
}
