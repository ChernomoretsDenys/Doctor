package org.doctor.codition;

import java.util.Scanner;

public class Stomach extends OrganGeneral {
    private String option;

    public Stomach(String name, String condition, String option) {
        super(name, condition);
        this.option = option;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void digest() {
        System.out.println(getName());
        System.out.println(getCondition());
        System.out.println(getOption());
        System.out.println("\t 1. Digest");
        Scanner scanner = new ScannerClass().scannerF();
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Digesting food");
            new optionsOrgans().optionsFunc();
        } else {
            new optionsOrgans().optionsFunc();
        }
    }
}
