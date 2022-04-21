package Intro.p1;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.ChordProgression;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        /**
         * Intro
         */

//        player.play("D5h E5h A5h Bb5h C#5h Rq A5q A5q Ab5h G5q G5q");

//        player.play("T100 V0 I[Violin] D5h E5h | A5h Bb5h | "+
//                "C#5h Rq A5q | A5q Ab5h | G5q G5q"+"V1 I[Flute] D5q F5q A5q D6q | "+
//                "C#6i D6i E6i F6i G6i F6i E6i D6i | "+"E6i A5i E6i G6i F6i E6i D6i C#6i | "+
//                "B5i C#6i D6i F6i E6i D6i C#6i B5i | A5i Bb5i");

//        player.play("C3MAJq F3MAJq G3MAJq C3MAJq");

        /**
         * Chord Progression
         */
//        ChordProgression cp = new ChordProgression("I IV V I");
//        player.play(cp);
//        player.play(cp.setKey("Bb"));
//        player.play("Bb3MAJq Eb4MAJq F4MAJq Bb3MAJq");
        /**
         * Concatenate
         */
//        player.play(cp.getPattern().toString() + cp.setKey("Bb") + "Bb3MAJq Eb4MAJq F4MAJq Bb3MAJq");
        /**
         * Rythm
         */
        Rhythm rhythm = new Rhythm()
                .addLayer("O..oO...O..oOO..")
                .addLayer("..S...S...S...S.")
                .addLayer("````````````````")
                .addLayer("...............+");
        //        player.play(rhythm.getPattern().repeat(4));
        /**
         * More Rythm
         */
        ChordProgression cp = new ChordProgression("I IV V I");
        player.play(cp.setKey("AbMIN"), rhythm.getPattern().repeat(4));
    }

}
