package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//必须要在resources下创建templates文件夹controller里的请求才有用
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
