package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        //by using @Scope("prototype") ----> multiple objects
        Central n1=c1.getBean("c1",Central.class);
        Central n2=c1.getBean("c1",Central.class);
        System.out.println(n1==n2);
         //by default singleton objects
        Sample s1=c1.getBean("s1",Sample.class);
        Sample s2=c1.getBean("s1",Sample.class);
        System.out.println(s1==s2);
    }
}
