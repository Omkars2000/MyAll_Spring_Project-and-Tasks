package demo;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport{
    @Override
    public void getName() {
        System.out.println("Sport type is Cricket");
    }

    @Override
    public void getType() {
        System.out.println("Sport type is outdoor");
    }
}
