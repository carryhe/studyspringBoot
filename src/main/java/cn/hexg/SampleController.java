package cn.hexg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
//@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("cn.hexg.db.dao")
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}