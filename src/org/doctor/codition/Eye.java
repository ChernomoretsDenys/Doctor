package org.doctor.codition;

import java.util.Scanner;

public class Eye extends OrganGeneral {
    private String color;

    public Eye(String name, String condition, String color) {
        super(name, condition);
        this.color = color;
    }

    public String getColor() {
        return "Color: " + color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void openEye() {
        System.out.println(getName());
        System.out.println(getCondition());
        System.out.println(getColor());
        System.out.println("\t1. Close the Eye");
        Scanner scanner = new ScannerClass().scannerF();
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Eye is closed");
            new optionsOrgans().optionsFunc();
        } else {
            new optionsOrgans().optionsFunc();
        }

    }
}
