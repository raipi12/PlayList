package music.player.playMusic;

import music.player.playMusic.artists.Artists;
import music.player.playMusic.artists.rap.Eminem;
import music.player.playMusic.artists.rap.MaxKorj;
import music.player.playMusic.artists.rap.SixNine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RapMusic implements Music{

    private List<Artists> rapArtistsList = new ArrayList<>();
    private Random random = new Random();

    {
        rapArtistsList.add(new Eminem());
        rapArtistsList.add(new MaxKorj());
        rapArtistsList.add(new SixNine());
    }

    public RapMusic(List<Artists> rapArtistsList) {
        this.rapArtistsList = rapArtistsList;
    }

    public String getArtist_sSong() {
        return rapArtistsList.get(random.nextInt(rapArtistsList.size())).getSong();
    }
}
