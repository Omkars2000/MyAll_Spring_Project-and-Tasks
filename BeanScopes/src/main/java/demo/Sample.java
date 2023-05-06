package demo;

import org.springframework.stereotype.Component;

@Component("s1")
public class Sample {
    void display(){
        System.out.println("Sample diaplay method");
    }
}
