package demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pro1")
@Primary
public class Rayzen implements Processor {
    @Override
    public void getType() {
        System.out.println("Processor Name is Rayzen");
    }
}
