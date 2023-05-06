package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        MasterDemo m1= c1.getBean("m1",MasterDemo.class);
        m1.test();
    }
}
