import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext.xml");
        application.start();

    }
}
