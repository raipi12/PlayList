package music.player.playMusic.artists.rock;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class U2 implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("One");
        listOfSongs.add("Beautiful Day");
        listOfSongs.add("With Or Without You");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "U2 - " + randomChoice;
    }
}
