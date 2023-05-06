package master;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Account no");
        int accNo=sc1.nextInt();
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Atm a1= c1.getBean("atm" ,Atm.class);
        a1.getInfo(accNo);

    }
}
