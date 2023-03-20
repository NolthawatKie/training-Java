package main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model; // Manully
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
class Web { 
    
    @GetMapping("/welcome")
    String showWelcome(Model model) {
        // go to http:localhost:27000/welcome
        model.addAttribute("brand", "iCoffee");
        model.addAttribute("location", "Bang Yai");
        return "sample"; //sample + suffix (.html)
    }
    
    @GetMapping("/show-detail") @ResponseBody
    double show() {
        return 333.158;
    }
    
    @GetMapping("/list-users") @ResponseBody
    Iterable showUsers() {
        return manager.findAll();
    }
    @Autowired UserManager manager;
}

@RestController
class Example {
    @GetMapping("/show-abc")
    double show() {
        return 123.45;
    }
}