package Players;

import java.util.Scanner;
import javax.sound.midi.MidiUnavailableException;
import org.jfugue.pattern.Pattern;
import org.jfugue.realtime.RealtimePlayer;
import org.jfugue.theory.Note;
public class RealtimeExample {
    public static void main (String[] args) throws MidiUnavailableException {
        RealtimePlayer player= new RealtimePlayer();
        Scanner scanner= new Scanner(System.in);
        boolean quit= false;
        while(quit== false) {
            System.out.print("Enter a '+C' to start a note, '-C' to stop a note, 'i' for a random instrument, 'p' for a pattern, or 'q' toquit: ");
            String entry= scanner.next();
            if(entry.startsWith("+")) {
                player.startNote(new Note(entry.substring(1)));
            }
            else if(entry.startsWith("-")) {
                player.stopNote(new Note(entry.substring(1)));
            }
            else if(entry.equalsIgnoreCase("i")) {
                player.changeInstrument((int)(Math.random() * 128));
            }
            else if(entry.equalsIgnoreCase("p")) {
                player.play(PATTERNS[(int)(Math.random() * PATTERNS.length)]);
            }
            else if(entry.equalsIgnoreCase("q")) {quit= true;}
        }
        scanner.close();
        player.close();
    }
    private static Pattern[] PATTERNS= new Pattern[] {
            new Pattern("Cmajq Dmajq Emajq"),
            new Pattern("V0 Ei Gi Di Ci  V1 Gi Ci Fi Ei"),
            new Pattern("V0 Cmajq V1 Gmajq")};
}