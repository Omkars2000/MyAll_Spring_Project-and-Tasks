package demo2;

import org.springframework.stereotype.Component;

@Component("pro2")
public class Intel implements Processor{
    @Override
    public void getType() {
        System.out.println("Processor Type is Intel");
    }
}
