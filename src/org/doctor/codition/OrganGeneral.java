package org.doctor.codition;

public class OrganGeneral {
    private String name;
    private String condition;

    public OrganGeneral(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return "Name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return "Medical condition: " + condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
