package main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data){
        SpringApplication.run(Setup.class);      
    }
}

@SpringBootApplication
class Setup {
    String source = "jdbc:mysql://127.0.0.1/carservice"+
                                "?user=alan&password=turing";
    
    @Bean DriverManagerDataSource connect() {
        return new DriverManagerDataSource(source);
    }
    
}

@RestController
class Sample {
    @GetMapping("/check")
    int show() {
        return 555;
    }
    

}