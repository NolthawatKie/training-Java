package main;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller @ResponseBody
class Weather {
    @RequestMapping("/weather/add")
    String add(String value) {
        data.add(value);
        return "OK";
        //http://localhost:16000/weather/add
    }
    @RequestMapping("/weather/list")
    ArrayList show() {
        return data;
        //http://localhost:16000/weather/list
    }
    ArrayList data = new ArrayList();
}


@Controller @ResponseBody @RequestMapping("/staff")
class StaffService{
    @RequestMapping("/list")
    String[] list() {
        String[] data = {"Bill", "Mark", "Jeff", "David"};
        return data;
    }    
}
