package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainAppTask {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner sc1=new Scanner(System.in);
        System.out.println("Select the Choice");
        System.out.println("1:Petrol");
        System.out.println("2:Diesel");
        int choice= sc1.nextInt();
        Car c=null;
        if(choice==1){
            c=c1.getBean("Car1",Car.class);
        }else if(choice==2){
            c=c1.getBean("Car2",Car.class);
        }
        if(c!=null){
            c.getType();
            c.getEngineInfo();
        }else {
            System.out.println("Invalid Choice");
        }

    }
}
