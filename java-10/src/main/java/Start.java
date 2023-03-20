import org.springframework.context.support.ClassPathXmlApplicationContext;


class Start {    public static void main(String[] data) {
        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("main.xml");
        Cashier c = context.getBean("front", Cashier.class);
        Player p = context.getBean("captain", Player.class);
        
        double price = 300 * c.multiplier;
        System.out.println("Total is :" + price);
        
        String n = p.name;
        System.out.println(n);
        
        String[] all = context.getBeanDefinitionNames();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        
    }
}

class Cashier {
    double multiplier = 1.0;
    String name;
    public void setTax(double value) {
        multiplier = 1.0 + value / 100.0;
    }
    public void setName(String value){
        name = value;
    }
}

class Player {
    String name;
    int number;
    double salary;
    
    public void setName(String value){
        name = value;
    }
    public void setNumber(int value){
        number = value;
    }
    public void setSalary(double value){
        salary = value;
    }
}

