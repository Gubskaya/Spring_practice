package springTest.AnnotationTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.factoryMethodTest.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Music music = context.getBean("rockMusicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        Music music1 = context.getBean("classicalMusicBean", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.playMusic();


        context.close();

    }
}
