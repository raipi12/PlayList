package music.player.playMusic.artists.rap;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Eminem implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("Lose Yourself");
        listOfSongs.add("Beautiful");
        listOfSongs.add("Stan");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "Eminem - " + randomChoice;
    }
}
