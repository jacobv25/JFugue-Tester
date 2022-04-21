package Rhythm;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

public class r1 {
    public static void main(String[] args) {
        Player player = new Player();
        Rhythm rhythm = new Rhythm();
        rhythm.addLayer("O.OO...O.OO....O");
        rhythm.addLayer("....o.......o...");
        rhythm.addLayer("^.`.^.`.^.`.^.`.");
        player.play(rhythm.getPattern().repeat(4));
    }

}
