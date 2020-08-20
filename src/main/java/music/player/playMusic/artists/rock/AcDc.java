package music.player.playMusic.artists.rock;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AcDc implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("Thunderstruck");
        listOfSongs.add("Back In Black");
        listOfSongs.add("Highway to Hell");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "AC/DC - " + randomChoice;
    }
}
