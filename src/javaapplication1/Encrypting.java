/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author betim
 */
public class Encrypting extends javax.swing.JFrame {
    
    public static void main(String[]args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Encrypt().setVisible(true);
            }
        });
    }
}
