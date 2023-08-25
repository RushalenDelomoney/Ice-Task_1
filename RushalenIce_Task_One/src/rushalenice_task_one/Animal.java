/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rushalenice_task_one;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
class Animal {
    protected int IDtag;
    protected String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID tag (number e.g 1234): ");
        IDtag = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID Tag: " + IDtag);
        System.out.println("Species: " + species);
    }
}