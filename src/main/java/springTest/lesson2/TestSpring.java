package springTest.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.lesson2.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        context.close();



    }
}
