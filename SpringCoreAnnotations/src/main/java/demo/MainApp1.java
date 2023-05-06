package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Sport s1=c1.getBean("sport1",Sport.class);
        s1.getName();
        s1.getType();

        Sport s2=c1.getBean("sport2",Sport.class);
        s2.getName();
        s2.getType();

        //without providing reference variable at @Component then reference variable will be same like class name
        Sport s3=c1.getBean("cricket",Sport.class);
        s3.getName();
        s3.getType();
    }
}
