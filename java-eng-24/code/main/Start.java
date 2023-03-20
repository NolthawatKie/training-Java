package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Start {
    public static void main(String[] data) {
            ApplicationContext context;
            context = SpringApplication.run(Setup.class); //configuration class
            //SpringApplication.exit(context); //if you don't exit, you need to press exit button manually
        }       
    }
@SpringBootApplication
class Setup { 
    @Bean Player p1() {
        return new Player("Frank L", 8, 45000.0);
    }
    
    @Bean Player p2() {
        return new Player("Stephen G", 4, 50000.0);
    }
}

record Player(String name, int number, double salary){ }