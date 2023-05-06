package beanLifeCy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
      BeanLifeCycleDemo b=c1.getBean("b1", BeanLifeCycleDemo.class);
      b.display();
      c1.close();

    }
}
