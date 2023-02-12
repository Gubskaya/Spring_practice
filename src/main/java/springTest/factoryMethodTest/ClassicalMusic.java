package springTest.factoryMethodTest;

import springTest.lesson3.Music;

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
