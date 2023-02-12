package springTest.lesson3;

public class ClassicalMusic implements Music{
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
