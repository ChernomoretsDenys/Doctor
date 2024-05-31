package org.doctor.codition;

public class Skin extends OrganGeneral {
    public Skin(String name, String condition) {
        super(name, condition);
    }

    public void display() {
        System.out.println(getName());
        System.out.println(getCondition());
        new optionsOrgans().optionsFunc();
    }
}
