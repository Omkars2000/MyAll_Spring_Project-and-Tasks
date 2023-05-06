package beanLifeCy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("b1")
public class BeanLifeCycleDemo {
    @PostConstruct// custom init method
    void startUp(){
        System.out.println("Initialize Resources");
    }
    void display(){
        System.out.println("Display Method");
    }
    @PreDestroy//custom destroy method
    void shutDown(){
        System.out.println("CleanUp Code");
    }
}
