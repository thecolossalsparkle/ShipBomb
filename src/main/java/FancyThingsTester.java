public class FancyThingsTester {
    public static void main(String[] args) {
        GameStartMusic gameStartMusic = new GameStartMusic();
        gameStartMusic.playSound();

        BombMusic bombMusic = new BombMusic();
        bombMusic.playSound();

        HitMusic hitMusic = new HitMusic();
        hitMusic.playSound();

        MissMusic missMusic = new MissMusic();
        missMusic.playSound();

        GameEndMusic gameEndMusic = new GameEndMusic();
        gameEndMusic.playSound();

        SadMusic gamesadmusic = new SadMusic();
        gamesadmusic.playSound();

        HappyMusic gamehappymusic = new HappyMusic();
        gamehappymusic.playSound();
    }
}
