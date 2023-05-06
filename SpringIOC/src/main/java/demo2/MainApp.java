package demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select the Choice");
        System.out.println("1:Laptop");
        System.out.println("2:Projector");
        int choice= sc1.nextInt();
        Machine m1=null;
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        if(choice==1){
            m1=c1.getBean("machine1",Machine.class);
        } else if (choice==2) {
            m1=c1.getBean("machine2",Machine.class);
        }
        if(m1!=null){
            m1.getType();
            m1.getPrice();
        }else {
            System.out.println("Invalid Choice");
        }

    }
}
