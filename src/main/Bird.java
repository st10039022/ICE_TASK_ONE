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
public class Bird extends Animal {
    
    public Bird() {
}

    private int colour;
    private String colourNum;
    
     @Override
     
    public void input() {
        
        super.input();
        
        String colourInput = JOptionPane.showInputDialog("Enter feather colour (1 = grey, 2 = white, 3 = black): ");
        
       colour = Integer.parseInt(colourInput);
        
        colourNumber(colour);
        
    }

    @Override
    
    public void output() {
        
        super.output();
        
        JOptionPane.showMessageDialog(null, "Feather colour: " + colourNum);
        
    }

    private void colourNumber (int colourNumber) {
         switch (colourNumber) {
            case 1: colourNum = "Grey";  break;
            
            case 2: colourNum = "White"; break;
           
            case 3:  colourNum = "Black"; break;
               
            default:  colourNum = "Not an option"; break;
               
               
        }
    
        
    }


}