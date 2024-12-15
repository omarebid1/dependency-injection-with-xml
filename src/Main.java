import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = (Shape) context.getBean("circleBean");

        circle.draw2dShape();
        circle.draw3dShape();

    }
}
