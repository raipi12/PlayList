package music.player.playMusic;

import music.player.playMusic.artists.Artists;
import music.player.playMusic.artists.rock.AcDc;
import music.player.playMusic.artists.rock.Queen;
import music.player.playMusic.artists.rock.U2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music{

    private List<Artists> rockArtistsList =  new ArrayList<>();
    private Random random = new Random();

    {
        rockArtistsList.add(new AcDc());
        rockArtistsList.add(new Queen());
        rockArtistsList.add(new U2());
    }

    public RockMusic(List<Artists> rockArtistsList) {
        this.rockArtistsList = rockArtistsList;
    }

    public String getArtist_sSong() {
        return rockArtistsList.get(random.nextInt(rockArtistsList.size())).getSong();
    }
}
