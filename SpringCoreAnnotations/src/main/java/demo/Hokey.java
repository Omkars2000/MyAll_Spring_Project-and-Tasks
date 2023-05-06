package demo;

import org.springframework.stereotype.Component;

@Component("sport1")
public class Hokey implements Sport {

    @Override
    public void getName() {
        System.out.println("Sport name is Hokey");
    }

    @Override
    public void getType() {
        System.out.println("Sport type is outdoor");

    }
}
