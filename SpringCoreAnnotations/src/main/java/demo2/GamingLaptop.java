package demo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop2")
public class GamingLaptop implements Laptop{
  Processor pro;
    //@Autowired optional for single Entity
    public GamingLaptop(@Qualifier("pro1") Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop Type is Gaming");
    }

    @Override
    public void getProcesser() {
     pro.getType();
    }
}
