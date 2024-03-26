/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tritable;

import java.util.ArrayList;

/**
 *
 * @author Inclusiv PC 20
 */
public class TriTableau {
private int[] nombre;

 public TriTableau(int[] nombre){
     this.nombre = nombre;
 }
 
 public void TriCroissante(){
     for (int i= 1; i<nombre.length; i++){
         int elementCurrent = nombre[i];
         int j = 1 - 1;
         while (j >= 0 && nombre[j] > elementCurrent){
               nombre[j + 1] = nombre[j];
               j--;
               }
         }
 }
 
 public void TriDecroissante(){
     for (int i= 10; i<nombre.length; i--){
         int elementCurrent = nombre[i];
         int j = 1 + 1;
         while (j <= 0 && nombre[j] < elementCurrent){
             nombre[j - 1] = nombre[j];
             j++;
         }
        }
 }
     
 public void showNombre(){
         for (int nombres : nombre){
             System.out.print(" " +nombres + " ");
             }
             System.out.println();
     }
 
 public void entreNombre(){
     
        }
 
 }
 

