package demo.sb.app;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

	//必须要在resources下创建templates文件夹controller里的请求才有用
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}