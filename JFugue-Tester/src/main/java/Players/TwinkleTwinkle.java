package Players;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class TwinkleTwinkle {
    public static void main(String[] args) {
        // This pattern contains the first notes
        // of “Twinkle, Twinkle, little star”
        Pattern pattern1 = new Pattern("C5q C5q G5q G5q A5q A5q G5h");
        // This is “How I wonder what you are”
        Pattern pattern2 = new Pattern("F5q F5q E5q E5q D5q D5q C5h");
        // This pattern can be used for both “Up above the world // so high” and “Like a diamond in the sky”
        Pattern pattern3 = new Pattern("G5q G5q F5q F5q E5q E5q D5h");
        // This is the full song, combining patterns
        Pattern twinkleSong = new Pattern(pattern1, pattern2, pattern3, pattern3, pattern1, pattern2);
        // Now play it!
        Player player = new Player();
        player.play(twinkleSong);
    }
}
