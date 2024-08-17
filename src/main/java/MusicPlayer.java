import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class MusicPlayer {
    protected abstract String getSoundFilePath();

    public void playSound() {
        String soundFilePath = getSoundFilePath();
        try {
            FileInputStream fileInputStream = new FileInputStream(soundFilePath);
            Player player = new Player(fileInputStream);
            player.play();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
