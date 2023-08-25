/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rushalenice_task_one;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class RushalenIce_Task_One {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);

        System.out.println("Enter Bird's Information:");
        brd.input();

        System.out.println("Enter Reptile's Information:");
        rept.input();

        System.out.println("\nBird Information:");
        brd.output();

        System.out.println("\nReptile Information:");
        rept.output();
    }
}