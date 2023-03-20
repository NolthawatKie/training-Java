package main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Start {
    public static void main(String[] data) {
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
        p.name = "Frank L";
        p.number = 8;
        p.salary = 37000.0;
        return p;
    }
    
    // http://localhost:16000/search-branch?city=London
    String[] branches = {"London", "New York", "Paris"};
    @RequestMapping("/search-branch")
    Boolean searchBranch(String city) {
        
        for(String s : branches){
            if(s.equals(city)) return true;
        }
        return false;
    }
    
    // https://localhost:16000/get-total?price=150
    @RequestMapping("/get-total")
    Result getTotal(String price) {
        Result r = new Result();
        r.cashier = "Abigale W";
        try {
            double p = Double.valueOf(price);
        r.total = p * 1.08;
        } catch (Exception e) {
            r.cashier = "Invalid Price";}
        return r;
        }
    
}


class Result {
    public double total;
    public String cashier;
}

class Player {
    public String name;
    public int number ;
    public double salary;
}