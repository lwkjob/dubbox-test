package start;

import com.yjy.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by liwenke on 16/9/1.
 */
public class ConsumerStartup {
    public static void main(String[] args) throws  Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        ClientService clientService= (ClientService)context.getBean("clientService");


        TimeUnit.SECONDS.sleep(10);

        System.out.println("开始");
        for(int i=0;i<10;i++){

//            System.out.println(clientService.sayHello("你好rpc服务:"+i));
                System.out.println(clientService.sayRestHello("你好rest服务:"+i));
//            TimeUnit.SECONDS.sleep(1);
        }
    }
}
