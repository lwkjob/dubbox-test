package start;

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.support.RpcUtils;
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
        for(int i=0;i<1000000;i++){

            System.out.println(clientService.sayHello("你好服务"));
//            TimeUnit.SECONDS.sleep(1);
        }


    }
}
