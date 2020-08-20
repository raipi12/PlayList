package music.player.playMusic.artists.rock;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Queen implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("I Want To Break Free");
        listOfSongs.add("Another One Bites the Dust ");
        listOfSongs.add("The Show Must Go On");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "Queen - " + randomChoice;
    }
}
