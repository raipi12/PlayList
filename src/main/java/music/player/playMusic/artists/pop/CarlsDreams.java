package music.player.playMusic.artists.pop;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CarlsDreams implements Artists {

   private List<String> listOfSongs = new ArrayList<String>();
   private Random ranndom = new Random();
   private String randomChoice;

    {
        listOfSongs.add("Acele");
        listOfSongs.add("Secretele");
        listOfSongs.add("Sub pielia mea");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "Carl's Dreams - " + randomChoice;
    }
}
