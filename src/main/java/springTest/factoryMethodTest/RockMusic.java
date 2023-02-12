package springTest.factoryMethodTest;

import springTest.lesson3.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "какая-то рок песня";
    }
}
