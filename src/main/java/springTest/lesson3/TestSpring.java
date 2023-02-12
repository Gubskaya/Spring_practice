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


        //инит метод и дестрой метод
        ClassicalMusic classicalMusic =context.getBean("musicBean2", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        //c scope prototype destroy-method не вызывается
        ClassicalMusic classicalMusic1 = context.getBean("musicBean3", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean3", ClassicalMusic.class);
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());

        context.close();
    }
}
