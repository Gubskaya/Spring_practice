package springTest.lesson3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //внедрение зависимости вручную
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music); //IoC
        musicPlayer.playMusic();

        //внедрение зависимости при помощи Spring'a, через конструктор
        //Dependency injection
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class); //в параметр передается бин musicPlayer, которому в конструктор передали бин musicBean
        musicPlayer2.playMusic();

        //внедрение зависимости при помощи Spring'a, через сеттер
        //Dependency injection
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer3.playMusic();

        MusicPlayer musicPlayer4 = context.getBean("musicPlayer4", MusicPlayer.class);
        System.out.println(musicPlayer4.getName());
        System.out.println(musicPlayer4.getVolume());

        context.close();
    }
}
