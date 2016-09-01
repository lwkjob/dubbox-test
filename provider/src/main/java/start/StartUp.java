package start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liwenke on 16/9/1.
 */
public class StartUp {
    public static void main(String[] args) throws  Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//        log.info("*********************************************");
//        log.info("LogisticsOrderPlatform started successfully");
//        log.info("*********************************************");

        synchronized (context) {
            context.wait();
        }
    }
}
