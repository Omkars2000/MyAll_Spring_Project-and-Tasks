package demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop1")
public class BuisnessLaptop implements Laptop{

     Processor pro;
   //@Autowired optional for single Entity
    public BuisnessLaptop(@Qualifier("pro2") Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop type is Buisness Laptop");
    }

    @Override
    public void getProcesser() {
     pro.getType();
    }
}
