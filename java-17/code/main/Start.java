package main;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Start {
    public static void main(String[] data) {
        //Database db = new Database();
        System.out.println(Database.checkConnection());
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}
@SpringBootApplication
class Setup { }
@Controller @ResponseBody
class Sample { 
    @RequestMapping("/list/vehicles")
    ArrayList list() {
        return Database.listAllVehicles();
    }
    
}


