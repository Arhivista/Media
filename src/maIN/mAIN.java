package maIN;

import media.Television;
import media.Radio;

public class mAIN {

    public static void main(String[] args) {
        Television TV = new Television();
        TV.setVolume(8);
        TV.setCurrentProgram(16);
        TV.setTurnOn(true);
        System.out.println("");

        Radio Play = new Radio(9.81, 600, "A");
        Play.showData();
//        Play.setFmFrequency(Play.getFmFrequency());
//        Play.setAmFrequency(Play.getAmFrequency());

    }

}
