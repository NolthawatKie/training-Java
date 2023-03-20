package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller @ResponseBody
class Test1 {
    @GetMapping("/service1")
    int show() {
        return item.staff;
    }
    @Autowired MySetupService item;
    
    @GetMapping("/service2")
    Player show2() {
        return captain;
    }
    @Autowired @Qualifier("p2") Player captain;
}

@RestController // @Controller + @ResponseBody
class Test2 { }

@Service
class MySetupService {
    String brand = "iCoffee";
    int staff = 80;
}

