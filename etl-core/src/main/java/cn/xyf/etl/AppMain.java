package cn.xyf.etl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("")

public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);

    }
    @GetMapping("ok")
    public String ok(){
        return "ok";
    }
}
