package springTest.AnnotationTest;

import org.springframework.stereotype.Component;
import springTest.AnnotationTest.Music;
@Component("classicalMusicBean") //аннотация, для автоматического ссздания бинов Spring'ом
public class ClassicalMusic implements Music {
    //приватный конструктор, чтобы ограничить возможность создания объектов через new
    private ClassicalMusic() {}
    //фабричный метод. при его вызове, пользователь получит новый объект класса
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    //init-method
    public void doMyInit(){
        System.out.println("initialization");
    }
    //destroy-method
    public void doMyDestroy(){
        System.out.println("destruction");
    }



    @Override
    public String getSong() {
        return "какая-то классическая музыка";
    }
}
