package music.player.playMusic.artists.rap;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SixNine implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("Gooba");
        listOfSongs.add("Punani");
        listOfSongs.add("YAYA");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "6IX9INE - " + randomChoice;
    }
}
