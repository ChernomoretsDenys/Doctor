package org.doctor.codition;

public class optionsOrgans {
    public void optionsFunc() {
        DisplayOptions options = new DisplayOptions();
        SwitchOrgans organs = new SwitchOrgans();
        organs.organsSwitch(options.displayOrgans());
    }
}
