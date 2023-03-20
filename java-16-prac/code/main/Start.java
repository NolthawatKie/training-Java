package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Start {
    public static void main(String[] data) {
        //System.out.println("java-16-prac");
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup { }

@Controller @ResponseBody
class Sample {
    @RequestMapping("/check")
    Player check() {
        Player p = new Player();
        p.name = "Kong K";
        p.salary = 40000.0;
        return p;
    }
    
    @RequestMapping("/get-total")
    Result getTotal(double price){
        Result r = new Result();
        try {
            r.name = "Your customer ID";
            r.total = price * 0.97;
            return r;
        } catch(Exception e) {
            r.name = "Invalid";
            System.err.print(e);
            return r;
        }
    }
}

@Controller @ResponseBody
class Sample2 {
    String[] list = {"Bangkok", "London"};
    
    @RequestMapping("/search-branch")
    Boolean searchBranch(String city) {      
        for(String s : list){
            if(s.equals(city)) return true;
        }
        return false;
    }
}

class Result {
    public String name ;
    public double total;
}



class Player {
    public String name;
    public double salary;
}
