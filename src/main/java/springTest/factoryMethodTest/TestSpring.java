package springTest.factoryMethodTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.lesson3.Music;
import springTest.lesson3.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean4", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


    }
}
