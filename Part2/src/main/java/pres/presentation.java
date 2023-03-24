package pres;

import metier.UC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presentation {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("dao","metier");
        UC uc=context.getBean(UC.class);
        uc.printData("hello world!");
        uc.readData();
    }
}
