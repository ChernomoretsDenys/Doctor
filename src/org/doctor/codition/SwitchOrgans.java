package org.doctor.codition;

public class SwitchOrgans {
    public void organsSwitch(int organ) {
        switch (organ) {
            case 1:
                Eye leftEye = new Eye("Left Eye", "Short sighted","Blue");
                leftEye.openEye();
                break;
            case 2:
                Eye rightEye = new Eye("Right Eye", "Normal","Blue");
                rightEye.openEye();
                break;
            case 3:
                Heart heart = new Heart("Heart","Normal");
                heart.checkHeart();
                break;
            case 4:
                Stomach stomach = new Stomach("Stomach","PUD","Need to be fed");
                stomach.digest();
                break;
            case 5:
                Skin skin = new Skin("Skin", "Burned");
                skin.display();
                break;
            case 6:
                Quit quit = new Quit();
                quit.exit();
                break;

        }

    }
}
