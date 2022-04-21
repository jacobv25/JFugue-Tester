package Players;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.io.File;
import java.io.IOException;

public class LoadJFugueFile {
    public static void main(String[] args) throws IOException {
        /**
         * I tried using resources folder but was unable to get it to work like I normally can.
         * For now use the absolute path.
         */
        Pattern pattern= Pattern.load(new File("C:\\SE 471\\JFugue-Tester\\src\\main\\resources\\furelise.stoccato"));
        Player player= new Player();
        player.play(pattern);
    }
}
