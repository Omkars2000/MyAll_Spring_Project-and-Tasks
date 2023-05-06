package demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
       Laptop l1= c1.getBean("laptop1", Laptop.class);
       l1.getType();
       l1.getProcesser();

        Laptop l2= c1.getBean("laptop2", Laptop.class);
        l2.getType();
        l2.getProcesser();
    }
}

