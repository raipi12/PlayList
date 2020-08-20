package music.player;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import settings.SpringConfig;

public class Player {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        PlayerConfig player = context.getBean("playerConfig", PlayerConfig.class);
        System.out.println(player.getMusic());
    }
}
