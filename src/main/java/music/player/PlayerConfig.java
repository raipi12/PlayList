package music.player;

import music.player.playMusic.Music;


import java.util.List;
import java.util.Random;

public class PlayerConfig {

    private List<Music> music;
    private Random random = new Random();
    private String song;

    public PlayerConfig(List<Music> music) {
        this.music = music;
    }

    public String getMusic(){

        song = music.get(random.nextInt(music.size())).getArtist_sSong();

        return "The randomly chosen artist and his song is -> [" + song + "]";
    }
}
