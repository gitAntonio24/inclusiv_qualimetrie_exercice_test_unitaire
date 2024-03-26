/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tritable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Inclusiv PC 20
 */
public class TriTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
      int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TriTableau tri = new TriTableau(tab);
        System.out.println("Ordre croisssante:");  
        tri.showNombre();
        tri.TriCroissante();
        System.out.println("Ordre decroisssante:");
        tri.TriDecroissante();
        tri.showNombre();
        System.out.println("Entre un nombre:");
        //while (int nbr = scanne.nextInt());
        
    }
    
}
