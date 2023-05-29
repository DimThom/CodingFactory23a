package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ενας μικρος βάτραχος θέλει να περάσει ενα ποταμι
 * ο βατραχος (frog) βρισκεται στη θεση X και θελει να φτασει στη θεση ψ
 * ή σε θεση > Y. Ο frog jumps a fixed distance, D.
 * <p>
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small from πρέπει
 * να κανει ωστε να φτασει ή να ξεπεράσει τον στοχο.
 * <p>
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 10
 * D = 30,
 * <p>
 * τοτε ο small frog θα χρειαστει 3 jumps, γιατι:
 * Starts at 10, και μετά το 1ο jump παει στη θεση 10 +30 = 40
 * Και στο 3ο jump, παει 70 + 30 = 100
 */

public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Jumps: " + jumps);
    }
}
