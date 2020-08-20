package settings;

import music.player.PlayerConfig;
import music.player.playMusic.Music;
import music.player.playMusic.PopMusic;
import music.player.playMusic.RapMusic;
import music.player.playMusic.RockMusic;
import music.player.playMusic.artists.Artists;
import music.player.playMusic.artists.pop.CarlsDreams;
import music.player.playMusic.artists.pop.EdSheeran;
import music.player.playMusic.artists.pop.Rihanna;
import music.player.playMusic.artists.rap.Eminem;
import music.player.playMusic.artists.rap.MaxKorj;
import music.player.playMusic.artists.rap.SixNine;
import music.player.playMusic.artists.rock.AcDc;
import music.player.playMusic.artists.rock.Queen;
import music.player.playMusic.artists.rock.U2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public CarlsDreams carlsDreams(){
        return new CarlsDreams();
    }
    @Bean
    public EdSheeran edSheeran(){ return new EdSheeran(); }
    @Bean
    public Rihanna rihanna(){
        return new Rihanna();
    }
    @Bean
    public Eminem eminem(){
        return new Eminem();
    }
    @Bean
    public MaxKorj maxKorj(){
        return new MaxKorj();
    }
    @Bean
    public SixNine sixNine(){
        return new SixNine();
    }
    @Bean
    public AcDc acDc(){
        return new AcDc();
    }
    @Bean
    public Queen queen(){
        return new Queen();
    }
    @Bean
    public U2 u2(){
        return new U2();
    }
    @Bean
    public List<Artists> popArtistList(){
        return Arrays.asList(carlsDreams(), edSheeran(), rihanna());
    }
    @Bean
    public List<Artists> rapArtistsList(){
        return Arrays.asList(eminem(), maxKorj(), sixNine());
    }
    @Bean
    public List<Artists> rockArtistsList(){
        return Arrays.asList(acDc(), queen(), u2());
    }
    @Bean
    public PopMusic popMusic(){
        return new PopMusic(popArtistList());
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic(rapArtistsList());
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic(rockArtistsList());
    }
    @Bean
    public List<Music> music(){
        return Arrays.asList(popMusic(), rapMusic(), rockMusic());
    }
    @Bean
    public PlayerConfig playerConfig(){
        return new PlayerConfig(music());
    }
}
