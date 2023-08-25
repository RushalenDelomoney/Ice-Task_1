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

 class Bird extends Animal {
    private int colour;

    public Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.colour = colour;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Feather Colour: " + colour);
    }
}