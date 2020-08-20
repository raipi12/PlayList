package music.player.playMusic;

import music.player.playMusic.artists.Artists;
import music.player.playMusic.artists.pop.CarlsDreams;
import music.player.playMusic.artists.pop.EdSheeran;
import music.player.playMusic.artists.pop.Rihanna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PopMusic implements Music{

    private List<Artists> popArtistsList = new ArrayList<>();
    private Random random = new Random();

    {
        popArtistsList.add(new CarlsDreams());
        popArtistsList.add(new EdSheeran());
        popArtistsList.add(new Rihanna());
    }

    public PopMusic(List<Artists> popArtistsList) {
        this.popArtistsList = popArtistsList;
    }

    public String getArtist_sSong() {
        return popArtistsList.get(random.nextInt(popArtistsList.size())).getSong();
    }
}
