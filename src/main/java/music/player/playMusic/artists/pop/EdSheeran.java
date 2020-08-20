package music.player.playMusic.artists.pop;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EdSheeran implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("Perfect");
        listOfSongs.add("I Don't Care");
        listOfSongs.add("Photograph");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "Ed Sheeran - " + randomChoice;
    }
}
