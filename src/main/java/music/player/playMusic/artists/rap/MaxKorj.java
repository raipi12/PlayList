package music.player.playMusic.artists.rap;

import music.player.playMusic.artists.Artists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MaxKorj implements Artists {
    private List<String> listOfSongs = new ArrayList<String>();
    private Random ranndom = new Random();
    private String randomChoice;

    {
        listOfSongs.add("Малый повзрослел");
        listOfSongs.add("Тепло");
        listOfSongs.add("Времена");
    }

    public String getSong() {
        randomChoice = listOfSongs.get(ranndom.nextInt(listOfSongs.size()));
        return "Макс Корж - " + randomChoice;
    }
}
