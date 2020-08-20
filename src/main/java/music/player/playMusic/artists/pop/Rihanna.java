package music.player.playMusic.artists.pop;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Rihanna implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("Diamonds");
        listOfSongs.add("Stay");
        listOfSongs.add("Man Down");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "Rihanna - " + randomChoice;
    }
}
