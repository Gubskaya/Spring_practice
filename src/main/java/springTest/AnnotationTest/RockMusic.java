package springTest.AnnotationTest;

import org.springframework.stereotype.Component;
import springTest.AnnotationTest.Music;

@Component("rockMusicBean") //в скобках название бина. не обязательно
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "какая-то рок песня";
    }
}
