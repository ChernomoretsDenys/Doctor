package org.doctor.codition;

import java.util.Scanner;

public class DisplayOptions {
    public int displayOrgans() {
        Scanner scanner = new ScannerClass().scannerF();
        int answer;
        String[] organs = {"Left Eye", "Right Eye", "Heart", "Stomach", "Skin", "Quit"};
        do {
            System.out.println("Choose an organ:");
            for (int i = 0; i < organs.length; i++) {
                System.out.println("\t" + (i + 1) + ". " + organs[i]);
            }
            answer = scanner.nextInt();
        } while (answer <= 0 || answer > 6);
        return answer;
    }
}
