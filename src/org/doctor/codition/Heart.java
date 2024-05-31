package org.doctor.codition;

import java.util.Scanner;

public class Heart extends OrganGeneral {
    HeartRate heartRate = new HeartRate();

    public Heart(String name, String condition) {
        super(name, condition);
    }

    public void checkHeart() {
        System.out.println(getName());
        System.out.println(getCondition());
        System.out.println(heartRate.getOldHeartRate());
        System.out.println("\t1. Change heart rate");
        Scanner scanner = new ScannerClass().scannerF();
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Enter the new heart rate:");
            answer = scanner.nextInt();
            heartRate.setOldHeartRate(answer);
//            setHeartRate(answer);
            System.out.println("Heart rate is changed to: " + answer);
            new optionsOrgans().optionsFunc();
        } else {
            new optionsOrgans().optionsFunc();
        }
    }
}
